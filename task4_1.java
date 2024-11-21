package task4;

public class task4_1 {

	public static void main(String[] args) {
	
		// Custom exception for age range
		class AgeNotWithinRangeException extends Exception {
		    public AgeNotWithinRangeException(String message) {
		        super(message);
		    }
		}

		// Custom exception for name validity
		class NameNotValidException extends Exception {
		    public NameNotValidException(String message) {
		        super(message);
		    }
		}

		// Student class with validations
		class Student {
		    private int rollNo;
		    private String name;
		    private int age;
		    private String course;

		    // Constructor to initialize attributes with validation
		    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
		        this.rollNo = rollNo;
		        setName(name); // Set name with validation
		        setAge(age); // Set age with validation
		        this.course = course;
		    }

		    // Setter method for age with validation
		    public void setAge(int age) throws AgeNotWithinRangeException {
		        if (age < 15 || age > 21) {
		            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21).");
		        }
		        this.age = age;
		    }

		    // Setter method for name with validation
		    public void setName(String name) throws NameNotValidException {
		        if (!name.matches("[a-zA-Z ]+")) { // Only allows alphabets and spaces
		            throw new NameNotValidException("Name contains invalid characters. Only alphabets and spaces are allowed.");
		        }
		        this.name = name;
		    }

		    // Getter methods
		    public int getRollNo() {
		        return rollNo;
		    }

		    public String getName() {
		        return name;
		    }

		    public int getAge() {
		        return age;
		    }

		    public String getCourse() {
		        return course;
		    }
		}

		// Test class
		class Main {
		    public static void main(String[] args) {
		        try {
		            // Creating a student with valid data
		            Student student1 = new Student(101, "John Doe", 18, "Computer Science");
		            System.out.println("Student 1 created: " + student1.getName());

		            // Creating a student with invalid age
		            Student student2 = new Student(102, "Alice", 25, "Physics");
		            System.out.println("Student 2 created: " + student2.getName());
		            
		        } catch (AgeNotWithinRangeException | NameNotValidException e) {
		            System.out.println("Error: " + e.getMessage());
		        }

		        try {
		            // Creating a student with invalid name
		            Student student3 = new Student(103, "Bob123", 20, "Mathematics");
		            System.out.println("Student 3 created: " + student3.getName());

		        } catch (AgeNotWithinRangeException | NameNotValidException e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		}


	}

}

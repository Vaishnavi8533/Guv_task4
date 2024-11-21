package task4;

public class task4_2 {

	public static void main(String[] args) {
		
		// User-defined exception for invalid voter age
		class InvalidVoterAgeException extends Exception {
		    public InvalidVoterAgeException(String message) {
		        super(message);
		    }
		}

		// Voter class
		class Voter {
		    private int voterId;
		    private String name;
		    private int age;

		    // Parameterized constructor
		    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
		        if (age < 18) {
		            throw new InvalidVoterAgeException("Invalid age for voter");
		        }
		        this.voterId = voterId;
		        this.name = name;
		        this.age = age;
		    }

		    // Display voter details
		    public void display() {
		        System.out.println("Voter ID: " + voterId);
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		    }
		}

		// Main class to test the program
		class VoterManagement {
		    public static void main(String[] args) {
		        try {
		            // Test case 1: Valid voter
		            Voter voter1 = new Voter(101, "John Doe", 25);
		            voter1.display();
		            System.out.println();

		            // Test case 2: Invalid voter (age less than 18)
		            Voter voter2 = new Voter(102, "Jane Doe", 16);
		            voter2.display();

		        } catch (InvalidVoterAgeException e) {
		            System.out.println("Exception: " + e.getMessage());
		        }
		    }
		}


	}

}

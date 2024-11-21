package task4;


import java.util.HashMap;
import java.util.Scanner;


public class task4_4 {
		    // HashMap to store student names and grades
		    private HashMap<String, Integer> studentGrades = new HashMap<>();

		    // Method to add a new student and their grade
		    public void addStudent(String name, int grade) {
		        studentGrades.put(name, grade);
		        System.out.println("Student " + name + " with grade " + grade + " added successfully.");
		    }

		    // Method to remove a student by name
		    public void removeStudent(String name) {
		        if (studentGrades.containsKey(name)) {
		            studentGrades.remove(name);
		            System.out.println("Student " + name + " removed successfully.");
		        } else {
		            System.out.println("Student " + name + " does not exist.");
		        }
		    }

		    // Method to display a student's grade by name
		    public void displayGrade(String name) {
		        if (studentGrades.containsKey(name)) {
		            System.out.println("Grade of " + name + " is: " + studentGrades.get(name));
		        } else {
		            System.out.println("Student " + name + " not found.");
		        }
		    }

		    // Main method to test the program
		    public static void main(String[] args) {
		        task4_4 studentGradesManager = new task4_4();
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\nChoose an option:");
		            System.out.println("1. Add Student");
		            System.out.println("2. Remove Student");
		            System.out.println("3. Display Student Grade");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline character

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter student name: ");
		                    String name = scanner.nextLine();
		                    System.out.print("Enter student grade: ");
		                    int grade = scanner.nextInt();
		                    studentGradesManager.addStudent(name, grade);
		                    break;

		                case 2:
		                    System.out.print("Enter student name to remove: ");
		                    String removeName = scanner.nextLine();
		                    studentGradesManager.removeStudent(removeName);
		                    break;

		                case 3:
		                    System.out.print("Enter student name to display grade: ");
		                    String displayName = scanner.nextLine();
		                    studentGradesManager.displayGrade(displayName);
		                    break;

		                case 4:
		                    System.out.println("Exiting the program. Goodbye!");
		                    scanner.close();
		                    return;

		                default:
		                    System.out.println("Invalid choice! Please choose a valid option.");
		            }
		        }
		    }
		}



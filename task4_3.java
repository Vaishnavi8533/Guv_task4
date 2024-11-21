package task4;

import java.util.Scanner;

public class task4_3 {

	public static void main(String[] args) {
		
		
		        // Array of weekdays
		        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

		        // Scanner to get input from user
		        Scanner scanner = new Scanner(System.in);

		        try {
		            // Ask the user for a day index
		            System.out.print("Enter the day index (0-6): ");
		            int dayIndex = scanner.nextInt();

		            // Print the corresponding day name
		            System.out.println("The day is: " + weekdays[dayIndex]);

		        } catch (ArrayIndexOutOfBoundsException e) {
		            // Handle invalid index input
		            System.out.println("Invalid day index! Please enter a number between 0 and 6.");
		        } catch (Exception e) {
		            // Handle any other exceptions (e.g., input mismatch)
		            System.out.println("Invalid input! Please enter a valid integer.");
		        } finally {
		            // Close the scanner
		            scanner.close();
		        }
		    }
		}

	
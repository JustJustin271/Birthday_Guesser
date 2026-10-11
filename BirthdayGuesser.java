import java.util.Scanner;

/**
 * Creates a program to guess the day of the month the user's birthday based on whether they
 * are within the set of numbers.
 * @author 
 * @version JavaSE-21
 * Created on: October 7th, 2026
 */

public class Birthday {
  
	/**
	 * 
	 * Interprets the response given by the user to either be true or false
	 * 
	 * @param response Strings given by the user when responding whether their number appears
	 * within the set of the numbers corresponding to yes and no
	 * @return true if the response is "y" or "Y"; false for "n", "N", or any other input
	 */

	
	public static boolean responseInterpretation(String response) {
		return (response.equalsIgnoreCase("y"));
	}

	/**
	 * 
	 * Takes in booleans representing place values in a binary value 
	 * And converts those place values (binary) into a integer
	 * 
	 * @param placeOne Ones place in binary 
	 * @param placeTwo Twos place in binary
	 * @param placeFour Fours place in binary
	 * @param placeEight Eights place in binary
	 * @param placeSixteen Sixteens place in binary
	 * 
	 * @return An integer corresponding to the boolean digits in binary converted to base 10
	 */
	
	public static int binary(boolean placeOne, boolean placeTwo, boolean placeFour, boolean placeEight, boolean placeSixteen) {
        
		int result = 0;
		
		if (placeOne) {
			result += 1;
		}

		if (placeTwo) {
			result += 2;
        }
            
		if (placeFour) {
			result += 4;
		}

		if (placeEight) {
			result += 8;
		} 

		if (placeSixteen) {
			result += 16;
		}
            
		return result;
	}

	/**
	 * 
	 * Begins the execution of the guessing game here
	 * Gives the user a given question and a corresponding string of a list
	 * Takes in the responses and uses methods defined earlier to convert
	 * Strings into booleans and booleans into an integer
	 * 
	 * @param args Standard command-line configuration arguments (not utilized)
	 * 
	 */
	
	public static void main(String[] args) {

		// Initialized scanner
		Scanner scan = new Scanner(System.in);

		// Defines questions and the set of the numbers
		String question = "Is your birthday in this set? ";

		String set1 = "Set 1: 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31";
		String set2 = "Set 2: 2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31";
		String set3 = "Set 3: 4 5 6 7 12 13 14 15 20 21 22 23 28 29 30 31"; 
		String set4 = "Set 4: 8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31";
		String set5 = "Set 5: 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";

		// Begins the game
		System.out.println("Welcome to the Guess the Birthday Game!");

		System.out.println("Answer Y for Yes and N for No.\n");

		
		// === Gives out the question sets and string of numbers 
		System.out.println(set1);
		System.out.println(question);
		boolean onesPlace = responseInterpretation(scan.nextLine());	

            
		System.out.println(set2);
		System.out.println(question);
		boolean twosPlace = responseInterpretation(scan.nextLine());


		System.out.println(set3);
		System.out.println(question);
		boolean foursPlace = responseInterpretation(scan.nextLine());


		System.out.println(set4);
		System.out.println(question);
		boolean eightsPlace = responseInterpretation(scan.nextLine());


		System.out.println(set5);
		System.out.println(question);
		boolean sixteensPlace = responseInterpretation(scan.nextLine());

            
		System.out.println("");

		//Converts the given binary responses into an integer for the day of the user's birthday
		int day = binary(onesPlace, twosPlace, foursPlace, eightsPlace, sixteensPlace);

		// Outputs the result
		System.out.println("Your birthday is " + day + "!");

		//Closes the scanner
		scan.close();
	}
}

/*
 * Create a new object of type Scanner that reads from the keyboard
Create a new movie object
Prompt the user to enter the title of a movie 
Read in the line that the user types
Set the title in the movie object
Prompt the user to enter the movie’s rating
Read in the line that the user types
Set the rating in the movie object
Prompt the user to enter the number of tickets sold at a (unnamed) theater
Read in the integer that the user types
Set the number of tickets sold in the movie object
Print out the information using the movie’s toString method
 */

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		Movie movieObject = new Movie();
		System.out.println("Enter the name of the movie");
		String titleInput = scanner.next();
		movieObject.setTitle(titleInput);
			
		System.out.println("Enter the rating of the movie");
		String ratingInput = scanner.next();
		movieObject.setRating(ratingInput);
			
		System.out.println("Enter the number of tickets sold for this movie");
		int ticketsInput = scanner.nextInt();
		movieObject.setSoldTickets(ticketsInput);
		System.out.println(movieObject.toString());
			
		System.out.println("Do you want to enter another movie? (yes/no)");
        String continueInput = scanner.next();


         if (!continueInput.equalsIgnoreCase("yes")) {
             break; 
         }
     }

     System.out.println("Goodbye");
     scanner.close();
 }}
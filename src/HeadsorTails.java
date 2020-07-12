
import java.util.Scanner;
import java.util.Random;

public class HeadsorTails {

	public static void main(String[] args) {
		
		int heads = 0;
		int tails = 0;
		
										
		Scanner scnr = new Scanner(System.in);
		System.out.println("Guess which will have more: heads or tails");	
		
		String headsOrTailsGuess = scnr.nextLine();
		
		if (headsOrTailsGuess.equalsIgnoreCase ("heads")) {
			System.out.println("How many times shall we flip a coin?");
		}
		else if (headsOrTailsGuess.equalsIgnoreCase ("tails")) {
			System.out.println("How many times shall we flip a coin?");
		}
		else {
			System.out.println("Please restart the program and choose only heads or tails"); 	
		}
		
		
		int numberOfFlips = scnr.nextInt();
		
	
		for (int i = 1;  i <= numberOfFlips; i++) {
			
			 	
				if (Math.random() < 0.5)
	            {
	            System.out.println("Heads");
	            heads++;	        
	            }
				else{
	            System.out.println("Tails");
	            tails++;              
				}
		}
	
		int h = (heads*100 / numberOfFlips);
		int t = (tails*100 / numberOfFlips);
		
		if (headsOrTailsGuess.equalsIgnoreCase ("heads")) {
			System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + heads + " time(s)"); 	
			System.out.println("That's " + h + "%"); 
		}
		else if (headsOrTailsGuess.equalsIgnoreCase ("tails")) {
			System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + tails + " time(s)"); 	
			System.out.println("That's " + t + "%"); 
		}
	}
}



	



/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Sept 2018
 * Created for: ICS4U
 * This program has a procedure that randomly generates a number between 1
 * and the max value and then places the value in the console
 *
 ****************************************************************************/
import java.util.*;


public class RollDie {

	public static void main(String[] arg) {
		
		int maxValue;
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Input a positive integer for the max value: ");
		maxValue = userInput.nextInt();
		
		RollDie(maxValue);
				
	}
	
	public static int RollDie(int maxValue) {
		//returns randInt
		if(maxValue < 1) {
			System.out.print("-1");
			return -1;
			
		}
		else if(maxValue == 1) {
			System.out.print("1");
			return 1;
		}
		else {
			Random randGen = new Random();
			
			int randNum;
			
			randNum = randGen.nextInt(maxValue) + 1;
			
			System.out.print("Your number is " + randNum + ".");
			return randNum;
		}
		
	}

}
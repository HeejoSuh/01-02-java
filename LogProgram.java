/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Feb 2018
 * Created for: learning
 * 
 * This program calculates the number of logs that will fit on a truck,
 *     if you know their length
 *
 ****************************************************************************/


//have to import the following in order to use the reader:

import java.util.Scanner;


//****************************************************************************
public class LogProgram {
	
	public static void main(String[] args) {
		//Calculate the maximum number of logs the truck can carry
		
		//set up a scanner to get the response from the user
    	Scanner scanner = new Scanner(System.in);
		
		//input is default
		String input = null;
		//define constants
		double logWeigh= 20, truckCanCarry= 1100;// kg/m , kg total
		//initialize to default
		double numberOfLogsCanCarry=0, lengthOfLog=0; 
				
		
		while (lengthOfLog!=0.25 && lengthOfLog!=0.5 && lengthOfLog!= 1) {
			//keep asking for input
			System.out.println("Input the length of your logs (0.25 m, 0.5 m or 1m): ");
			
			//Get input as a string value------------------------------------
			input = scanner.nextLine();
			
			//check if response if a number:----------------------------------
			try {
				
				//Convert string to double
				lengthOfLog = Double.parseDouble(input);
				//여기 안에다 할거 넣으면 operate 됨.
				
				//check if appropriate response has been collected-----------
				if (lengthOfLog==0.25 || lengthOfLog==0.5 || lengthOfLog== 1){
					//calculate
					numberOfLogsCanCarry= truckCanCarry / ( logWeigh * lengthOfLog );
					System.out.println("Maximum number of logs the truck can carry: " 
		    				+ numberOfLogsCanCarry);
				}else {
					//not correct format
					System.out.println("ERROR:\nValid input can be 0.25, 0.5, or 1. TRY AGAIN. \n\n");
				}
				
			} catch (NumberFormatException stringInput) {
				//if not number then
				System.out.println("ERROR:\nPut in a numeric value. TRY AGAIN. \n\n");
				break; //break out of while function so does not display 2 error messages
			}
			
		}
		
		
	}//closing for public static void main
}//closing for public class LogProgram


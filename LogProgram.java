/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Feb 2018
 * Created for: learning
 * 
 * This program calculates the number of logs that will fit on a truck,
 *     if you know their length
 *     
 *
 ****************************************************************************/



//have to import the following in order to use the scanner:
import java.util.Scanner;

//****************************************************************************
public class LogProgram {

    public static void main(String[] args) {
    	//set up a scanner to get the response from the user
    	Scanner scanner = new Scanner(System.in);
    	
    	//set length of log to a random default
    	//float = decimal with less places
        float lengthOfLog=0;
    	
        
        //while appropriate response has not been collected
    	while (lengthOfLog!=0.25 && lengthOfLog!=0.5 && lengthOfLog!= 1) {
    		
    		//keep asking for input
    		System.out.print("Input the length of your logs (0.25 m, 0.5 m or"
    				+ " 1m): ");
    	
    		//set new length of log
        	lengthOfLog = scanner.nextFloat();
    		
    			//if appropriate response has been collected
    			if (lengthOfLog==0.25 || lengthOfLog==0.5 || lengthOfLog== 1)
    			{

    				//define constants
    				int logWeigh= 20, truckCanCarry= 1100; ////kg/m , kg total
    				//calculate
    				float numberOfLogsCanCarry= truckCanCarry / ( logWeigh * 
    						lengthOfLog );
    				
    				
    				System.out.println("Number of logs the truck can carry: " 
    				+ numberOfLogsCanCarry);
    			
    			//else if wrong input
    			}else {
    				System.out.println("                  ERROR:\nValid input"
    						+ " can be 0.25, 0.5, or 1. TRY AGAIN. \n\n");
    				
    			}//closing for if
    			
    	}//closing for while
    }//closing for public static void main
}//closing for public class LogProgram
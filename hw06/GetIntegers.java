//Emily Wilkinson
//
// Get Integers Program
//

//import scanner
import java.util.Scanner;
// class
public class GetIntegers {
// add main method
    public static void main (String[] args) {
        
//declare scanner
    Scanner myScanner = new Scanner(System.in);
//prompt for user input
    System.out.println("Please enter 5 non-negative integers: ");

//declare un ununu
    int userInput;
    int sum = 0;
    int count;
    
//for loop
    for (count = 0; count < 5; count++) {
        while (!myScanner.hasNextInt()){
            myScanner.next();
            System.out.println(" Invalid input, enter again. ");
        }//end while loop
        userInput = myScanner.nextInt();
        sum += userInput;
    }// end for loop
    System.out.println(" Sum is: "+sum);
/* System.out.println(" Invalid input, enter again. "); */

    }// end main method
} //end class
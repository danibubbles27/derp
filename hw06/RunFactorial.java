//Emily Wilkinson
//
//Run Factorial Program
//
//compile and run program
//
//import scanner
import java.util.Scanner;

//define class
public class RunFactorial {
    
//  add main method
    public static void main (String[] args) {
        
//  declare scanner
    Scanner myScanner = new Scanner (System.in);
    
//  user input
    System.out.println(" Please enter an integer that is between 9 and 16: ");

//  variable declaration
    int count = 0;
    int userInput;
    int factorial = 0;
    
   // for (count=0;count > 8 && count < 17; count--){
        userInput = myScanner.nextInt();
        while (userInput <=8 || userInput >=17) {
         //   myScanner.next();
            System.out.println(" Invalid input, enter again! ");
            userInput = myScanner.nextInt();
        }//end while loop
        count = userInput;
        factorial =userInput;
        while (count > 1){
            factorial = factorial *(count -1);
            count--;
            }//end while loop
        System.out.println(" Input accepted: ");
        System.out.println(factorial);
    //}//end for loop
    }//end main method
}//end class
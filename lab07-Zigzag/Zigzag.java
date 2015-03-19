//Emily Wilkinson

// Zigzag program

//import scanner
import java.util.Scanner;

//define class
public class Zigzag {
    
//  add main method
    public static void main (String[] args) {
    
//  variable declaration
    int count = 0;
    int nStars = 10;

// declare scanner
    Scanner myScanner = new Scanner (System.in);

// user input
    System.out.print("Enter an int between 3 and 33: ");

// STEP ONE
/*    while (count <= nStars) {
        System.out.print("*");
        count++;
    }//end while loop
    System.out.println(" ");
*/
//  STEP TWO
    String temp = "";
    for(count = 0; count < 10; count++){
        for(int nSpaces = 0; nSpaces < count; nSpaces++){
            temp = temp + "*";
        }//end for loop
        System.out.println(temp);
    }//end for loopfucku
    System.out.println(" ");
    
//  STEP THREE/FOUR -repeat #1 
    
   // initialize nStars to some value outside the range [3,33], e.g., -1
    int nStars = myScanner.nextInt();
// control outside loop by testing whether nStars is outside the range [3,33]
    while (nStars )
//    inside this loop…(A)
//       prompt user 
//       nested loop (B) conditioned by whether  user has entered an int (!hasNextInt())
//          inside loop (B)
//              use next() to get rid of junk
//              prompt user again
//          exit loop (B) when hasNextInt() returns true
//     exit  loop (A), when an int has been entered and the int is in the range [3, 33]
//    now that you have exited with an int between 3 and 33 execute the loop to display
//     the stars
    
    }//end main method
}//end class

//Emily Wilkinson
//
//  compile program
//      javac Root.java
//  run program
//      java Root
//  import scanner
    import java.util.Scanner;
    
//define class
public class Root{

//  add main method
    public static void main(String[] args) {
        
//promt for a double
//print crude guess of est. cube root of the input number
//print value of guess when cubed

//declare scanner
    Scanner myScanner;
//construct scanner
    myScanner = new Scanner ( System.in );
//prompt double
    System.out.print(
        " Enter number (an integer without a exact cube root): ");
        double x = myScanner.nextDouble();
        
//print output
    double guess = (x/3);
    double guessOne = (2*guess*guess*guess+x)/(3*guess*guess);
    double guessTwo = (2*guessOne*guessOne*guessOne+x)/(3*guessOne*guessOne);
    double guessThree = (2*guessTwo*guessTwo*guessTwo+x)/(3*guessTwo*guessTwo);
    double guessFour = (2*guessThree*guessThree*guessThree+x)/(3*guessThree*guessThree);
    double guessFive = (2*guessFour*guessFour*guessFour+x)/(3*guessFour*guessFour);
    
//print statement
    System.out.println(" Print final estimate is "+guessFive+" : ");
    System.out.println(guessFive+"*"+guessFive+"*"+guessFive+"="+guessFive*guessFive*guessFive);
    
    }
    
}
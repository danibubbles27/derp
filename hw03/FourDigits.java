//Emily Wilkinson
//
//  compile program
//  javac FourDigits.java
//  run program
//  java FourDigits
//  import scanner
    import java.util.Scanner;
    
//define class
public class FourDigits{
    
//  add main method
    public static void main(String[] args) {
        
//prompt user for double
//print first four digits to right of the decimal point

//declare scanner
    Scanner myScanner;
//construct scanner
    myScanner = new Scanner ( System.in );
//prompt for double
    System.out.print(
        "Enter a double and I display the four digits to the right of the decimal point- ");
        double number = myScanner.nextDouble();
        
//calculate four digits
//  change to whole #
    number *= 10000;
    int fourDigits;
//  eliminate unnecessary decimals
    fourDigits = (int)(number);
//  reform decimal number w/ correct # of digits
    fourDigits /= 10000;
//  achieve correct decimal number
    String Digits = String.format (" %04d " , fourDigits);
        
//print output
    System.out.println(" The four digits are "+Digits+" . ");
        
    }
}
//Emily Wilkinson
//
//  Decimal to Hexadecimal Converter program
//
//  import scanner
import java.util.Scanner;

//  define class
public class ToHex {
    
//  add main method
    public static void main (String[] args) {
        
//  declare scanner
    Scanner myScanner = new Scanner (System.in);

//  declare decimal values 
    int value1;
    int value2;
    int value3;

//  user input
    System.out.print(" Please enter three numbers representing RGB values: ");
    int userInput = myScanner.nextInt();
    value1 = userInput;
    value2 = userInput;
    value3 = userInput;
    
//  red pixel check if integer and within range
    if (myScanner.hasNextInt()) {
    }//end if statement
    else{
        System.out.println("Sorry, your input must consist of integers. ");
    }//end else statement
    if ( userInput <= 0 || userInput >= 255 ){
        System.out.println(" Sorry, you must enter values between 0-255. ");
    }//end if statement
    else{
        System.out.println(" Sorry, you must enter values between 0-255. ");
        return;
    }//end else statement
    
//  green pixel check if integer and within range
    if (myScanner.hasNextInt()) {
    }//end if statement
    else{
        System.out.println("Sorry, your input must consist of integers. ");
    }//end else statement
    if ( userInput <= 0 || userInput >= 255 ){
        System.out.println(" Sorry, you must enter values between 0-255. ");
    }//end if statement
    else{
        System.out.println(" Sorry, you must enter values between 0-255. ");
        return;
    }//end else statement
    
//  blue pixel check if integer and within range
    if (myScanner.hasNextInt()) {
    }//end if statement
    else{
        System.out.println("Sorry, your input must consist of integers. ");
    }//end else statement
    if ( userInput <= 0 || userInput >= 255 ){
        System.out.println(" Sorry, you must enter values between 0-255. ");
    }//end if statement
    else {
        System.out.println(" Sorry, you must enter values between 0-255. ");
        return;
    }//end else statement

    String output = "";
    int remainder1, remainder2, remainder3, remainder4, remainder5, remainder6;

//  declare hexadecimal variables
    remainder1 = value1 / 16;
    remainder2 = value1 % 16;
    remainder3 = value2 / 16;
    remainder4 = value2 % 16;
    remainder5 = value3 / 16;
    remainder6 = value3 % 16;

//  convert to hexadecimal
    switch (remainder1){
            case 10:
                output += "A";
                break;
            case 11:
                output += "B";
                break;
            case 12:
                output += "C";
                break;
            case 13:
                output += "D";
                break;
            case 14:
                output += "E";
                break;
            case 15:
                output += "F";
                break;
            default:
                output += remainder1;
        }//end switch statement
    switch (remainder2){
            case 10:
                output += "A";
                break;
            case 11:
                output += "B";
                break;
            case 12:
                output += "C";
                break;
            case 13:
                output += "D";
                break;
            case 14:
                output += "E";
                break;
            case 15:
                output += "F";
                break;
            default:
                output += remainder2;
        }//end switch statement
    switch (remainder3){
            case 10:
                output += "A";
                break;
            case 11:
                output += "B";
                break;
            case 12:
                output += "C";
                break;
            case 13:
                output += "D";
                break;
            case 14:
                output += "E";
                break;
            case 15:
                output += "F";
                break;
            default:
                output += remainder3;
        }//end switch statement
    switch (remainder4){
            case 10:
                output += "A";
                break;
            case 11:
                output += "B";
                break;
            case 12:
                output += "C";
                break;
            case 13:
                output += "D";
                break;
            case 14:
                output += "E";
                break;
            case 15:
                output += "F";
                break;
            default:
                output += remainder4;
        }//end switch statement
    switch (remainder5){
            case 10:
                output += "A";
                break;
            case 11:
                output += "B";
                break;
            case 12:
                output += "C";
                break;
            case 13:
                output += "D";
                break;
            case 14:
                output += "E";
                break;
            case 15:
                output += "F";
                break;
            default:
                output += remainder5;
        }//end switch statement
    switch (remainder6){
            case 10:
                output += "A";
                break;
            case 11:
                output += "B";
                break;
            case 12:
                output += "C";
                break;
            case 13:
                output += "D";
                break;
            case 14:
                output += "E";
                break;
            case 15:
                output += "F";
                break;
            default:
                output += remainder6;
        }//end switch statement
    
//  print hexadecimal
    System.out.println(" The decimal numbers R:"+value1+", G:"+value2+", B:"+value3+", is represented in hexadecimal as: "+output+".");
    }//end main method
}//end class
   
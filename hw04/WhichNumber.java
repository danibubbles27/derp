//Emily Wilkinson
//
//Which Number program
//
//  compile program
//  javac WhichNumber.java
//
//  run program
//  java WhichNumber
//
//  import scanner
    import java.util.Scanner;
    
//  define class
    public class WhichNumber{

//  add main method
    public static void main (String[] args) {
        
//  declare scanner
    Scanner myScanner;
//  construct scannner
    myScanner = new Scanner ( System.in );
//  prompt for int between 1, 10 inclusive
    int number = (int)(10*Math.random()+1);
        System.out.println(" Think of a number between 1 and 10 inclusive. ");
//  questions:

    System.out.println(" Is the number even? ");
    if (myScanner.next().equalsIgnoreCase("Y")){
        System.out.println("Is it divisible by 3? ");
        if (myScanner.next().equalsIgnoreCase("Y")){
            System.out.println(" Is your number 6? ");
        }
        else{
            System.out.println(" Is it divisible by 4? ");
            if (myScanner.next().equalsIgnoreCase("Y")){
                System.out.println("Is the number divided by 4 greater than 1? ");
                if (myScanner.next().equalsIgnoreCase("Y")){
                    System.out.println(" Is your number 8? ");
                }
                else{
                    System.out.println(" Is your number 4? ");
                }
            }
            else{
                System.out.println(" Is it divisible by 5? ");
                if (myScanner.next().equalsIgnoreCase("Y")){
                    System.out.println(" Is your number 10? ");
                }
                else{
                    System.out.println(" Is your number 2? ");
                }
            }
            }
        }
    else{
        System.out.println(" Is it divisible by 3? ");
        if (myScanner.next().equalsIgnoreCase("Y")){
            System.out.println(" When divided by 3 is the result greater than 1?");
            if (myScanner.next().equalsIgnoreCase("Y")){
                System.out.println(" Is your number 9? ");
            }
            else{
                System.out.println(" Is your number 3? ");
            }
        }
        else{
            System.out.println(" Is it greater than 6? ");
            if (myScanner.next().equalsIgnoreCase("Y")){
                System.out.println(" Is your number 7? ");
            }
            else{
                System.out.println(" Is it less than 3? ");
                if (myScanner.next().equalsIgnoreCase("Y")){
                    System.out.println(" Is your number 1? ");
                }
                else{
                    System.out.println(" Is your number 5? ");
                }
            }
        }
        
    }

    }
    }
        

//Emily Wilkinson
//
//Big Mac Java Program
//
//  first compile program
//      javac BigMac.java
//  run program
//      java BigMac
//  
//  import Scanner
    import java.util.Scanner;
    
//  define class
public class BigMac{
            
//  add main method
    public static void main(String[] args) {
        
//  compute cost of buying Big Macs
//  using Scanner class
//  print total cost

//  declare scanner
    Scanner myScanner;
//  Scanner construction
    myScanner = new Scanner ( System.in );
//  prompt for number of tickets
    System.out.print(
        " Enter the number of Big Macs (an integer > 0): ");
//  accept user input
    int nBigMacs = myScanner.nextInt();
    
    System.out.print(
        " Enter the cost per Big Mac as "+" a double (in the form xx.xx): ");
    double bigMac$ = myScanner.nextDouble();
    System.out.print(
        " Enter the % tax as a whole # (xx): ");
    double taxRate = myScanner.nextDouble();
    taxRate/=100; 
    
//print output
    double cost$;
    int dollars, dimes, pennies;
    
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    dollars = (int) cost$;
    dimes = (int) (cost$*10)%10;
    pennies = (int) (cost$*100)%10;
    
    System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"
    +bigMac$+" per Big Mac, with a sales tax of "+(int)(taxRate*100)+
    "%, is $"+dollars+'.'+dimes+pennies);
    
        }
}
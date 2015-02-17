//Emily Wilkinson
//
//  Banking program
//  
//  compile program
//  javac Banking.java
//  run program
//  java Banking
//
//  import scanner
    import java.util.Scanner;
    
//  define class
public class Banking{
        
//  add main method
    public static void main (String[] args){

//  declare Scanner
    Scanner myScanner;
//  construct scanner
    myScanner = new Scanner (System.in );
//  generate random amount in banking acct
    int randomAmt = (int)(5000*Math.random()+1000);
    int balance =randomAmt;
    int choice = 10;
    String userInput;
//  prompt regarding money
    System.out.println("Your balance is $"+balance+".");
    System.out.println("Do you want to deposit money, withdraw money, or view your balance?");
    System.out.println("Please type: 'deposit' or 'withdraw' or 'view balance' ");
    userInput = myScanner.next();
    if (userInput.equalsIgnoreCase("deposit")){
        choice = 0;
    }
    else if (userInput.equalsIgnoreCase("withdraw")){
        choice = 1;
    }
    else if (userInput.equalsIgnoreCase("view balance")){
        choice = 2;
    }
    switch (choice){
        case 0:
            System.out.println(" How much do you wish to deposit? ");
            int userDeposit = myScanner.nextInt();
            if(userDeposit <= 0){
                System.out.println(" Please enter an amount greater than 0. ");
                userDeposit = myScanner.nextInt();
            }
            if(userDeposit > 0){
                balance = randomAmt+userDeposit;
                System.out.println(" Your new balance is $"+balance+".");
            }
            break;
        case 1:
            System.out.println(" How much do you wish to withdraw? ");
            int userWithdraw = myScanner.nextInt();
            if (userWithdraw > balance){
                System.out.println("Please do not withdraw greater than your balance $"+balance+".");
                userWithdraw = myScanner.nextInt();
            }
            if (userWithdraw <= balance);{
                balance = randomAmt - userWithdraw;
                System.out.println("Your remaining balance is $"+balance+".");
            }
            break;
        case 2:
            System.out.println("Your balance is $"+balance+".");
        default: 
            System.out.println(" Invalid number: Please enter a valid answer ");
    }
    
    }
}
    
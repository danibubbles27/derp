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
    import java.util.scanner;
    
//  define class
public class Banking{
        
//  add main method
    public static main (String[] args){

//  declare Scanner
    Scanner myScanner;
//  construct scanner
    myScanner = new Scanner (System.in );
//  generate random amount in banking acct
    int randomAmt = (int)(5000*Math.random()+1000);
//  prompt regarding money
    System.out.println("Do you want to deposit money, withdraw money, or view your balance?");
    System.out.println("Please type: 'deposit' or 'withdraw' or 'balance' ");
    boolean deposit, withdraw, balance;
    switch (deposit){
        case 1:
            System.out.println(" How much do you wish to deposit? ");
            int valDeposit = myScanner.nextDouble();
            break;
        case 2:
            System.out.println(" Please enter a number > 0 ");
            break;
    }
    
    }
}
    
//Emily Wilkinson
//
//  Cookies java program
// 
//  compile program
//  javac Cookies.java
//
//  run program
//  java Cookies
//
//  import scanner
    import java.util.scanner;
    
//  define class
    public class Cookies{
        
//  add main method
    public static void main (String[] args) {
        
//  bring cookies to event
//  use scanner to obtain number of cookies desired
//  how many people they are buying for
//  how many cookies each person gets
//  valid inputs?
//  determine # cookies -evenly divisible? enough for everyone

//  declare scanner
    Scanner myScanner;
//  construct scanner
    myScanner = new Scanner ( System.in );
//  prompt for # of people
    System.out.print(
            " Enter the number of people: ");
    if (myScanner.hasNextInt()){
    int nPeople = myScanner.nextInt();
    }
    else if (nPeople <= 0) {
        System.out.println(" You did not enter an int > 0 ");
        return;
    }
    else (nPeople != int) {
        System.out.println("You did not enter an int");
//      leave program (terminates)
        return;
    }
//  prompt number of cookies buying
    System.out.println(" Enter the number of cookies you are planning to buy: ");
    if (myScanner.hasNextInt()){
    int buyCookies = myScanner.nextInt();
    }
    else if (buyCookies <= 0) {
        System.out.println("You did not enter an int > 0 ");
        return;
    }
    else (buyCookies != int) {
        System.out.println("You did not enter an int");
        return;
    }
//  prompt cookies per person
    System.out.print(
        " How many cookies do you want each person to get? ");
    if (myScanner.hasNextInt()) {
    int nCookies = myScanner.nextInt();
    }
    else if (nCookies <= 0) {
        System.out.println("You did not enter an int > 0 ");
        return;
    }
    else (nCookies != int ) {
        System.out.println("You did not enter an int");
        return;
    }
     
    int moreCookies = 0;
//  arithmetic
//  determine # cookies -evenly divisible? enough for everyone
    if (buyCookies > nCookies*nPeople){
        System.out.print(
            "You have enough, but they will not divide evenly.");
    }
        else if (buyCookies == nCookies*nPeople){
            System.out.print(
                "You have enough cookies for each person and the amount will divide evenly.")
        }
    if (buyCookies < nCookies*nPeople){
        moreCookies = nCookies*nPeople - buyCookies;
        System.out.print(
            "You will not have enough cookies. You need to buy at least "+moreCookies+" more.");
    }
    }
}
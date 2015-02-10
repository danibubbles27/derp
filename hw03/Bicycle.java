//Emily Wilkinson
//
//  compile program
//      javac Bicycle.java
//  run program
//      java Bicycle
//  import scanner
    import java.util.Scanner;
    
//  define class
public class Bicycle{

//  add main method
    public static void main(String[] args) {

//compute distance traveled by bicycle
//using Scanner class
//print distance and avg mph

//  declare scanner
    Scanner myScanner;
//  construct scanner
    myScanner = new Scanner ( System.in );
//  promt for number of counts on cyclometer
    System.out.print(
        " Enter the number of counts (an integer > 0): ");
//  accept user input
    int nCounts = myScanner.nextInt();
    
// prompt for # secs
    System.out.print(
        " Enter the number of seconds (an integer > 0): ");
    double nSecs = myScanner.nextDouble();
    
    double wheelDiameter = 27.0,
    PI = 3.14159,
    feetPerMile = 5280,
    inchesPerFoot = 12,
    secPerMin = 60,
    minPerHour = 60;
    
    double distTrip;
    distTrip = nCounts*wheelDiameter*PI;
//  ^ yields dist in inches
    distTrip/=inchesPerFoot*feetPerMile;
//  ^ yields dist in miles

//  compute traveling time
    double nMin;
    nMin = nSecs/secPerMin;
    
//  compute miles per hour
    double milesPerHour;
    milesPerHour = distTrip/nMin*minPerHour;
    
// print output
    System.out.printf(" The distance traveled was %.2f and took %.2f\n minutes. " , (int)(distTrip*100)/100.0, nMin);
    System.out.printf(" The average mph was %.2f. " , (int)(milesPerHour*100)/100.0);

    
    }
    
}
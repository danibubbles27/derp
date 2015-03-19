//Emily Wilkinson
//
//Cyclometer Java Program
//
//  first compile program
//      javac Cyclometer.java
//  run program
//      java Cyclometer//

//  define class
public class Cyclometer {
    
//  add main method
    public static void main(String[] args) {
        
//  print number min for each trip
//  print number counts (RPM) for each trip
//  print dist. each trip mi.
//  print dist. for two trips combined

//  input data
    int secTrip1=480;
    int secTrip2=3220;
    int countsTrip1=1561;
    int countsTrip2=9037;
    
//  intermediate variables, output data
    double wheelDiameter=27.0,
    PI=3.14159,
    feetPerMile=5280,
    inchesPerFoot=12,
    secPerMin=60;
    double distTrip1, distTrip2, totalDist;
    
//  print numbers stored in variables with sec and counts
    System.out.println("Trip 1 took: "+(secTrip1/secPerMin)+" minutes and had "+
    countsTrip1+" counts.");
    System.out.println("Trip 2 took: "+(secTrip2/secPerMin)+" minutes and had "+
    countsTrip2+" counts.");
    
//  run calcs; store vals. Doc. your calcs 
    distTrip1=countsTrip1*wheelDiameter*PI;
    distTrip1/=inchesPerFoot*feetPerMile;
    distTrip2=countsTrip2*wheelDiameter*PI;
    distTrip2/=inchesPerFoot*feetPerMile;
    totalDist=distTrip1+distTrip2;

//  print output data
    System.out.println("Trip 1 was "+distTrip1+" miles");
    System.out.println("Trip 2 was "+distTrip2+" miles");
    System.out.println("Total dist was "+totalDist+" miles");

    }
}
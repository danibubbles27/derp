//Emily Wilkinson
//
//Arithmetic Java Program
//
//  compile program
//      javac Arithmetic.java
//  run program
//        java Arithmetic

//  define class
public class Arithmetic{
    
// add main method
    public static void main(String[] args) {
        
//  print item bought
//  how much of item being bought
//  cost per item

    int nSocks=3;
    double socksCost$=2.58;
    int nGlasses=6;
    double glassesCost$=2.29;
    int nEnvelopes=1;
    double envelopesCost$=3.25;
    double taxPercent=0.06;
    
//  run calcs. store vals, doc calcs
//  calc 
//      cost of each item; sales tax for that total cost
//      total cost of purchases (before tax)
//      total of entire purchase with sales tax

    double costSocks, costGlasses, costEnvelopes;
    double socksTax, glassesTax, envelopesTax;
    double socksWithTax, glassesWithTax, envelopesWithTax;
    double beforeTax, totalTax, totalCost;
    double totalCostRounded;
    
    costSocks=nSocks*socksCost$;
    socksTax=costSocks*taxPercent;
    socksWithTax=socksTax+costSocks;
    
    costGlasses=nGlasses*glassesCost$;
    glassesTax=costGlasses*taxPercent;
    glassesWithTax=glassesTax+costGlasses;
    
    costEnvelopes=nEnvelopes*envelopesCost$;
    envelopesTax=costEnvelopes*taxPercent;
    envelopesWithTax=envelopesTax+costEnvelopes;
    
    beforeTax=costSocks+costGlasses+costEnvelopes;
    totalTax=beforeTax*taxPercent;
    
    totalCost=totalTax+beforeTax;
    
    int roundedTotal= (int) totalCost;
    totalCostRounded=totalCost*100/100.00;
    
//  print

    System.out.println(" Bought "+nSocks+" Socks. They cost "
    +socksCost$+" dollars.");
    System.out.println(" Bought "+nGlasses+" Glasses. They cost "
    +glassesCost$+" dollars. ");
    System.out.println(" Bought "+nEnvelopes+" Envelope. It cost "
    +envelopesCost$+" dollars.");
    
    System.out.println(" Socks cost "+costSocks+" dollars. The tax was "
    +socksTax+" dollars. ");
    System.out.println(" Glasses cost "+costGlasses+" dollars. The tax was "
    +glassesTax+" dollars. ");
    System.out.println(" The Envelope cost "+costEnvelopes+" dollars. The tax was "
    +envelopesTax+" dollars. ");
    
    System.out.println("The purchase price was $"+beforeTax+" before taxes.");
    System.out.println("The price was $"+roundedTotal+" in total, including taxes. ");

    }
}
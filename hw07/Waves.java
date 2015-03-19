//Emily Wilkinson
//
//Waves Program
//
//import scanner
import java.util.Scanner;

//define class
public class Waves {
    
//  add main method
    public static void main (String[] args) {
        
//  declare/initialize scanner
    Scanner input = new Scanner (System.in);
    
//  user input
    System.out.print(" Enter a number between 1 and 30: ");
    int counter  = input.nextInt();
    
//  verify integer
    while (number < 1 || number > 30){
        while (!input.hasNextInt()){
            System.out.println(" Input is not valid. Please enter a valid integer. ");
            input.next();
        }//end while loop
    }//end while loop
    
//  create waves of numbers

//  FOR LOOP
    System.out.println(" FOR LOOP ");

    for (int numberWaves = 1; numberWaves <= counter; numberWaves++){
        if (numberWaves %= 0){
            for (int countNumber = 1; countNumber <= numberWaves; countNumber++){
                waveSign += numberWaves;
                System.out.println(waveSign);
            }//end for loop
        }//end if statement
        else{
            for (int countNumber = numberWaves; countNumber >= 1; countNumber--){
                for (int depth = 1; depth <= countNumber; depth++){
                    System.out.print(numberWaves);
                }//end for loop
                System.out.println(" ");
            }//end for loop
        }//end else statement
    }//end for loop
    
//  WHILE LOOP
    System.out.println(" WHILE LOOP ");
    int numberWaves = 0;

    while (numberWaves <= counter){
        if (numberWaves %= 0){
            int countNumber = 1;
            while (countNumber <= numberWaves){
                waveSign += numberWaves;
                System.out.println(waveSign);
            }//end while loop
            countNumber++;
        }//end if statement
        else{
            int countNumber = numberWaves;
            while (countNumber >= 1){
                int depth = 0;
                while (depth <= countNumber){
                    System.out.print(numberWaves);
                    depth++;
                }//end while loop
                System.out.println(" ");
                countNumber--;
            }//end while loop
        }//end else statement
        numberWaves++;
    }//end while loop
    
// DO-WHILE LOOP
    System.out.println(" DO-WHILE LOOP ");
    
    do {
        if (numberWaves %=0){
            waveSign = " ";
            int countNumber = 0;
            do{
                waveSign += numberWaves;
                System.out.println(waveSign);
                waveSign++;
            } while (countNumber <= numberWaves);//end do while loop
        }//end if statement
        else{
            int countNumber = numberWaves;
            do{
                int depth = 0;
                do{
                    System.out.print(numberWaves);
                    depth++;
                } while (depth <= countNumber);//end do-while loop
                System.out.println(" ");
                countNumber--;
            }while (countNumber >= 1);//end do-while loop
        }//end else statement
        numberWaves++;
    }while (numberWaves <= counter);//end do-while loop
    }//end main method
}//end class
//Emily Wilkinson

// CSE2 Linear Program

//ask for student's final grades
//check for valid int
//print final input array
//enter search grade
//binary search -find entered grade
//grade found?
//print number of iterations used
//scramble sorted array randomly
//print scrambled array
//enter search int
//use linear search to find grade
//grade found?
//print number of iterations used

//import scanner
import java.util.Scanner;

//import array sort
import java.util.Arrays;

//define class
public class CSE2Linear {
    
//  add main method
    public static void main (String [] args) {
        
    int [] finalGrades = new int[15];
    int index = 0;
        
//  declare scanner
    Scanner scan = new Scanner (System.in);
    
//  while loop check for 15 ints
    while(index<15){
        System.out.println(" Enter 15 ints for final grades in CSE2: ");
        String input = scan.next();
        char lastChar = input.charAt(0);
        if (lastChar >= '0' && lastChar <= '9'){
            int userInput = Integer.parseInt(input);
        
//          if statement
            if(userInput >= 0 && userInput <=100){
                if(index == 0){
                    finalGrades[index] = userInput;
                    index++;
                }//end if statement
                else{
                    if (userInput < finalGrades[index-1]){
                        finalGrades[index] = userInput;
                        index++;
                    }
                }//end else statmenet
            }//end if statement   
        }
    }//while loop
    
    System.out.print(" Enter a grade to search for: ");
    int gradeSearch = scan.nextInt();
   
   Arrays.sort(finalGrades);
//   selectionSort(finalGrades);
   
   int[] found = binarySearch(finalGrades, gradeSearch);
   
   if(found[0] >=0){
       System.out.println(gradeSearch+" was found in the list with "+found[1]+" iterations ");
   }//end if statement
   else{
       System.out.println(gradeSearch+" was not found in the list with "+found[1]+" iterations ");
   }//end else statement
   
   scrambleArray(finalGrades);
   
    System.out.print(" Enter a grade to search for: ");
    gradeSearch = scan.nextInt();
    int iteration = 0;
    boolean foundTwice = false;
    
    for(int i = 0; i < finalGrades.length; i++){
        iteration++;
        if(finalGrades[i] == gradeSearch){
            foundTwice = true;
            System.out.println(gradeSearch+" was found in the list with "+iteration+" iterations");
        }//end if statement
    }//end for loop
    if(!foundTwice){
        System.out.println(gradeSearch+" was not found in the list with "+iteration+" iterations");
    }//end if statement
    }//end main method
    
// scrambling array method
    public static void scrambleArray(int[] scrambled){
        for(int i = 0; i<10; i++){
            int intOne = (int)(Math.random()*15);
            int intTwo = (int)(Math.random()*15);
            int temp = scrambled[intOne];
            scrambled[intOne]=scrambled[intTwo];
            scrambled[intTwo] = temp;
        }//end for loop
    }//end scrambleArray method

// binary search method
    public static int[] binarySearch(int[] grades, int key){
        int iteration = 0;
        int low = 0;
        int high = grades.length-1;
        
        while(high>=low){
            int mid = (low+high)/2;
            if(key<grades[mid]){
                high = mid-1;
                iteration++;
            }//end if statement
            else if (key == grades[mid]){
                int[] newArray = {mid, iteration};
                return newArray;
            }//end else if statement
            else{
                low = mid+1;
                iteration++;
            }//end else statement
            }//end while loop
        int[] secondArray = {-1, iteration};
        return secondArray;
    }//end binary search method
    
//  sorting method
    public static void selectionSort(int[] grades){
        for(int i=0; i<grades.length-1; i++){
            int min = grades[i];
            int minIndex = i;
            for(int j=i+1; j<grades.length; j++){
                if(min > grades[j]){
                    min = grades[j];
                    minIndex = j;
                }//end if statement
            }//end for loop
            
            if(minIndex != i){
                grades[minIndex] = grades[i];
                grades[i] = min;
            }//end if statement
        }//end for loop
    }//end sorting method
}//end class
//Emily Wilkinson
//
// Elimination Program
//
//write code for methods
//  randomInput(), delete(list, pos), remove(list, target)

//import scanner
import java.util.Scanner;

//define class
public class RemoveElements {
  
//add main method
  public static void main(String [] arg){
      
//declare/assign scanner
	Scanner scan=new Scanner(System.in);

//declare arrays 
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
		System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
	  System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }

//randomInput method
  public static int[] randomInput() {
  	int variable[] = new int [10];
  	
  	for(int i = 0; i<variable.length; i++){
  		variable[i] =(int) (Math.random()*10);
  	}//end for loop
  	return variable;
  }//end randomInput

//delete method
  public static int[] delete(int list[], int pos){
  	int newArray[] = new int [10];
  	int count = 0;
  	int newArray1[];
  	
  	for(int i = 0;i<list.length; i++){
  		if(list[i] == pos){
  		}//end if statement
  		else{
  			newArray[count] = list[i];
  			count++;
  		}//end else statement
  	}//end for loop
  	newArray1 = new int [count];
  	for (int i = 0; i<newArray1.length;i++){
  		newArray1[i] = newArray[i];
  	}//end for loop
  	return newArray1;
  }//end method delete

//remove method
  public static int[] remove(int list[],int target){
  	int newArray2[] = new int [10];
  	int count = 0;
  	int newArray3[];

		for (int i = 0; i<list.length;i++){
			if (list[i] == target){
			}//end if statement
			else{
				newArray2[count] = list[i];
				count++;
			}//end else statement
	}//end for loop
		newArray3 = new int [count];
		for (int i = 0; i<newArray3.length;i+=1){
			newArray3[i] = newArray2[i];
		}//end for loop
  	return newArray3;
  }//end remove method
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
}
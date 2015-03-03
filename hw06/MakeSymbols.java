//Emily Wilkinson
//
//Run Factorial Program
//
//compile and run program

//define class
public class MakeSymbols {
    
//  add main method
    public static void main (String[] args) {
        
//  print statement
    int randomNumber = (int) (100*Math.random()+1);
    System.out.print("Random number generated: "+randomNumber);
    System.out.println(" The output pattern: ");

//if statement
    if ((randomNumber %2)== 0){
    // do-while loop
        do{
            System.out.print("*");
            randomNumber--;}
            while (randomNumber > 0);//end do-while loop
    }//end if statement
    else{
        do{
            System.out.print("&");
            randomNumber--;}
            while (randomNumber > 0);//end do-while loop
    }//end else statement
    }//end main method
}//end class
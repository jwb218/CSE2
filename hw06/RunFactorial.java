//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// HW06-Program2
//Run Factorial

//This program solves a factorial using a while loop


import java.util.Scanner; //this programs contains a scanner

    public class RunFactorial { //create the class
        public static void main (String [] args) { //create the method
        
        
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //allows for scanner input
 
//promt user for input 
        
System.out.println("Please enter an integer that is between 9 and 16: ");        
      
      
      // declare and initialize variables
int factorial=0;
int counter=1;
int total=1;
int initialRun=1;
boolean intTest=myScanner.hasNextInt();



while (counter>=1){ //run while 
      if (intTest==true){    // test if user inputs int
        
        
            if (initialRun==1){ //run only for first run of loop
            factorial=myScanner.nextInt(); // store factorial 
            counter=factorial; // store factorial as counter
            initialRun--; //decrement initial run so statement only runs once
            }
            
            else if (factorial>=9&&factorial<=16){ // if factorial meet bounds
            total=total*counter; // find factorial of number
            counter--; //decrement counter
            }
            
            
            else{ //when user inputs a wrong int
            System.out.println("Invalid input, enter again!"); //print error
            myScanner = new Scanner (System.in); //accept new scanner 
            intTest=myScanner.hasNextInt(); //test if it is int
            initialRun++; // increment intitial run since it ran earlier and now needs to run again
            }       

            if (factorial<=0){ //for negative numbers set counter to 2 to loop runs again
                counter=2;
            }

      }    
        
      else{ //for non ints
      System.out.println("Invalid input, enter again!"); //print error
      String nothing = myScanner.nextLine(); //store incorrect input in a unused variable  
      intTest=myScanner.hasNextInt(); //test if next input is int 
      }

} //end loop


System.out.println("Input accepted:"); //accept input
System.out.println(+factorial+"!=" +total); //print answer


} //end method 
} //end class

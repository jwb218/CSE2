//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// HW06-Program1
//Get Integer

//This program sums 5 random integers with a loop


import java.util.Scanner; //this programs contains a scanner

    public class GetInteger { //create the class
        public static void main (String [ ] args) { //create the method
        
        
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //allows for scanner input
        
        
int sum=0; //declare sum and initialize
int intInput=0; //declare input and initialize
System.out.println("Please enter 5 non-negative integers: ");

for(int forCounter =0; forCounter < 5; forCounter++ ){  //run loop for 5 times
    

    if(myScanner.hasNextInt()){ //check if next input is int 
        intInput=myScanner.nextInt(); //store input
            if(intInput>0){ //if int is positive 
                sum+=intInput; //add int to sum
                }    
                
            else{ 
                System.out.println("Invalid input, enter again"); //print error
                forCounter--; //decrement counter
                }
    }
    else{ //if input isnt int 
        System.out.println("Invalid input, enter again"); //print error
        forCounter--; //decrement counter 
        myScanner = new Scanner (System.in); //store new scanner 
        }
}

System.out.println("Sum is: " +sum);  //print sum
 
   
} //end method 
} //end class
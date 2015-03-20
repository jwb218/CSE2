//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
//Lab08
//Factorials

//This program takes an input from a user and finds a super factorial for that number



import java.util.Scanner; //this programs contains a scanner
        
        
        
public class Factorials {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

    
    
//the following section of code is used for accepting positive ints only for the factorial    
int input=0;   
int q=1;
    if (input<1){ //run when input is out of range
        while (q>0){  //infinite loop 
        System.out.print("Enter a positive number to find the super factorial of: "); //prompt user
         
            if(!myScanner.hasNextInt()){  //when input is not int 
                while (q>0){
                    String dummy=myScanner.next(); //store dummy input
                    System.out.print("Enter a positive number to find the super factorial of: "); //prompt user 
                    if(myScanner.hasNextInt()){ //if input is int break
                        break;
                    }
                }
            }
            input=myScanner.nextInt(); //store int
            
            if (input>=1){ //break when in range 
                break;
            }
        }
    }
        
        

        int sum = 0; //initialize and declare sum
        for(int i = 1; i <= input; i++){ //for loop that increases the total sum
            sum += factorial(i); //call the factorial method
        }
        print(input, sum); //call the print method
  } //end main method
  
    public static int factorial(int input){ //new method for finding factorial
        int mul = 1; //initalize initial multiplier
        for (int i = 1; i <= input; i++){ //for loop for finding the factorial of an individual number 
            mul *= i; //increase the multiple by the factor of i
        }
        return mul; //return the factorial of that numeber
    }//end factorial method 
    
    public static void print(int input,int sum){ //print method
        System.out.println("The super factorial of "+input+ " is " + sum); //print super factorial 
    } //end print method
} //end class 
//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// HW03
//Program 2 - Root

import java.util.Scanner; //this program contains a scanner
    public class Root { //create the class
        public static void main(String [] args) { //create the method
            
    Scanner myScanner; //declare a scanner variable
    myScanner = new Scanner (System.in); //allows for scanner input
    
    System.out.print("Enter a double and I print its cube root: "); //prompts the user for a number
        double number=myScanner.nextDouble();//stores the number in a variables
        
    //finds a crude cube root by guessing    
    double guess=number/3;
    guess=(2*guess*guess*guess+number)/(3*guess*guess);
    guess=(2*guess*guess*guess+number)/(3*guess*guess);    
    guess=(2*guess*guess*guess+number)/(3*guess*guess);
    guess=(2*guess*guess*guess+number)/(3*guess*guess);
    double root=(2*guess*guess*guess+number)/(3*guess*guess);
        
    double rootCubed=Math.pow(root,3.0);//cubes the guessed root

    //print the crude root and the crude root cubed
    System.out.println("The cube root is "+root);
    System.out.println(+root+"*"+root+"*"+root+"="+rootCubed);
            
        }
    }
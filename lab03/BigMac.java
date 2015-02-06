////////////////////////////////
//Josh Blatt
//CSE2-Chen
//Lab 3 - Big Mac

//This program takes inputs for the price of a big mac and the 
//state tax and outputs total cost for an order

//estabish this code will include scanners
import java.util.Scanner;

public class BigMac { //create the class
    public static void main (String [ ] args) { //create the method
        
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //call the scanner constucter
            System.out.print("Enter the number of Big Macs (an integer > 0): "); //call user to input of number of big macs
                int nBigMacs=myScanner.nextInt(); //accept next user input of integer
            System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): "); //call user to input cost of big mac 
                double bigMac$=myScanner.nextDouble(); //accept next user input of a double
            System.out.print("Enter the percent tax as a whole number (xx): "); //call user to input state tax 
                double taxRate=myScanner.nextDouble(); //accept next user input of a double
            taxRate/=100; //put tax rate into a proportion
            
        double cost$; //declare cost variable
        int dollars, dimes, pennies; //declare dollars dimes and pennies
        cost$=nBigMacs*bigMac$*(1+taxRate); //calculate total cost of purchase
        dollars=(int)cost$; //find total dollars
        dimes=(int)(cost$*10)%10; //find total dimes
        pennies=(int)(cost$*100)%10; //find total pennies
        
        
        //print out final statement with number of big macs, their cost, the tax rate and the total cost
        System.out.println("The total cost of " +nBigMacs+ " Big Macs, at $"+bigMac$ + 
            " per Big Mac, with a sales tax of "+ (int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
     
    } //end the method
} //end the class
//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// HW03
//Program 3 - Four Digits


import java.util.Scanner; //this programs contains a scanner

    public class FourDigits { //create the class
        public static void main (String [ ] args) { //create the method
        
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //allows for scanner input
        
        //prompt user for a double
        System.out.print("Enter a double and I display the four digits to the right of the decial point: ");
            double myDouble=myScanner.nextDouble(); //store double 
        
        //declare variable for each decimal place and calculate each one 
        int tens, huns, thous, tenthous;
        tens=(int)(myDouble*10)%10; 
        huns=(int)(myDouble*100)%10; 
        thous=(int)(myDouble*1000)%10; 
        tenthous=(int)(myDouble*10000)%10; 
        
        //print out each int and final statement
        System.out.println("The four digits are: " +tens+huns+thous+tenthous);
        
        }//end of method
    }//end of class 
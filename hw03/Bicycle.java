//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// HW03
//Program 1 - Bicycle

//This program outputs the distace, time and average mph of a bike ride based on the user input of second and counts

import java.util.Scanner;

    public class Bicycle { //create the class
        public static void main (String [ ] args) { //create the method
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter the number of seconds: ");
            int seconds=myScanner.nextInt();
        System.out.print("Enter the number of counts: ");
            int counts=myScanner.nextInt();
        
        
        double wheelDiameter=27.0,  //input for the diameter of the wheel as a double
    	    PI=3.14159, //input the value of pi
    	    feetPerMile=5280,  //input the conversion of miles to feet
    	    inchesPerFoot=12,   //input the conversion of feel to inches
        	secondsPerMinute=60;  //input the conversion of minutes to seconds
        
        double distance = counts*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
        double time = seconds/secondsPerMinute;
        double mph = distance/time*60.0;
        
        
            distance = distance*100;
            distance = (int) distance;
            distance = (double) distance/100;

            mph = mph*100;
            mph = (int) mph;
            mph = (double) mph/100;
            
            
        
        System.out.println("The distance was "+distance+" miles and took "+time+" minutes.");
        System.out.println("The average mph was "+mph+".");
        
        
        
        
        

        }
    }
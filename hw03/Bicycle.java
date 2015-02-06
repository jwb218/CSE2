//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// HW03
//Program 1 - Bicycle

//This program outputs the distace, time and average mph of a bike ride based on the user input of second and counts

import java.util.Scanner; //this programs contains a scanner

    public class Bicycle { //create the class
        public static void main (String [ ] args) { //create the method
        
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //allows for scanner input
        
        System.out.print("Enter the number of seconds: "); //prompts user for seconds
            int seconds=myScanner.nextInt();//accept next int as seconds
        System.out.print("Enter the number of counts: ");//prompts user for counts
            int counts=myScanner.nextInt();//accept next int as counts
        
        
        double wheelDiameter=27.0,  //input for the diameter of the wheel as a double
    	    PI=3.14159, //input the value of pi
    	    feetPerMile=5280,  //input the conversion of miles to feet
    	    inchesPerFoot=12,   //input the conversion of feel to inches
        	secondsPerMinute=60;  //input the conversion of minutes to seconds
        
        double distance = counts*wheelDiameter*PI/inchesPerFoot/feetPerMile;//calculates distance
        double time = seconds/secondsPerMinute;//calculates length of trip in minutes
        double mph = distance/time*60.0;//calculates mph
        
            
            //sets distance and mph to only have 2 decimal places
            distance = distance*100;
            distance = (int) distance;
            distance = (double) distance/100;

            mph = mph*100;
            mph = (int) mph;
            mph = (double) mph/100;
            
            
        //prints out final statement with distance time and mph
        System.out.println("The distance was "+distance+" miles and took "+time+" minutes.");
        System.out.println("The average mph was "+mph+".");
        

        } //ends method
    } //ends class 
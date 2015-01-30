///////////////////////////////////////////////////////////////////////////////
//Josh Blatt
//Lab 02
//Cyclometer


//this program uses a bike cyclometer to calculate; the length of the trip in time, 
//the counts per trip, distace in miles and distance for both trips together


//define a class
public class Cyclometer {
    	// add main method
   	public static void main(String[] args) {
   	        
   	    int secsTrip1=480;  //inputing the total time of the first trip
       	int secsTrip2=3220;  //inputing the total time for the second trip
		int countsTrip1=1561;  //rotations in the first trip
		int countsTrip2=9037; //rotations for the second trip
   	        //note - all variables are ints
   	        
   	        
   	    double wheelDiameter=27.0,  //input for the diameter of the wheel as a double
    	    PI=3.14159, //input the value of pi
    	    feetPerMile=5280,  //input the conversion of miles to feet
    	    inchesPerFoot=12,   //input the conversion of feel to inches
        	secondsPerMinute=60;  //input the conversion of minutes to seconds
    	double distanceTrip1, distanceTrip2,totalDistance;  //double the 3 distance variables
    	
    	System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts."); //print out the length and counts for trip 1
    	System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts."); //print out the length and counts for trip 2


        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //gives the distace of the trip in inches
        //now it calculates each distance in miles
        distanceTrip1/=inchesPerFoot*feetPerMile; //finds distaces of trip 1 in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calcultes distace of trip 2 in miles
        totalDistance=distanceTrip1+distanceTrip2; //adds the two distaces together to get the total distance
        
        //print out distances
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
    	System.out.println("Trip 2 was "+distanceTrip2+" miles");
   	    System.out.println("The total distance was "+totalDistance+" miles");
   	        
   	        
   	        

	}  //end of main method   
} //end of class
//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// HW05 
//To Hex

//This program converts 3 decimal numbers into hexadecimal numbets

import java.util.Scanner; //this programs contains a scanner

    public class ToHex { //create the class
        public static void main (String [ ] args) { //create the method
        
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //allows for scanner input
        
        System.out.println("Please enter three numbers representing RGB values: "); //prompt user for input
        
        int red, blue, green;//declare variables for each color
            
        if (myScanner.hasNextInt()){ //check if red is int   
        
            red = myScanner.nextInt(); //assign int to red
          if (red<0||red>255){ //check if red is not within range and print error
              System.out.println("Sorry, you must enter values between 0-255"); 
              return;
          }
        }
        
        else {System.out.println("Sorry, your input must consist of integers.");return;} //print error
        
         
         
        if (myScanner.hasNextInt()){   //check if blue is int
           
         green = myScanner.nextInt();//assign int to blue
          if (green<0||green>255){ //check if blue is not within range and print error
              System.out.println("Sorry, you must enter values between 0-255");
              return;
          } 
        }
        
        else {System.out.println("Sorry, your input must consist of integers.");return;}//print error
        
        
        if (myScanner.hasNextInt()){ //check if green is int  
        
       blue = myScanner.nextInt();//assign int to blue
          if (blue<0||blue>255){ //check if blue is not within range and print error
              System.out.println("Sorry, you must enter values between 0-255");
              return;
          }
        }
        
        else {System.out.println("Sorry, your input must consist of integers.");return;}//print error
        
       //convert red to hex
    String redHex = Integer.toHexString(red);
        if (red<16){//add 0 in front of hex values less than 16
            redHex = "0"+redHex;
        }
        
 
        //convert green to hex
    String greenHex = Integer.toHexString(green);
        if (green<16){//add 0 in front of hex values less than 16
            greenHex = "0"+greenHex;
        }
 
         //convert blue to hex
    String blueHex = Integer.toHexString(blue);
        if (blue<16){//add 0 in front of hex values less than 16
            blueHex = "0"+blueHex;
        }
 
 
    //print final output 
        System.out.print("The decimal numbers R:"+red+ " G:"+green+  " B:"+blue+ " is represented in hexadecimal as: ");
        System.out.print(redHex);    
        System.out.print(greenHex); 
        System.out.println(blueHex);
       
    }//end method
}// end class





          





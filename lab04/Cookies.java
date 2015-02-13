//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// Lab04
//Cookies

//This program takes inputs to find cookies per person, how many each person needs to bring and how they will divide amoung the people

import java.util.Scanner; //this programs contains a scanner

    public class Cookies { //create the class
        public static void main (String [ ] args) { //create the method
        
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //allows for scanner input
        
        int people, cookies, cPerPerson;//declare variables for people, cookies and cookies per person
        
        System.out.print("Enter the number of People: "); //promt user for people
            if(myScanner.hasNextInt()){ //test if scanner is an int
                people=myScanner.nextInt(); //store int
            }
            else{ //if not int print this error
                System.out.println("You did not enter an int");
                return; //terminate code
            } 
            
            
            if(people<0){ //test if int is not positive and return error
                System.out.println("You did not enter an int > 0");
                return; //terminate code
                }
        
        System.out.print("Enter the number of cookies you are planning to buy: ");//promt user for people
            if(myScanner.hasNextInt()){ //test if scanner is an int
                cookies=myScanner.nextInt();//store int
            }
            else{//if not int print this error
                System.out.println("You did not enter an int");
                return;//terminate code
            } 
            
            
            if(cookies<0){ //test if int is not positive and return error
                System.out.println("You did not enter an int > 0");
                return;//terminate code
                }
        
        
        System.out.print("How many do you want each person to get? ");//promt user for people
            if(myScanner.hasNextInt()){ //test if scanner is an int
                cPerPerson=myScanner.nextInt();//store int
            }
            else{//if not int print this error
                System.out.println("You did not enter an int");
                return;//terminate code
            } 
            
            
            if(cPerPerson<0){ //test if int is not positive and return error
                System.out.println("You did not enter an int > 0");
                return;//terminate code
                }
                
        
        
        int cookiesNeeded = people*cPerPerson; //find cookies needed 
        int extraCookies = cookiesNeeded-cookies; //find extra cookies needed above the inputed value 
        
    
        if((cPerPerson % people!=0)&&(extraCookies>0)){ //test if cookies per person does not divide even and extra cookies is above 0
            System.out.println("You will not have enough cookies. You need to buy at least " +extraCookies+" more."); //print error message
            return;//terminate code
        }
    
        if ((cookies%people!=0)&&(cookiesNeeded<cookies)){ //test if the cookies wont divide evenly even though you have enough 
            System.out.println("You have enough, but they will not divide evenly."); //print error message
            return;//terminate code
        }

        //if code reaches this step, all conditions have been met
        System.out.println("You have enough cookies for each person and the amount will divide evenly.");



    }//end method
    
}//end class
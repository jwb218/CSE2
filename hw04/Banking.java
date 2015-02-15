//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// HW04 - Program 2
//Banking

//This program generates a random bank account value and then deposits or withdraws money from it

import java.util.Scanner; //this programs contains a scanner

    public class Banking { //create the class
        public static void main (String [ ] args) { //create the method
        
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //allows for scanner input
        
        
        
        int accountValue = (int) ((Math.random() * 4000)+1000);//creating a random value between 1000 and 5000
        
        
        System.out.println("In your account you have $"+accountValue); //print account value
        System.out.print("Would you like to withdraw (1), deposit (2) or view your balance (3)? "); //promt user for command
            int command=myScanner.nextInt();//store command
            
            switch( command ){//switch command 
	        
	        case 1://case for withdraw
	            System.out.print("How much money would you like to withdraw? $");//prompt user to withdraw
	                int withdraw=myScanner.nextInt();//store withdraw value
	                
	                    if(withdraw<=accountValue){//withdraw must be greater than account value
                            accountValue = accountValue-withdraw;//subtract withdraw from account value
                            System.out.println("In your account you now have $"+accountValue);  //print value   
	                    }
	                    else//if too high 
                            System.out.println("You are trying to withdraw more money than you have");//print error 
            break;//end case
	            
	        case 2://case for deposit
	            System.out.print("How much money would you like to deposit? $");//promt user for deposit value
	                int deposit=myScanner.nextInt();//store deposit
	                    
	                    if(deposit>=0){//check it deposit is positive
                            accountValue = accountValue+deposit;//add deposit to account
                            System.out.println("In your account you now have $"+accountValue);//print value
	                    }//end if
                        else //print error if negative
                            System.out.println("You must enter a positive value to deposit");
            break;//end case
	            
            case 3://case to view account and print value 
                System.out.println("In your account you have $"+accountValue);
            break;//end case
        
        
            default://error statement
                System.out.println("You did not enter a 1, 2 or 3");
            }//end switch
        
        }//end method
    }//end class
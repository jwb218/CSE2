//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
//HW08
//MG's Adventure World

//This program is an adventure game 


import java.util.Scanner; //this programs contains a scanner
        
public class HW8 { //create clas

    public static void main(String[] args) { //main method
        char option; //declare option
        Scanner scan = new Scanner(System.in); //declare scanner
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc"); //call method for getInput
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //call method for getInput
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave(); // call cave method
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //call get input method
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc"); //call getInput method
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();// call giant method
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10); //call getInput method
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box(); // call box method
        input = getInput(scan); // call getInput medthod
        System.out.println("Hero! Have a good day!");
    }//end main method
    

    public static void giant() { //giant method
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ         ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ         ");
        System.out.println("                           H    HHHHHHHHHHH    H              ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ         ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                  ");
    }
        
    public static void cave() { //cave method
        System.out.println("                              *****   * * * * * * * *         ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){ //box method 
        System.out.println("                     *********************     *********************    *********************              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************              "); 
    }

    public static String getInput(Scanner scan, String string){ //getInput method
        String input=scan.nextLine(); //accept next string 
        if (input.equals("C")||input.equals("c")){ // run only if c or C is input
        String x="nothing"; //dummy return string       
          return x;
        }
        else{
            System.out.println("Yea right LOSER!"); 
            System.exit(0);//end code 
        }
        String blank="blank"; //dummy return string
        return blank;
        
    }//end getInput method

    public static String getInput(Scanner scan, String string, int trial){ //second get input method
        while(trial>1){ //run loop while trial is greather than 1
        
        scan = new Scanner(System.in); //accept next input into scanner 
        String input=scan.nextLine(); //accept next string
        if (input.equals("A")||input.equals("a")){ //only accept A or a
            while(trial>1){ //run loop while trial is greather than 1
                int randomA=(int)(Math.random()*2); //create random number of either 1 or 2 
                
                if (randomA==1){ //if random equals 1 
                    System.out.println("Critical Hit!");
                    trial--; //decrement trial
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                    scan = new Scanner(System.in); //promt for new scanner 
                    input=scan.nextLine(); 
                    
                }
                
                if (randomA==0){ //if random equals 0
                    System.out.println("Gosh! How can you miss it!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                    scan = new Scanner(System.in); //accept next string
                    input=scan.nextLine();  
                }
                
            }
            if (trial==1){ //when trial equals 1 end method
                System.out.println("The Giant has been slain!");
                String x="nothing";        
                return x;
            }
        
        }
        
        else if(input.equals("E")||input.equals("e")){ //accept only e or E
            int randomE=(int)(Math.random()*10)+1; //random number from 1 to 10
            if (randomE==10){ //when random number equals 10 escape and end code 
                System.out.println("Congratulations you escaped the Giant");
                System.exit(0);
            }
            else{ //else reprompt user and return to top of method
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
            scan = new Scanner(System.in);
            }
        }
        
        else{ //when a non a or e is entered break code 
            System.out.println("Executed by the GIANT! Game Over!");
            System.exit(0);
        }
        }
        String blank="blank"; //dummy return 
        return blank;
    }//end method
    
    public static String getInput(Scanner scan){ //getInput method
        int treasure=scan.nextInt(); //accept next int 
        switch (treasure){ //switch int
            case 1: //first chest
                System.out.println("You open chest 1 to find a dusty skeleton, a prize, I guess.");
                break;
            case 2: //second chest
                System.out.println("Congrats, you find a mound of rubies in the chest!");
                break;
            case 3: //third chest 
                System.out.println("Woooooo, it's a map! You can get home now!");
                break;
            default: //all other ints
                System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
                break;
                
        }
        String blank="blank"; //dummy return 
        return blank;
    } //end get input 
    
    
    

} // end class 
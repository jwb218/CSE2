//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// HW04 - Program 1
//Which Number

//This program takes asks user to think of a number from 1 to 10 and then guesses the number

import java.util.Scanner; //this programs contains a scanner

    public class WhichNumber { //create the class
        public static void main (String [ ] args) { //create the method
        
        Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //allows for scanner input
        
        //declare variables for all forms on y and n and variable for final number check
        String y = new String ("y");
        String Y = new String ("Y");
        String N = new String ("N");
        String n = new String ("n");
        String number;
        

        //inital prompt to user
        System.out.println("Think of a number between 1 and 10 inclusive.");
        
        System.out.print("Is the number even? ");//ask user question
            String even=myScanner.nextLine();//store scanner
                
                if ((even.equals(Y))||(even.equals(y))){//user says yes
                    System.out.print("Is it divisible by 3? ");//ask user question
                    String divisBy3=myScanner.nextLine();//store scanner
                        
                        if((divisBy3.equals(Y))||(divisBy3.equals(y))){//user says yes
                            System.out.print("Is your number 6? ");//check number
                            number=myScanner.nextLine();//store scanner
                            
                            if((number.equals(Y))||(number.equals(y))){//user says yes
                                System.out.println("Yay!");
                                return;//terminates program
                                }
                            else if((number.equals(N))||(number.equals(n))){//user says no
                                System.out.println("Nooo :(");
                                return;//user says yes
                                }
                            else //user did not use a valid input
                                System.out.println("Sorry, that is not a valid input.");
                        }
                        else if((divisBy3.equals(N))||(divisBy3.equals(n))){//user says no
                            System.out.print("Is the number divisible by 4? ");//ask user question
                            String divisby4 = myScanner.nextLine();//store scanner
                            
                            if((divisby4.equals(Y))||(divisby4.equals(y))){//user says yes
                                System.out.print("Is the numbern divided by 4 greater than 1? ");//ask user question
                                String divisBy4LessThan1=myScanner.nextLine();//store scanner
                                
                                if((divisBy4LessThan1.equals(Y))||(divisBy4LessThan1.equals(y))){//user says yes
                                    System.out.print("Is your number 8? ");
                                    number=myScanner.nextLine();//store scanner
                                       
                                    if((number.equals(Y))||(number.equals(y))){//user says yes
                                        System.out.println("Yay!");
                                        return;//user says yes
                                    }
                                    else if((number.equals(N))||(number.equals(n))){//user says no
                                        System.out.println("Nooo :(");
                                        return;//user says yes
                                        }
                                    else //user did not use a valid input
                                        System.out.println("Sorry, that is not a valid input.");
                                }
                            
                                else if((divisBy4LessThan1.equals(N))||(divisBy4LessThan1.equals(n))){//user says no
                                    System.out.print("Is your number 4? ");
                                    number=myScanner.nextLine();//store scanner
                                    
                                    if((number.equals(Y))||(number.equals(y))){//user says yes
                                        System.out.println("Yay!");
                                        return;//user says yes
                                    }
                                    else if((number.equals(N))||(number.equals(n))){//user says no
                                        System.out.println("Nooo :(");
                                        return;//user says yes
                                        }
                                    else //user did not use a valid input
                                        System.out.println("Sorry, that is not a valid input.");
                                }
                                else //user did not use a valid input
                                    System.out.println("Sorry, that is not a valid input.");
                            }
                                else if((divisby4.equals(N))||(divisby4.equals(n))){//user says no
                                    System.out.println("Is it divisible by 5? ");//ask user question
                                    String divisby5 = myScanner.nextLine();//store scanner
                                    
                                        if((divisby5.equals(Y))||(divisby5.equals(y))){//user says yes
                                            System.out.print("Is your number 10? ");//ask user question
                                            number=myScanner.nextLine();//store scanner
                                    
                                            if((number.equals(Y))||(number.equals(y))){//user says yes
                                                System.out.println("Yay!");
                                                return;//user says yes
                                                }
                                            else if((number.equals(N))||(number.equals(n))){//user says no
                                                System.out.println("Nooo :(");
                                                return;//user says yes
                                                }
                                            else //user did not use a valid input
                                                System.out.println("Sorry, that is not a valid input.");
                                        }
                                        else if((divisby5.equals(N))||(divisby5.equals(n))){//user says no
                                            System.out.print("Is your number 2? ");//ask user question
                                            number=myScanner.nextLine();//store scanner
                                    
                                            if((number.equals(Y))||(number.equals(y))){//user says yes
                                                System.out.println("Yay!");
                                                return;//user says yes
                                                }
                                            else if((number.equals(N))||(number.equals(n))){//user says no
                                                System.out.println("Nooo :(");
                                                return;//user says yes
                                                }
                                            else //user did not use a valid input
                                                System.out.println("Sorry, that is not a valid input.");
                                        }
                                        else //user did not use a valid input
                                            System.out.println("Sorry, that is not a valid input.");
                                }
                                else //user did not use a valid input
                                    System.out.println("Sorry, that is not a valid input.");
                        }
                        else //user did not use a valid input
                            System.out.println("Sorry, that is not a valid input.");
                }
                else if((even.equals(N))||(even.equals(n))){//user says no
                    System.out.print("Is it divisible by 3? ");//ask user question
                    String divisBy3=myScanner.nextLine();//store scanner
                        
                        if((divisBy3.equals(Y))||(divisBy3.equals(y))){//user says yes
                            System.out.print("When divided by 3 is the result greater than 1? ");//ask user question
                            String divisBy3GreaterThan1=myScanner.nextLine();//store scanner
                            
                            if((divisBy3GreaterThan1.equals(Y))||(divisBy3GreaterThan1.equals(y))){//user says yes
                                System.out.print("Is your number 9? ");//ask user question
                                number=myScanner.nextLine();//store scanner
                                    
                                if((number.equals(Y))||(number.equals(y))){//user says yes
                                    System.out.println("Yay!");
                                    return;//user says yes
                                    }
                                else if((number.equals(N))||(number.equals(n))){//user says no
                                    System.out.println("Nooo :(");
                                    return;//user says yes
                                    }
                                else //user did not use a valid input
                                    System.out.println("Sorry, that is not a valid input.");
                            }
                            else if((divisBy3GreaterThan1.equals(N))||(divisBy3GreaterThan1.equals(n))){
                                System.out.print("Is your number 3? ");//ask user question
                                number=myScanner.nextLine();//store scanner
                                
                                if((number.equals(Y))||(number.equals(y))){//user says yes
                                    System.out.println("Yay!");
                                    return;//user says yes
                                    }
                                else if((number.equals(N))||(number.equals(n))){//user says no
                                    System.out.println("Nooo :(");
                                    return;//user says yes
                                    }
                                else //user did not use a valid input
                                    System.out.println("Sorry, that is not a valid input.");
                            }
                            else //user did not use a valid input
                                System.out.println("Sorry, that is not a valid input.");
                        }
                        else if((divisBy3.equals(N))||(divisBy3.equals(n))){//user says no
                            System.out.print("Is it greater than 6? ");//ask user question
                            String greaterThan6=myScanner.nextLine();//store scanner
                            
                            if((greaterThan6.equals(Y))||(greaterThan6.equals(y))){//user says yes
                                System.out.print("Is your number 7? ");//ask user question
                                number=myScanner.nextLine();//store scanner
                                
                                if((number.equals(Y))||(number.equals(y))){//user says yes
                                    System.out.println("Yay!");//store scanner
                                    return;//user says yes
                                    }
                                else if((number.equals(N))||(number.equals(n))){//user says no
                                    System.out.println("Nooo :(");
                                    return;//user says yes
                                    }
                                else //user did not use a valid input
                                    System.out.println("Sorry, that is not a valid input.");
                            }   
                            else if((greaterThan6.equals(N))||(greaterThan6.equals(n))){//user says no
                                System.out.print("Is it less than 3? ");//ask user question
                                String lessThan3=myScanner.nextLine();//store scanner
                                
                                if((lessThan3.equals(Y))||(lessThan3.equals(y))){//user says yes
                                    System.out.print("Is your number 1? ");//ask user question
                                    number=myScanner.nextLine();//store scanner
                                
                                    if((number.equals(Y))||(number.equals(y))){//user says yes
                                        System.out.println("Yay!");
                                        return;//user says yes
                                        }
                                    else if((number.equals(N))||(number.equals(n))){//user says no
                                        System.out.println("Nooo :(");
                                        return;//user says yes
                                        }
                                    else //user did not use a valid input
                                        System.out.println("Sorry, that is not a valid input.");
                                }       
                                else if((lessThan3.equals(N))||(lessThan3.equals(n))){//user says no
                                    System.out.print("Is your number 5? ");//ask user question
                                    number=myScanner.nextLine();//store scanner
                                
                                    if((number.equals(Y))||(number.equals(y))){//user says yes
                                        System.out.println("Yay!");
                                        return;//user says yes
                                        }
                                    else if((number.equals(N))||(number.equals(n))){//user says no
                                        System.out.println("Nooo :(");
                                        return;//user says yes
                                        }
                                    else //user did not use a valid input
                                        System.out.println("Sorry, that is not a valid input.");
                                }
                                else //user did not use a valid input
                                    System.out.println("Sorry, that is not a valid input.");   
                            }
                            else //user did not use a valid input
                                System.out.println("Sorry, that is not a valid input.");
                        }
                        else //user did not use a valid input
                            System.out.println("Sorry, that is not a valid input.");
                    }
                    else //user did not use a valid input
                        System.out.println("Sorry, that is not a valid input.");
                                
                          
    }//end of method
}//end of class
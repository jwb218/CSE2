//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
//Lab07
//ZigZag

//This program runs various nested loops



import java.util.Scanner; //this programs contains a scanner
    public class zigzag { //create the class
        public static void main (String [ ] args) { //create the method
        

  Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //allows for scanner input
        


//initialize and declare varialbes
int nStars1=10;
int i1=0;
int j1=0;

while (nStars1>0){ //run loop while stars is greater than 0
        while (i1>0){ //run loop while i is greater than 0
        System.out.print(" "); //print a space
        i1--; //decrement i
        }
    System.out.println("*"); //print *
    nStars1--; //decrement stars
    j1++;//increment j
    i1=j1; //set i equal to j
}
System.out.println(" "); //print blank line        
    

//ENDS PART 1 OF CODE 



while(true){ //infinate true loop
    
//initialize and declare varialbes         
int nStars=1;   
int i=1;
int j=0;
int k=0;
int q=1;


//this loop runs until user inputs an acceptable input
if (nStars<3||nStars>33){ //run when input is out of range
    
    while (q>0){  //infinite loop 
        System.out.print("Enter an int between 3 and 33: "); //prompt user
         
        
            if(!myScanner.hasNextInt()){  //when input is not int 
                while (q>0){
                    String dummy=myScanner.next(); //store dummy input
                    System.out.print("Enter an int between 3 and 33: "); //prompt user 
                    if(myScanner.hasNextInt()){ //if input is int break
                        break;
                    }
                }
            }
            
            nStars=myScanner.nextInt(); //store int
            if (nStars>=3&&nStars<=33){ //break when in range 
                
                break;
            }
    }


}


i=0;

while (nStars>1){ //print number of stars that the user entered
    System.out.print("*");
    nStars--;
    k++;
}


nStars=k;

    
while (nStars>0){ //repeated code from top 
        while (i>0){
        System.out.print(" ");
        i--;
        }
    System.out.println("*");
    nStars--;
    j++;
    i=j;
}

nStars=k+1; //increase k by 1 and set it equal to nStars

while (nStars>0){ //print number of stars that the user entered
    System.out.print("*");
    nStars--;
}

System.out.println(" ");
System.out.print("Enter y or Y to go again: "); 
String yes=myScanner.next(); //accept next string 

if (yes.equals("y")||yes.equals("Y")){//repeat loop if y or Y is entered 
}

else{ //else end the infinate loop
    break;
}


}

}
}
//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// HW06-Program3
//Make Symbols

//This program randomly generates a number of symbols with a do-while loop



    public class MakeSymbols { //create the class
        public static void main (String [] args) { //create the method
        

int symbolNo=(int)((Math.random()*101) - 1); //generate a random number from 0 to 100

System.out.println("Random number generated: " +symbolNo); //print random number

if (symbolNo==0){ //print blank line if random number is 0
    System.out.println(" ");
}


else if(symbolNo%2==0){ // if number is even 

do{
    System.out.print("*"); //print * 
    symbolNo--; //decrement number
}while(symbolNo>0); //until no =0
        
    
}


else{ //if number is odd

do{
    System.out.print("&");  //print &
    symbolNo--; //decrement 
}while(symbolNo>0); //until no = 0
}

System.out.println(" ");

}
}

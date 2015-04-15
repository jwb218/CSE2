//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
//HW11
//Linear

//This program prompts user for an array, conducts a binary search, scrambles the array and then linear searches 


import java.util.Scanner; //allow for a scanner

public class CSE2Linear { //create class

    public static void main(String[] args) { //main method
   Scanner myScanner=new Scanner(System.in); //declare a scanner
   System.out.print("Enter 15 ints for final grades in CSE2: "); //ask for 15 ints
   int temp=0;
   int j=0;
   int array[]=new int[1515declare and initialize an array of length 
   
   for(int i=0;i<array.length;i++){ 
       int arrayIn=test(myScanner,temp); //call method to test if input is valid
       array[i]=arrayIn; 
       if(i!=0){ //run for all conditions besides the first one 
           temp=array[i-1]; 
       }
       
   }
   
   System.out.print("The grades, sorted, are: "); 
   
   for(j=0;j<array.length;j++){ //print out array
       System.out.print(array[j]+ " ");
   }
   System.out.println(" ");
   
  System.out.print("Enter a grade to search for:  ");
   int key=myScanner.nextInt(); //store value to search for 
   
   binarySearch(array,key); //call binary search
   
   int mixedUp [] = new int [15]; 
   
   mixedUp=swap(array); //call swapping array
   System.out.println("Scrambled: ");
   for(j=0;j<array.length;j++){ // print array
       System.out.print(mixedUp[j]+ " ");
   }
    System.out.println(" "); 
 
   System.out.print("Enter a grade to search for:  ");
   key=myScanner.nextInt();  
   
    linearSearch(mixedUp,key); // call linear search
 
}
    
    
public static int test(Scanner myScanner, int temp){     //
    
   while(true){
        if(myScanner.hasNextInt()){ // test if int
            int input=myScanner.nextInt();
            if(temp>input){ //is greater than previous
                System.out.println("Number not larger than previous");
                continue;
            }
            if(input>-1&&input<101){ //is in range
                return input;
            }
            else{//print error restart loop
                System.out.println("Not in range");
                myScanner=new Scanner(System.in);
                continue;
            }
            
        }
        else{ //print error restart loop
         System.out.println("You did not enter an int");
         myScanner=new Scanner(System.in);
        continue;
        }

   }
   
        
}

public static void binarySearch (int array[], int search){ //binary search method
  
  int top=14; //establish initial size of array 
  int bot=0;
  int i=0;
 
  while (top >= bot) 
    {
      
      int avg = (bot+top)/2; //find midpoint
      i++; //iterations variable
      if(array[avg] == search){ //when number is found
        System.out.println(+search+ " was found in the list with " +i+ " iterations");
        return;
      }
      
      else if (array[avg] < search){//if its below
        bot = avg + 1; // make bottom avg plus 1
        
      }
      else{ //if its below avg
        top = avg - 1; //make top avg
      }
    }
  
  System.out.println(+search+ " was not found in the list with " +i+ " iterations");
  return;
}


public static int [] swap (int array[]){ //swag method
    for (int i=0; i<array.length; i++) { 
	
	int target = (int) (array.length * Math.random() ); //randomize position

	int temp = array[target]; //swap positions in with dummy variable 
	array[target] = array[i];
	array[i] = temp;
    
}
return array;

}


public static void linearSearch (int array[], int search){ //linear search 
 for(int i=0; i<array.length; i++){
     if(array[i]==search){ //if number is found
         System.out.println(search+  " was found in the list with "  + i  +  1 + " iterations");
         return;
     }
 } //if number isnt found 
 System.out.println(search+  " was not found in the list with 15 iterations");
    return;
}

    
}
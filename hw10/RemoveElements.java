//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
//HW10
//Removable Elements

//This program changes arrays based on the users inputs


import java.util.Scanner; //allow for a scanner
public class RemoveElements{ //class
  public static void main(String [] arg){ //main method
	Scanner scan=new Scanner(System.in); //create a scanner
int num[]=new int[10]; //intialize new int of length 10
int newArray1[]; //create new arrays
int newArray2[]; //create new array
int index,target; //initialize new variables
	String answer=""; //initialize and declare blank string
	do{ //do while
  	System.out.print("Random input 10 ints [0-9]"); 
  	num = randomInput(); //call method random
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out); //print string
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt(); //accept next int 
  	newArray1 = delete(num,index); //call delete method
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(newArray1,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){ //listArray method - adds inital values to the array
	String out="{";
	for(int j=0;j<num.length;j++){ //for loop
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j]; //add to new elements of the array
	}
	out+="} ";
	return out;
  }
  
  
  public static int [] randomInput(){ //random input method
      int [] randomArray= new int[10]; //initialize and declare new 10
      for(int i=0;i<randomArray.length;i++){ //for loop that generates a random values for int array number
          int temp=(int)(Math.random()*9);
          randomArray[i]=temp;
      }
      
      return randomArray;
      
  }
  
  public static int [] delete(int [] list, int pos){
      
      if(pos<0||pos>9){ //checks if index is out of range 
          System.out.println("The index is not valid.");
          return list; //returns initial array
      }
      
      else{
      
      
      int newList[]=new int[9]; //declare new array of length 9
      for(int q=0;q<pos;q++){ //for loop that stores old array into new 
        newList[q]=list[q];
      }
      
      for(int i=pos;i<9;i++){ //moves the values down one position from index
          newList[i]=list[i+1];
          
      }
      
      return newList; //return new array
      
      }
  }
  
  public static int [] remove(int [] list, int target){ 
      int j=0;
      
      for(int i=0;i<list.length;i++){ 
          if(list[i]==target){ // counts the number of values to replace 
            j++;
          }
      }
       
      int newlist []= new int[list.length-j];  //makes the array shorter by the counted value 
      
      for(int i=0,r=0;i<list.length;i++){ //eliminates all bad values 
          if (list[i]==target){
              continue;
          }
              newlist[r]=list[i];
              r++;
                }
              
      if(j>0){
          System.out.println("Element "+target+" has been found.");
          return newlist;
      }
      
      else{
          System.out.println("Element "+target+" has not been found.");
          return list;
      }
      
      
      
  }
  
  
}

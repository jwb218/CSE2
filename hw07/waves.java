//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
//HW07
//ZigZag

//This program creates a series a waves used nested for, while or do while loops



import java.util.Scanner; //this programs contains a scanner
    public class waves { //create the class
        public static void main (String [ ] args) { //create the method
        

  Scanner myScanner; //declare scanner variable
        myScanner = new Scanner (System.in); //allows for scanner input
        

//initialize and declare input
        
int input=0;   
int q=1;



if (input<1||input>30){ //run when input is out of range
    
    while (q>0){  //infinite loop 
        System.out.print("Enter an int between 1 and 30: "); //prompt user
         
        
            if(!myScanner.hasNextInt()){  //when input is not int 
                while (q>0){
                    String dummy=myScanner.next(); //store dummy input
                    System.out.print("Enter an int between 1 and 30: "); //prompt user 
                    if(myScanner.hasNextInt()){ //if input is int break
                        break;
                    }
                }
            }
            
            input=myScanner.nextInt(); //store int
            if (input>=1&&input<=30){ //break when in range 
                
                break;
            }
    }


}

//initialize and declare variables for incrementation 
int k=0;
int j=0;
int i=0;

System.out.println("FOR LOOP:");
System.out.println("1");
 
for(k=2; k<((input)+1); k++){ //for loop
   
   if(k%2==0){ //when k is even
    System.out.println(k); //print k

    for(j = 1; j<k; j++){ //when j<k run loop
        String temp = ""; //initialize printing variable  
	
    	
    	for(i = 0; i<j; i++){ //for while i is less than j 
    		temp = temp + k + ""; //add to current string of numbers
    	    }
    	     
    System.out.print(k); //print number once
	System.out.println(temp); //print string
    }
    
   }
    
    else{ //when k is odd
   
    
        for(j = k; j>0; j--){ //count down from j so rows get smaller
            String temp = "";
    	
        	
        	for(i = 0; i<j; i++){ //same as above
        		temp = temp + k + "";
        	    }
        	    
      		
    	System.out.println(temp);
        }   
  
    }
}



System.out.println(" ");

//=====================================================

System.out.println("WHILE LOOP:");
System.out.println("1");

//initialize variables 
k=2;
j=1;
i=0;
 
while (k<((input)+1)){ //while k is greater than the input 
   
   if(k==2){ //when k is 2
       System.out.println("2"); //always need one like with 2 
   }
   
   if(k%2==0){ //when k is even 

    while(j<k){ //when j<k
        String temp = ""; //reset temp printing var
	    
    	
    	while(i<j){ //when i<j
    	    
    		temp = temp + k + "";  //add to printing var and decrement i 
    		i++;
    	    }
    i=0; //reset i back to 0
    j++; //increment j
    System.out.print(k);		 //print
	System.out.println(temp);
	
    }
    
   }
    
    else{ //when k is odd
       j=k; //set j=k
        
        while (j>0){ //when j is positive 
            String temp = ""; //reset printing var 
    	
        	
        	while (i<j){ //same as above 
        		temp = temp + k + "";
        		i++;
        	    }
        	  
        i=0; //reset i to 0
      	j--; //decrement j 	
    	System.out.println(temp); //print
        }   
  
    }
    k++; //increment k
}


System.out.println(" ");

//=====================================================

System.out.println("DO-WHILE LOOP:");
System.out.println("1");

//initialize variables again 
k=2;
j=1;
i=0;
 
if(input>1){ //only run loops when input is greater than 1
 
do{
   
   if(k==2){ //when k is 2
       System.out.println("2"); //print 2
   }
   
   if(k%2==0){ //when k 
//rest is same as while loops
    do{
        String temp = "";
    	
    	
    	do{
    	    if (i!=0){
    	        temp=temp+k;
    	    }
    		i++;
    	    }while(i<(j+1));
    i=0;	    
    j++;	    
    System.out.print(k);		
	System.out.println(temp);
	
    }while(j<k);
    
   }
    
    else{
       j=k;
        
        do{
            String temp = "";
    	
        	
        	    
        	do{ 
        		temp = temp + k + "";
        		i++;

        		
        	    }while (i<j);
        	  
        i=0;	    
      	j--;	
    	System.out.println(temp);
        }while (j>0);   
  
    }
    k++;
}while (k<((input)+1));

}


    }
}
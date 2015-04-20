///////////////////////////////////////////////
//Josh Blatt
//CSE2 - Chen
//HW 12
//Multiply

//This program randomly fills two multidimensional arrays and multiplys them together


import java.util.Scanner; //this programs contains a scanner


public class Multiply { //class
    public static void main(String[] args) { //main method

int w1,h1,w2,h2; //height and width variables

while(true){
 
//collect inputs for matrix sizes and test inputs 
System.out.print("Please enter width of the first maxtix: ");
Scanner scan=new Scanner(System.in); 
w1=test(scan);
System.out.print("Please enter height of the first maxtix: ");
scan=new Scanner(System.in); 
h1=test(scan);
System.out.print("Please enter width of the second maxtix: ");
scan=new Scanner(System.in); 
w2=test(scan);
System.out.print("Please enter height of the second maxtix: ");
scan=new Scanner(System.in); 
h2=test(scan);

if(w1==h2){ //test condition for multiplying matricies
    System.out.println("Input Accepted");
    break;
}

System.out.println("Error, arrays are not the same size");
    
}

int [][]array1=randomMatrix(h1,w1); //declare and fill two arrays
int [][]array2=randomMatrix(h2,w2);

//print matricies
System.out.println("The first matix: ");
printMatrix(array1);
System.out.println("The second matix: ");
printMatrix(array2);

//multiply matricies and print them
System.out.println("The multiplied matricies: ");
int [][]finalArray=multiplyMatrix(array1,array2);
printMatrix(finalArray);

}

public static int [][]randomMatrix(int height, int width){ //method for filling arrays

    int [][]array=new int [height][width];
    
    for(int i=0;i<array.length;i++){ //fill each position with numbers between -10 and 10
        for(int j=0;j<array[i].length;j++){
            array[i][j]=(int)(Math.random()*21)-10;
        }
    }
    return array;
   
}
    
   
public static void printMatrix( int[][] array){ //print method
   if(array==null){ //if array is empty
        System.out.println("The array is empty");
    }
    
     for(int i=0;i<array.length;i++){  //print each element in grid formation
        for(int j=0;j<array[i].length;j++){
            System.out.print(array[i][j]+ "   ");
        }
        System.out.println(" ");
    }
}   
   
public static int [][]multiplyMatrix(int [][] array1,int [][] array2){ //multipling method

int [][] multiArray = new int[array1.length][array2[0].length]; //create final array
        
        for (int i = 0; i < multiArray.length; i++) { //fill array with zeros in case demensions do not match
            for (int j = 0; j < multiArray[0].length; j++) {
                multiArray[i][j] = 0;
            }
        }

if(array1[0].length!=array2.length){ //if array is not properly sized to multiply return blank array
    System.out.println("Error, array sizes do not match");
    return multiArray;
}

for (int i = 0; i < array1.length; i++) {  //loops multiply arrays
    for (int j = 0; j < array2[0].length; j++) { 
        for (int k = 0; k < array1[0].length; k++) { 
            multiArray[i][j] += array1[i][k] * array2[k][j];
        }
    }
}

        return multiArray;
    }

public static int test(Scanner scan){   //method for testing inputs are pos ints
   while(true){ 
        if(scan.hasNextInt()){ // test if int 
            int input=scan.nextInt();
            if(input>0){ //tests if positive 
            return input;
            }
            else{ //not positive, reprompt for input, restart loop
            System.out.println("Sorry, you didn’t enter a positive integer.");
            System.out.print("Please enter a positive integer: ");
            scan = new Scanner(System.in);
            continue;   
            }
        }
        else{//print error restart loop
            System.out.println("Sorry, you didn’t enter an integer.");
            System.out.print("Please enter a positive integer: ");
            scan = new Scanner(System.in);
            continue;
        }
        
   }
   
}
   
        
}
///////////////////////////////////////////////
//Josh Blatt
//CSE2 - Chen
//HW 13
//4DWin

//This program does random stuff to 4D Arrays


import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class FourDwin{  //start of class 
    
    public static void statArray(double [][][][] fourD){ //array finds stats
        
        double sum = 0;
        int r = 0;
         //loops through each member array while adding the sum
        for(int i = 0; i<fourD.length; i++){
            
            for(int j = 0; j<fourD[i].length; j++){

                for(int k = 0; k<fourD[i][j].length; k++){

                    for(int l = 0; l < fourD[i][j][k].length; l++){
                        sum = sum + fourD[i][j][k][l];
                        r++;
                    }
                }
            }
        }
        //print stats 
        double mean = sum/r;
        System.out.println("Members:   " + r);
        System.out.println("Sum:   " + sum);
        System.out.println("Mean:   " + mean);
        
    }
    
    public static double [][][][] sort4DArray(double [][][][] array){ //insertion sort 
    int n = array.length; //array length 
        for (int j = 1; j < n; j++) { //store in temp
            double [][][] key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i].length > key.length ) ) { //shift every value down while the size is bigger 
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
    }
    return array; //return 
    }
    
    public static double [][][][] sort3DArray(double [][][][] array){ //selection sort 
          for (int i = 0; i < array.length - 1; i++) //run for whole length 
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++) //run for whole loop
                if (array[j].length < array[index].length) //when the length is shorter 
                    index = j;
      
            double [][][] smallerNumber = array[index];  //swap 
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        return array;
    }
    
    public static void printArray(double [][][][] fourD){ //printing loop

//printing method for each member array 
        System.out.println("{");
        for(int i = 0; i<fourD.length; i++){
            System.out.println("  {");
            for(int j = 0; j<fourD[i].length; j++){
                System.out.println("    {");
                for(int k = 0; k<fourD[i][j].length; k++){
                    System.out.print("      {");
                    for(int l = 0; l < fourD[i][j][k].length; l++){
                        System.out.print(fourD[i][j][k][l] + ", ");
                    }
                    System.out.println("}");
                }
                System.out.println("    }");
            }
            System.out.println("  }");
        }
        System.out.println("}");

        
    }
    public static void main(String[] args){ //main method
        
        Scanner myScanner = new Scanner(System.in);
        int y = 0;
        int x = 0;
        Random random = new Random();
        
        System.out.print("Please input a positive int X: "); 
        while(true){ //testing for valid inputs 
            if(myScanner.hasNextInt()){ //if the input is an int 
                x = myScanner.nextInt();
                if(x > 0){ //if input is pos
                    break;
                }
                //if an int <= 0 is inputted:
                else{ //when not pos
                    System.out.println("Sorry, not a valid input.");
                    System.out.print("Please input a positive int X: ");
                    myScanner = new Scanner(System.in);
                    continue;
                }
            }
            else{ //when not int - restart
                System.out.println("Sorry, not a valid input.");
                System.out.print("Please input a positive int X: ");
                myScanner = new Scanner(System.in);
                continue;
            }
        }
    
        System.out.print("Enter an int Y where Y > X: ");    
        while(true){ //same test as above execpt testing if y is larger 
            if(myScanner.hasNextInt()){
                y = myScanner.nextInt();
                if(y > x){
                    break;
                }
                //if an int <= 0 is inputted:
                else{
                    System.out.print("Invalid input. Enter int for Y>X: ");
                    myScanner = new Scanner(System.in);
                    continue;
                }
            }
            //if an int is not inputted:s
            else{
                System.out.print("Invalid input. Enter int for Y>X: ");
                myScanner = new Scanner(System.in);
                continue;
            }
        }
            
        
        
        double [][][][] fourD = new double [x+random.nextInt(y-x+1)][][][]; //declare array 
        
        for(int i = 0; i<fourD.length; i++){ //randomize length of each member array 
            fourD[i] = new double[x+random.nextInt(y-x+1)][][];
            for(int j = 0; j<fourD[i].length; j++){
                fourD[i][j] = new double [x+random.nextInt(y-x+1)][];
                for(int k = 0; k<fourD[i][j].length; k++){
                    fourD[i][j][k] = new double [3];
                    for(int l = 0; l < fourD[i][j][k].length; l++){
                        fourD[i][j][k][l] = 30*random.nextDouble(); //random num between 0 and 30 
                    }
                }
            }
        }
        
        
        //call print and sorting methods
        System.out.println("Original Array:");
        printArray(fourD);
        System.out.println();
        System.out.println();
        
        double [][][][] sorted3D=sort3DArray(fourD);
        double [][][][] sorted4D=sort4DArray(fourD);
        System.out.println("Sorted Array:");
        printArray(sorted4D);
        System.out.println();
        System.out.println();
        
        
    }
}
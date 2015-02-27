//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// Lab06
//Smile Generator

//This program genertates smiles using different types of loops


    public class SmileGenerator { //create the class
        public static void main (String [ ] args) { //create the method

//for loop for 5 smiles
for(int forCounter =0; forCounter < 5; forCounter++ ){ //for loop counts 5 loops
    System.out.print(":)"); //print smile
}


System.out.println(" ");System.out.println(" "); // linebreak


int whileCounter = 5; //int counter of 5
            while (whileCounter>0){ //while counter is greater than 5 run the loop
            System.out.print(":)");//print smile
            whileCounter--; //subtract counter by 1
}

System.out.println(" ");System.out.println(" "); // linebreak


int doCounter = 5; //int counter of 5
do{//do while
        System.out.print(":)"); //print smile
        doCounter--;//subtract 1 from counter
        }while(doCounter>0);//end loop when counter equal 0

System.out.println(" ");System.out.println(" "); // linebreak


int randomLoop = (int)(Math.random()*100); //generate random number from 1 to 100
while (randomLoop>0){ //run loop until counter equal 0
        System.out.print(":)");//print smile
        randomLoop--;//subtract 1 from counter
}

System.out.println(" ");System.out.println(" "); // linebreak


int randomLoop2 = (int)(Math.random()*100); //generate random number from 1 to 100

int counter = 30; //secondary counter of 30
while (randomLoop2>0){ //run as random numeber is greater than 0
        if (counter>0){ //if soundary counter is greater than 0
            System.out.print(":)"); //print smiles
            randomLoop2--; //subtract 1 from counter
            counter--; //subtract 1 from counter
        }
    
        else{ //when secondary counter is 0
        counter=30; //reset counter back to 0
        System.out.println(" "); //linebreak
        }
}

System.out.println(" ");System.out.println(" "); // linebreak

int firstCounter=1; //declare counter
int secondCounter=1; //declare counter
while (firstCounter<5){ //run 4 loops
    if(secondCounter>0){ //when second counter is greater than 0
        System.out.print(":)");//print smile
        secondCounter--;//subtract from second counter
    }
    else{//when second counter equal 0
        firstCounter++;//add 1 to first counter
        System.out.println(" ");//linebreak
        secondCounter=firstCounter;//second counter equals first counter
    }
}


    } //end method
} //end class
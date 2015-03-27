//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
//Lab09
//Methods

//This program generates a random sentance 


public class Methods { //class
    public static void main(String[] args) { //main method
        
        
        //call for the 4 methods and store the variables
        String adjCall= adj();
        String subjCall=subject();
        String verbCall= verb();
        String objCall=object();
        
        //final print statement
        System.out.println("The "+adjCall+" "+subjCall+" "+verbCall+" into the "+objCall+".");
        
    }    //end main method

    
   public static String adj(){  //adj method
        
        int random=(int)(Math.random()*10); //random number generator between 0 and 9
        
        String adjOut=" "; //initialze and declare output var
        
        
        //switch statment that picks and random adjective
        switch (random){
            case 0:
                adjOut="tired";
                break;
                
            case 1:
                adjOut="lazy";
                break;

            case 2:
                adjOut="fat";
                break;

            case 3:
                adjOut="hungry";
                break;

            case 4:
                adjOut="lonely";
                break;

            case 5:
                adjOut="timid";
                break;

            case 6:
                adjOut="fierce";
                break;

            case 7:
                adjOut="angry";
                break;

            case 8:
                adjOut="quick";
                break;

            case 9:
                adjOut="young";
                break;
        }
        return adjOut; //return adjective
   } //end method
   
   public static String subject(){//subject method
        
        int random=(int)(Math.random()*10);//random number generator between 0 and 9

        String subjOut=" ";//initialze and declare output var
        //switch statment that picks and random adjective
        switch (random){
            case 0:
                subjOut="bear";
                break;
                
            case 1:
                subjOut="cat";
                break;

            case 2:
                subjOut="dog";
                break;

            case 3:
                subjOut="aardvark";
                break;

            case 4:
                subjOut="ant";
                break;

            case 5:
                subjOut="gazelle";
                break;

            case 6:
                subjOut="deer";
                break;

            case 7:
                subjOut="porcupine";
                break;

            case 8:
                subjOut="wallabee";
                break;

            case 9:
                subjOut="racoon";
                break;
        }
        return subjOut; //returns random subject
   }//end subject method     

   public static String verb(){//verb method
        
        int random=(int)(Math.random()*10);//random number generator between 0 and 9

        String verbOut=" ";//initialze and declare output var
        //switch statment that picks and random adjective
        switch (random){
            case 0:
                verbOut="ran";
                break;
                
            case 1:
                verbOut="walked";
                break;

            case 2:
                verbOut="sauntered";
                break;

            case 3:
                verbOut="crawled";
                break;

            case 4:
                verbOut="ambled";
                break;

            case 5:
                verbOut="sprinted";
                break;

            case 6:
                verbOut="snuck";
                break;

            case 7:
                verbOut="crept";
                break;

            case 8:
                verbOut="leaped";
                break;

            case 9:
                verbOut="wandered";
                break;
        }
        return verbOut; //returns random verb
   }//end verb method  

   public static String object(){//obeject method
        
        int random=(int)(Math.random()*10);//random number generator between 0 and 9

        String objOut=" ";//initialze and declare output var
        //switch statment that picks and random adjective
        switch (random){
            case 0:
                objOut="forest";
                break;
                
            case 1:
                objOut="woods";
                break;

            case 2:
                objOut="ocean";
                break;

            case 3:
                objOut="canyon";
                break;

            case 4:
                objOut="valley";
                break;

            case 5:
                objOut="river";
                break;

            case 6:
                objOut="cave";
                break;

            case 7:
                objOut="school";
                break;

            case 8:
                objOut="post office";
                break;

            case 9:
                objOut="bank";
                break;
        }
        return objOut; //returns random object
   }          
    
}    
//////////////////////////////////
//Josh Blatt
//CSE2 - Chen
// Lab05
//Space Exploration

//This program prints significant space events from 2000-2010 

   
   public class SpaceExploration { //create the class
        public static void main (String [ ] args) { //create the method
        
        int year = (int) ((Math.random() * 11)+ 2000); //randomize year from 2000 to 2010
        
        
System.out.println("Here is a timeline of space exploration events from "+year+ " to 2000:"); //print intro   
        
        switch (year){//switch year
        
        case 2010://print 2010 and all other years
            System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
            
        case 2009://print 2009 and all other years
            System.out.println("2009: N/A");
            
        case 2008://print 2008 and all other years
            System.out.println("2008: Kepler launched to study deep space");
            
        case 2007://print 2007 and all other years
            System.out.println("2007: N/A");
        
        case 2006://print 2006 and all other years
            System.out.println("2006: Spacecraft returns with collections from a comet");
            
        case 2005://print 2005 and all other years
            System.out.println("2005: Spacecraft collies with comet");
        
        case 2004://print 2004 and all other years
            System.out.println("2004: N/A");
            
        case 2003://print 2003 and all other years
            System.out.println("2003: Largest infrared telescope released");

        case 2002://print 2002 and all other years
            System.out.println("2002: N/A");
            
        case 2001://print 2001 and all other years
            System.out.println("2001: First spacecraft lands on asteroid");
            
        case 2000://print 2000 and all other years
            System.out.println("2000: First spacecraft orbits an asteroid");
            
        }//end switch
     
    }//end method
}//end class


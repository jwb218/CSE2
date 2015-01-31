/////////////////////////////////////
//Josh Blatt
//Homework 2
//Arithmetic

//define a class
public class Arithmetic {
    	// add main method
   	public static void main(String[] args) {
   	    
        //Number of pairs of socks
             int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
            double sockCost$=2.58;

        //Number of drinking glasses
            int nGlasses=6;
        //Cost per glass
             double glassCost$=2.29;

        //Number of boxes of envelopes
            int nEnvelopes=1;
        //cost per box of envelopes
            double envelopeCost$=3.25;
            double taxPercent=0.06;

        double taxSocks$;       //cost of 1 pair of socks with tax
        double taxGlasses$;     //cost of 1 drinking glass with tax
        double taxEnvelopes$;   //cost of 1 box of envelopes with tax
        double totalSockCost$;   //total cost of socks
        double totalGlassCost$;   //total cost of glasses
        double totalEnvelopeCost$;   //total cost of envelopes
        double totalCost$; //total cost of transaction


//print out cost of each item and number of those items purchased
System.out.println("###################################################");    
System.out.println("At Walmart you purchased the following items:");    
System.out.println("");
System.out.println(" "+nSocks+" pairs of socks for $"+sockCost$+" each, before tax");     
System.out.println(" "+nGlasses+" drinking glasses for $"+glassCost$+" each, before tax");
System.out.println(" "+nEnvelopes+" box of envelopes for $"+envelopeCost$+" each, before tax");
System.out.println("");
System.out.println("");

//calculate the total cost for one of each individual item
taxSocks$=sockCost$*(1+taxPercent);
taxGlasses$=glassCost$*(1+taxPercent);
taxEnvelopes$=envelopeCost$*(1+taxPercent);

//create new variables for the tax for one of each individual item
double indvSockTax;
double indvGlassesTax;
double indvEnvelopeTax;

//calculate the tax for one of each individual item
indvSockTax=sockCost$*(taxPercent);
indvGlassesTax=glassCost$*(taxPercent);
indvEnvelopeTax=envelopeCost$*(taxPercent);

//convert all following variables to have 2 decimal places
taxSocks$ = taxSocks$*100;
taxSocks$ = (int) taxSocks$;
taxSocks$ = (double) taxSocks$/100;

taxGlasses$ = taxGlasses$*100;
taxGlasses$ = (int) taxGlasses$;
taxGlasses$ = (double) taxGlasses$/100;

taxEnvelopes$ = taxEnvelopes$*100;
taxEnvelopes$ = (int) taxEnvelopes$;
taxEnvelopes$ = (double) taxEnvelopes$/100;

indvSockTax = indvSockTax *100;
indvSockTax = (int) indvSockTax;
indvSockTax = (double) indvSockTax/100;

indvGlassesTax = indvGlassesTax *100;
indvGlassesTax = (int) indvGlassesTax;
indvGlassesTax = (double) indvGlassesTax/100;

indvEnvelopeTax = indvEnvelopeTax *100;
indvEnvelopeTax = (int) indvEnvelopeTax;
indvEnvelopeTax = (double) indvEnvelopeTax/100;



//print the cost of each item with tax and the tax for one of those items
System.out.println("This is the cost of the individual items plus tax:");
System.out.println(" The cost per pair of socks with tax is $"+taxSocks$+" ($"+indvSockTax+" in tax)");
System.out.println(" The cost per drinking glass with tax is $"+taxGlasses$+" ($"+indvGlassesTax+" in tax)");
System.out.println(" The cost per box of envelopes with tax is $"+taxEnvelopes$+" ($"+indvEnvelopeTax+" in tax)");
System.out.println("");

    //calculate the total cost for all of each item and add them together into total cost
    totalSockCost$=nSocks*sockCost$*(1+taxPercent);
    totalGlassCost$=nGlasses*glassCost$*(1+taxPercent);
    totalEnvelopeCost$=nEnvelopes*envelopeCost$*(1+taxPercent);   
    
    totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;

//covert all folloing variables to have 2 decimal points
totalSockCost$ = totalSockCost$*100;
totalSockCost$ = (int) totalSockCost$;
totalSockCost$ = (double) totalSockCost$/100;

totalGlassCost$ = totalGlassCost$*100;
totalGlassCost$ = (int) totalGlassCost$;
totalGlassCost$ = (double) totalGlassCost$/100;

totalEnvelopeCost$ = totalEnvelopeCost$*100;
totalEnvelopeCost$ = (int) totalEnvelopeCost$;
totalEnvelopeCost$ = (double) totalEnvelopeCost$/100;

totalCost$ = totalCost$*100;
totalCost$ = (int) totalCost$;
totalCost$ = (double) totalCost$/100;


//print out cost of each type of item with tax and total cost
System.out.println("Therefore including tax, a total of $"+totalSockCost$+" was spent on socks,");
System.out.println("a total of $"+totalGlassCost$+" was spent on glasses");
System.out.println("and a total of $"+totalEnvelopeCost$+" was spent on envelopes.");
System.out.println("Overall you spent, $"+totalCost$+" at Walmart.");

//create new variables for cost with tax and the total tax
double costNoTax = totalCost$/(1+taxPercent);
double costTax = totalCost$/(1+taxPercent)*taxPercent;


//convert following variables to have 2 decimal places
costNoTax = costNoTax*100;
costNoTax = (int) costNoTax;
costNoTax = (double) costNoTax/100;

costTax = costTax*100;
costTax = (int) costTax;
costTax = (double) costTax/100;


//print cost before tax and total tax
System.out.println("$"+costNoTax+" was the cost before tax and $"+costTax+" was tax.");
System.out.println("###################################################");

   	}
   	
}
import java.time.Period;
import java.time.LocalDate;



class Main{
	
	public static void main(String [] args){
		AgeDifferenceCalculator adc;
		adc = new AgeDifferenceCalculator();
		Period me = adc.getAge(2000,11,23);
		Period you = adc.getAge(2004,02,17);

	    System.out.println("I am " + me.getYears() +" years and "+me.getMonths()+" months");
	    System.out.println("You are " + you.getYears() +" years and "+you.getMonths()+" months");
	  	System.out.println("Age difference: "+adc.getDifference(me, you));    

	    
	}

}
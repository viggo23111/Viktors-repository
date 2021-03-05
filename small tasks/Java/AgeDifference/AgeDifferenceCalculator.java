import java.time.Period;
import java.time.LocalDate;


class AgeDifferenceCalculator{
	
	
	public static void AgeDifferenceCalculator(){ 
		
	}

	public static String getDifference(Period me, Period you){
		String s;
		s =  Math.abs(you.minus(me).getYears())+" year and "+Math.abs(you.minus(me).getMonths())+" months and "+Math.abs(you.minus(me).getDays())+" days";
	return s;

	}


	public static Period getAge(int year, int month, int day){
		LocalDate birthday = LocalDate.of(year,month,day);
		LocalDate today = LocalDate.now();
		Period period = Period.between(birthday, today);
	return period;

	}

}
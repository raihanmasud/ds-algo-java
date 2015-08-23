
public class Date {

	static int day, month, year;
	
	public static void printWeekDays(int totalDays){
		String days[] = {
				 "Sunday",
				 "Monday",
				 "Tuesday",
				 "Wednesday",
				 "Thursday",
				 "Friday",
				 "Saturday"
				 };
		
		int dayOfTheWeek = totalDays%7;
		int startDay = (day - dayOfTheWeek)>0 ? (day - dayOfTheWeek): 30 +(day - dayOfTheWeek);   
		if((day - dayOfTheWeek)<0)
			month -=1;
		
		day = startDay;
		
		for(int i=0;i<7;i++){
			
			if(day>30) {
				day = 1;
				month += 1;
			}
			
			if(month>12) {
				month = 1;
				year += 1;
			}
			
			System.out.println(days[i]+", "+month +"/" + day +"/"+ year);
			day++;
			
		}
	
	}
	
	
	public static int getDay( int month, int day, int year){
		
		
		int totalDays =0;
		totalDays = 360*(year-2000);
		
		switch(month-1){
		
			case 1: totalDays += 30;
			case 2: totalDays += 30;
			case 3: totalDays += 30;
			case 4: totalDays += 30;
			case 5: totalDays += 30;
			case 6: totalDays += 30;
			case 7: totalDays += 30;
			case 8: totalDays += 30;
			case 9: totalDays += 30;
			case 10: totalDays += 30;
			case 11: totalDays += 30;
		
		}
		
		totalDays += (day-1);
		
		return totalDays;
	}
	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day = 6;
		month = 1;
		year = 2000;
		
		
		printWeekDays(getDay(month, day, year));
		
	}

}

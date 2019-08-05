/*	Filename: DaysTilNextMonth.java
	Date: 8/1/2019
	Author: David T.
	
	description...
*/
	
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysTilNextMonth
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		LocalDate userDate;
		LocalDate compareDate;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("LLLL d, YYYY");
		int day;
		int month;
		int year = 2019;
		int diff;
		
		System.out.println();
		System.out.print("Enter the numerical value of a month >> ");
		month = keyboard.nextInt();
		System.out.print("Enter the numerical value of a day of the month >> ");
		day = keyboard.nextInt();
		
		userDate = LocalDate.of(year,month,day);
		compareDate = userDate.plusMonths(1);
		compareDate = compareDate.withDayOfMonth(1);
		
		diff = userDate.lengthOfMonth()-userDate.getDayOfMonth()+1;
		
		System.out.println();
		System.out.println("You entered "+userDate.format(formatter)+". There "+ ((diff == 1) ? "is "+diff+" day " : "are "+diff+" days ") +"until the next month, "+compareDate.format(formatter)+".");
	}
		
}

import java.util.Scanner;
public class Calender
{
	public static int month(int mn)
	{
		int returnmonth = 0;
		switch(mn){
			case 1:
			     returnmonth=1;
                 break;				 
			case 2:
			     returnmonth=4;
                 break;
			case 3:
			     returnmonth=4;
                 break;
			case 4:
			     returnmonth=0;
                 break;
			case 5:
			     returnmonth=2;
                 break;
			case 6:
			     returnmonth=5;
                 break;
			case 7:
			     returnmonth=0;
                 break;
			case 8:
			     returnmonth=3;
                 break;
			case 9:
			     returnmonth=6;
                 break;
			case 10:
			     returnmonth=1;
                 break;
			case 11:
			     returnmonth=4;
                 break;
			case 12:
			     returnmonth=6;
                 break;
			default:
			     System.out.println("Invalid month");
		        break;
		}
		return returnmonth;
	}




	public static int Year(int Yr)
	{
		int returnyr = 0;
		if(Yr>1500 && Yr<1599)
		{
			return (returnyr=0);
		}
		else if(Yr>1600 && Yr<1699)
		{
			return (returnyr=6);
		}
		else if(Yr>1700 && Yr<1799)
		{
			return (returnyr=4);
		}
		else if(Yr>1800 && Yr<1899)
		{
			return (returnyr=2);
		}
		else if(Yr>1900 && Yr<1999)
		{
			return (returnyr=0);
		}
		else if(Yr>2000 && Yr<2099)
		{
			return (returnyr=6);
		}
		return -1;
	}




	public static String Day(int rem)
	{
		String returnDayName = " ";
		switch(rem){
			case 0:
			     returnDayName="Saturday";
                 break;				 
			case 1:
			     returnDayName="Sunday";
                 break;
			case 2:
			     returnDayName="Monday";
                 break;
			case 3:
			     returnDayName="Tuesday";
                 break;
			case 4:
			     returnDayName="Wednesday";
                 break;
			case 5:
			     returnDayName="Thursday";
                 break;
			case 6:
			     returnDayName="Friday";
                 break;
			default:
                 System.out.println("Invalid Day");			
				 break;
		}
		return returnDayName;
	}
	



	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int date =  sc.nextInt();
		int month =  sc.nextInt();
		int year =   sc.nextInt();

		int monthcode =0;
		int centuriecode=0;
		int reminder =0;
		String dayname=" ";

		monthcode = Calender.month(month);
		centuriecode = Calender.Year(year);

		int yearunitplace	= year%10;
		int year1 = year/10;
		int yeardecimalplace = year1%10;

		int lasttwodigit=yeardecimalplace*10+yearunitplace; 

		 int calculation = date+monthcode+centuriecode+lasttwodigit+(lasttwodigit/4);
		 reminder = calculation%7;

		 // for leap year we need to take reminder -1 for jan and feb month
		 if(((year%4==0 && year%100!=0) || (year%4==0 && year%400==0)) && (month == 1 || month == 2))
		 {
		 	if(reminder==0)
		 		reminder = 6;
		 	else if(reminder<=6 && reminder>0)
		 		reminder -=1 ;
		 }

		 dayname = Day(reminder);

		 System.out.println(dayname);





	}
}
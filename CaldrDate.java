package comb.pack1;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CaldrDate {

	public static void main(String[] args) {
		
		
		
		
		Date date = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss.SSSZ");//"dd/MM/yyyy"
		String stringDate= DateFor.format(date);
		System.out.println(stringDate);
		
	}
}	

/*Date and Time Pattern	Result
"dd/MM/yy"	25/06/19
"dd MMM yyyy"	25 Jun 2019
"yyyy-MM-dd"	2019-06-25
"dd-MM-yyyy h:mm a"	25-06-2019 1:11 AM
"dd-MM-yyyy hh:mm a, zzzz"	25-06-2019 01:11 AM, Singapore Time
"dd-MM-yyyy HH:mm:ss"	25-06-2019 01:11:28
"yyyy-MM-dd HH:mm:ss.SSS"	2019-06-25 01:11:28.954
"yyyy-MM-dd HH:mm:ss.SSSZ"	2019-06-25 01:11:28.954+0800
"EEEE, dd MMMM yyyy HH:mm:ss.SSSZ" 	Tuesday, 25 June 2019 01:11:28.954+0800 
"yyMMddHHmmssSSS"	190625011128954 */


	



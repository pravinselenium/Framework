package javabasicsPart2pkg;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");  
		
		System.out.println( sdf.format(c.getTime()));
		System.out.println( c.get(Calendar.DAY_OF_MONTH));
		System.out.println( c.get(Calendar.DAY_OF_WEEK));
		System.out.println( c.get(Calendar.AM_PM));
		System.out.println( c.get(Calendar.MINUTE));

	}

}

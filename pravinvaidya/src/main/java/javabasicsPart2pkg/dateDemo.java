package javabasicsPart2pkg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//date class comes from java.util package
		//google it if we want different date and time format so we can provide argument accordingly
		
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");  
		System.out.println( sdf.format(d));
		
		SimpleDateFormat s = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println( s.format(d));
		
		//google it if we want different date and time format so we can provide argument accordingly
		//here we have taken only 2 arguments we can give more ,need to google it

	}

}

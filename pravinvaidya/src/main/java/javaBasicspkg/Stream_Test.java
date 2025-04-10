package javaBasicspkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Stream_Test {
	
	public static void main(String[] args) {
		// count the number of names starting with alphabet A in list
		
		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhijit");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			if (actual.startsWith("A"))
			{
				count++;
			}
		}
		//System.out.println(count);
		
		
	}
  //@Test
	public void Streamfilter()
	{
		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhijit");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		//there is not life of intermediate operation if there is no terminal operation
		//terminal operation execute only if intermediate (filter) returns true
		//we can create stream
		//
		Long d =Stream.of("Abhijit","Don","Alekhya","Adam","Ram").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
				//System.out.println(d);
				
		//print all the names of Arraylist
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));	}
	
	//@Test
	public void streamMap()
	{
		///print the names ends with "a" with upper case
	//	Stream.of("Abhijit","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			//	.forEach(s->System.out.println(s));
		//print the names start with "a" with upper case and sorted
		List<String> names = Arrays.asList("Azbhijit","Don","Alekhya","Adam","Ram");
		names.stream().filter(s->s.startsWith("A"))	.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));	
	

}
	//@Test
	public void ListMerge()
	{
		ArrayList<String> names = new ArrayList<String>();

		names.add("MAN");
		names.add("Don");
		names.add("WOMEN");
		
		
		List<String> name1 = Arrays.asList("Azbhijit","Don","Alekhya","Adam","Ram");
		//merging 2 different lists
		Stream<String> newStream = Stream.concat(names.stream(), name1.stream());
		//i commented below code line because 1 stream we can only use for 1 operation
		//newStream.forEach(pravin->System.out.println(pravin));
		boolean flag = newStream.anyMatch(pravin->pravin.equalsIgnoreCase("Adam"));//to check validation change this spelling
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	@Test
	public void StreamCollect() 
	{
		List<String> lm = Stream.of("Abhijit","Don","Alekhya","Adam","Ram").collect(Collectors.toList());
		System.out.println(lm.get(0));
		
		List<Integer> values = Arrays.asList(1,5,5,3,4,2,2);
		//print unique number from this array
		//then sort it, and print 3rd index value
		//values.stream().distinct().forEach(s->System.out.println(s));//print unique number from this array
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}
	
}
	    



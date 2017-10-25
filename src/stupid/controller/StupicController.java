package stupid.controller;

import java.util.Scanner;


public class StupicController
{
	private String [] words = { "One", "Two", "Three" };
	private int [] numbers;
	
	public StupicController()
	{
		words = new String[5];
		numbers = new int [10];
		
	}
	
	public void start()
	{
		System.out.println(words);
		System.out.println(numbers);
		
		words[0] = "Mama";
		words[1] = "Mia";
		words[2] = "Here we";
		words[3] = "Go";
		words[4] = "Again";
		
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		
		for (String current : words)
		{
			System.out.println(current);
		}
		
		for (int index = 0; index < numbers.length; index += 1)
		{
			numbers[index] = index + 1;
			
			System.out.println(numbers[index]);
		}
		
		words = new String [] {"one", "two", "three", "four", "five" };
//		System.out.println("I like to mess with cards");
//		
//		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner; 
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = firstScanner.nextLine();
		System.out.println("Oh cool, you like "+ answer + ", that's pretty neato my dude!");
		System.out.println("What's your favorite color?");
		String answer2 = firstScanner.nextLine();
		System.out.println("Wow, "+ answer2 + ", is an ugly color, liking that is the same as sinning!");
		
	}
}

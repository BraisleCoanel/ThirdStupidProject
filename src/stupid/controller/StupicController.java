package stupid.controller;

import java.util.Scanner;


public class StupicController
{
	public void start()
	{
		System.out.println("I like to mess with cards");
		
		testScanner();
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

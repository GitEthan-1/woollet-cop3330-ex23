/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ethan Woollet
 */
package ex23.base;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exercise 23 - Troubleshooting Car Issues
 * An expert system is a type of artificial intelligence program that uses a knowledge base and a set of rules to perform a task that a human expert might do.
 * Many websites are available that will help you self-diagnose a medical issue by answering a series of questions.
 * And many hardware and software companies offer online troubleshooting tools to help people solve simple technical issues before calling a human.
 *
 * Create a program that walks the user through troubleshooting issues with a car. Use the following decision tree to build the system:
 *
 * Example Output
 *
 * Is the car silent when you turn the key? y
 * Are the battery terminals corroded? n
 * The battery cables may be damaged.
 * Replace cables and try again.
 *
 * Constraint
 *
 * Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.
 *
 * Challenge
 *
 * Investigate rules engines and inference engines. These are powerful ways to solve complex problems that are based on rules and facts.
 * Identify a rules engine for your programming language and use it to solve this problem
 */

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Is the car silent when you turn the key? ");
		if(in.nextLine().toLowerCase(Locale.ROOT).charAt(0) == 'y')
		{
			System.out.print("Are the battery terminals corroded? ");
			if(in.nextLine().toLowerCase(Locale.ROOT).charAt(0) == 'y')
			{
				
				System.out.println("The battery terminals may be corroded.\nClean terminals and try again.");
			}
			else
			{
				System.out.println("The battery cables may be damaged.\nReplace the cables and try again.");
			}
		}
		else
		{
			System.out.print("Does the car make a slicking noise? ");
			if(in.nextLine().toLowerCase(Locale.ROOT).charAt(0) == 'y')
			{
				System.out.println("The battery may be dead.\nReplace the battery and try again.");
			}
			else
			{
				System.out.print("Does the car crank up but fail to start? ");
				if(in.nextLine().toLowerCase(Locale.ROOT).charAt(0) == 'y')
				{
					System.out.println("the spark plugs may be loose or connected improperly.\nCheck the spark plug connections and try again.");
				}
				else
				{
					System.out.print("Does the engine start and then die? ");
					if(in.nextLine().toLowerCase(Locale.ROOT).charAt(0) == 'y')
					{
						System.out.print("Does your car have fuel injection? ");
						if(in.nextLine().toLowerCase(Locale.ROOT).charAt(0) == 'y')
						{
							System.out.println("Your car needs a mechanic to see to it.\nGet it in for service.");
						}
						else
						{
							System.out.println("The choke may be blocked or stuck.\nCheck to ensure the choke is opening and closing.");
						}
					}
					else
					{
						System.out.println("This should not be possible..");
					}
				}
			}
		}
	}
}

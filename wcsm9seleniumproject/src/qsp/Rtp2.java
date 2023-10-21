package qsp;

import java.util.Scanner;

public class Rtp2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		 String animal = sc.next();
		
	if (animal.equalsIgnoreCase("dog")) // equal ignore case
		{
			System.out.println("bow");
		}
		else if(animal.equalsIgnoreCase("cat"))
		{
			System.out.println("meow");
		}
		else 
		{
			System.out.println("invalid input of number");
		}
	}

}

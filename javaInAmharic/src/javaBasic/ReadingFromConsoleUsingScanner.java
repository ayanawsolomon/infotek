package javaBasic;

import java.util.Scanner;

public class ReadingFromConsoleUsingScanner {
	  //System.in mease read from keyboard
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter your name");
		System.out.println("Good morning " + sn.nextLine());
		System.out.println("Enter your age");
		System.out.println("your age is " + sn.nextInt());
		

		
	}

}

package fcu.edu.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.print("input string_1:");
		String string1 = scannerObject.nextLine();
		System.out.print("input string_2:");
		String string2 = scannerObject.nextLine();
		
		if(string1.compareToIgnoreCase(string2)==0)
			System.out.println("The two strings are the same.");
		
		else
			System.out.println("The two strings are not the same.");
			
		
	}

}

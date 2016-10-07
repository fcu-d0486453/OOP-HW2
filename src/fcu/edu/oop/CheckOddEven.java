package fcu.edu.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerObject = new Scanner(System.in);
        
		int a;
		System.out.print("Input integer :");
		
		a = scannerObject.nextInt();
		
		if(a%2==0)
			System.out.println("The input integer is Even Number.");
		else
			System.out.println("The input integer is Odd Number."); 
			
	}

}

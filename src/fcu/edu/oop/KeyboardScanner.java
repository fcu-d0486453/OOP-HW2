package fcu.edu.oop;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		float b;
		
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.print("Enter a integer: ");
		a = scannerObject.nextInt();
		
		System.out.print("Enter a float point number: ");
		b = scannerObject.nextFloat();
		
		System.out.print("Enter a you name: ");
		String c = scannerObject.next();
		System.out.println("-----------------------------");
		System.out.println("Enter a integer: "+a);
		System.out.println("Enter a float point number: "+b);
		System.out.println("Enter a you name: "+c);
		
		System.out.print("Hi "+c);
		System.out.print(", the multiplication of "+a);
		System.out.printf("and %f is %e",b,b);
		
		 scannerObject.close(); 
	}

}

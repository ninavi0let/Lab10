package co.gc;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		double radius;
		String cont = "y";
		
		do { 
		
			do {
		radius = Validator.getDouble(scan, "Enter a radius: ");
		Circle circleObject = new Circle(radius);
		
		
		circleObject.getArea();
		circleObject.getCircumference();
		
		System.out.println("Circumference: " + circleObject.getFormattedCircumference());
		System.out.println("Area: " + circleObject.getFormattedArea());
		
		
		System.out.println("Would you like to continue? (y/n)");
		String userInput = scan.next();
		
		} while(cont == "y");
		} while(radius > 0);
		
		System.out.println("Goodbye!");
		
	}

}

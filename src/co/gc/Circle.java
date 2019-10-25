package co.gc;

import java.util.Scanner;

public class Circle {

		Scanner scan = new Scanner(System.in);
		
		double radius;
		double area;
		double circumference;
		
		
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		circumference = (radius * 2) * Math.PI;
		return circumference;
	}
	
	public double getArea() {
		area = Math.PI * radius * radius;
		return area;
	}
	
	public static String formatNumber(double x) {
		return String.format("%.2f", x);
	}
	
	public String getFormattedCircumference() {
		return formatNumber(circumference);
	}
	
	public String getFormattedArea() {
		return formatNumber(area);
	}

}

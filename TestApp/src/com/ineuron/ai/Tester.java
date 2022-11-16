package com.ineuron.ai;

import java.util.Scanner;

abstract class Shapes{
	
	void welcome () {
		System.out.println("Welcome to the program ! , please enter the values and the program should display the the area:-");
	}
	
	 float input() {
		 return 0;
	 }
	 double area () {
		 return 0;
	 }

}

class Triangle extends Shapes{

	@Override
	float input() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the side of the triangle :-");
		float side =scan.nextFloat();
		return side ;
	}	
	
	public double area() {
		
		float a= input();
		double area=(a*a);
		System.out.println("the area of the triangle is :- " + area);
		return area;
	}
	
}

class Circle extends Shapes{

	@Override
	float input() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter the raduis of the circle :-");
		float radius= scan.nextFloat();
		return radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		float a= input();
		double area=(3.14*a*a);
		return area;
	}
}	
	
class Validator {
	
	void gaurav(Shapes s)
	{
		s.welcome();
		s.input();
		s.area();
	}
}
	

class Tester {
	public static void main(String[] args) {
	
		
		Shapes s= new Triangle();
		Validator validate= new Validator();
		validate.gaurav(s);
		
		Shapes cr= new Circle();
		
	}
}
package com.practice_question;



abstract class Shape2{
	public abstract void getPerimeter(); 
	public abstract void getArea1();
		
	}	
 class Circle extends Shape2{
	float pi=3.14f;
	double r =5.0;
	@Override
	public void getPerimeter() {
		System.out.println("perimeter of circle is:"+(2*pi*r));
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getArea1() {
		System.out.println("area of circle is:"+(pi*r*r));
		// TODO Auto-generated method stub
		
	}
	
 }	


public class Array5Que {
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.getArea1();
		c1.getPerimeter();
	}

}

package com.practice_question;



class shape{
	public double getArea() {
		return 0.0;
		
	}
}class Rectangle extends shape{
	private double width;
	private double height;
	
	public Rectangle (double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	public  double getArea() {
		return width*height;
		
	}
}

public class Array3Que {
	public static void main(String[] args) {
		Rectangle rectangle= new Rectangle(2.5,3.0);
		double area=rectangle.getArea();
		System.out.println("area of rectangle"+area);
		
	}

}

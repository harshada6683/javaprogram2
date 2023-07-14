package com.practice_question;


class Animal{
	public void move() {
		System.out.println("animal is moving");
	}
}
class cheetah extends Animal{
	
	public void move() {
		System.out.println("cheetah is running");
		
	}
}

public class Array4Que {
	public static void main(String[] args) {
		Animal an=new Animal();
		an.move();
		
		cheetah ch=new cheetah();
		ch.move();
		
	}

}

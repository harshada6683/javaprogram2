package com.practice_question;
/*
 *write a java pragram to create a class called animal with a method called make sound()
 *crerate a subclass called cat that overrides the subclass called cat that overrides the makeSound()
 *method to bark
 *
 */

class Animal1 { //animal class
	
	public void makesound() { //method makesound
		System.out.println("animal making sound");	//print animal sound
	}
}
class cat extends Animal1{ // cat inherit by extends to parent class
	
//	public void makesound() {
//		System.out.println("cat is moving"); //print cat sound
//		
//	}
	
	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		super.makesound();
		System.out.println("cat is moving"); //print cat sound

	}
}

public class HomeworkQue { // main class
	public static void main(String[] args) { // main method
//		animal ani=new animal();
//		ani.makesound();
		
		cat cat=new cat();
		cat.makesound();
		
				
		
	}

}

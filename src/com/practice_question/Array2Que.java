package com.practice_question;



class vehicle{
	public void drive() {
		System.out.println("driving the vehicle");
		
	}
}
class car extends vehicle{
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
	}
	
	}



public class Array2Que {
	public static void main(String[] args) {
		vehicle vehi=new vehicle();
		vehi.drive();
		
		car ca=new car();
		ca.drive();
	}

}

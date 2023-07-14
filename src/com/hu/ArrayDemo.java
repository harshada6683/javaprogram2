package com.hu;

import java.util.Scanner;

//*
//Array:collection of data similar type
//start from 0
//size index-1

//types of array
//
//1D ; [no of row]
//2D : [no of row][no of col]
//jagged/ragged array:no of col is not fixed
//[no of row][]

public class ArrayDemo {
	public static void main(String[] args) {
	 
	int[] a=new int[5];//java pattern
//	int a[]=new int[5];//c patterm
	
//	for (int i = 0; i < 5; i++) {
//		a[i]=i;
//		System.out.println(a[i]);
	
	Scanner sc=new Scanner(System.in);
	for (int i = 0; i < a.length; i++) {
		
		System.out.println("enter a no");
		a[i] = sc.nextInt();	
		
	}
//	loop for o/p
for (int i = 0; i < a.length; i++) {
		
		System.out.println("enter a no"+a[i]);
		a[i] = sc.nextInt();	
		
	
		
	}
		
	}}
	

	



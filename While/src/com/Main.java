package com;

import java.util.List;

 class Animal{
	 public void sound() {
		 System.out.println("Animal makes sound");
	 }
 }
 
 class dog extends Animal{
	 @Override
	 public void sound() {
		 System.out.println("dog makes sound");
	 }
 }
 
 public class Main{
	 public static void main(String[] args) {
		Animal a=new Animal();
		Animal a1= new dog();
		a.sound();
		a1.sound();
//		System.out.println(a);
	}
 }

 
	 



//Given a list of names, count the frequency of each name and store the result in a map.
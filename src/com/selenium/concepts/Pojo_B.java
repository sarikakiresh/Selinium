package com.selenium.concepts;

public class Pojo_B {

	public static void main(String[] args) {

		Pojo_A pojo = new Pojo_A();
		pojo.setAge(14);
		int age = pojo.getAge();
		System.out.println("Age:" + age);

	}

}

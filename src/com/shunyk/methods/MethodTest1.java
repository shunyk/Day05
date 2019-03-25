package com.shunyk.methods;

import java.util.Scanner;

public class MethodTest1 {

	//
	
	public void hap(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void minus() {
		System.out.println(10-20);
	}
	
	public void bark() {
		int dog = 0;
		Scanner sc = new Scanner(System.in);
		//System.out.println("개의 크기 입력");
		//int dog = sc.nextInt();
		if(dog>=90) {
			System.out.println("컹컹컹");
		}else if(dog>=60) {
			System.out.println("멍멍멍");
		}else {
			System.out.println("왈왈알");
		}
	}
}

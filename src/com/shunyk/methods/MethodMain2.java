package com.shunyk.methods;

import java.util.Scanner;

public class MethodMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary = 0;
		int select;
		boolean check=true;
		MethodTest2 method = new MethodTest2();
		
		do {
			System.out.println("1. 급여입력");
			System.out.println("2. 고용보험");
			System.out.println("3. 의료보험");
			System.out.println("4. 국민연금");
			System.out.println("5. 산재보험");
			System.out.println("6. 종      료");
			select = sc.nextInt();
			
			switch(select){
			case 1:
				System.out.println("급여 입력");
				salary = sc.nextInt();
				break;
			case 2:
				System.out.println("고용 보험");
				method.m1(salary);
				break;
			case 3:
				System.out.println("의료 보험");
				method.m2(salary);
				break;
			case 4:
				System.out.println("국민 연금");
				method.m3(salary);
				break;
			case 5:
				System.out.println("산재 보험");
				method.m4(salary);
				break;
			default: 
				check = false;
			}
			
		}while(check);

	}

}

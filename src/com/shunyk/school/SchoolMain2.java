package com.shunyk.school;

import java.util.Scanner;

public class SchoolMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int student=sc.nextInt();
		Student st[] = new Student[student];
		for(int i=0; i<student; i++) {

			System.out.println("이름 입력");
			st[i].name = sc.next();
			System.out.println("번호 입력");
			st[i].num = sc.nextInt();
			
		}
		
		for(int i=0; i<student; i++) {
			System.out.println(st[i].name);
			System.out.println(st[i].num);
		}
		
	}

}

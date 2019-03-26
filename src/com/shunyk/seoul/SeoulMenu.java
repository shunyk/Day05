package com.shunyk.seoul;

import java.util.Scanner;

public class SeoulMenu {

	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentInput si = new StudentInput();
		boolean check=true;
		StudentView sv = new StudentView();
		StudentSearch ss = new StudentSearch();
		Student[] students = null;
		while(check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 정보전체출력");
			System.out.println("3. 학생검색출력");
			System.out.println("4. 종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				students = si.makeStudent();
				break;
			case 2:
				sv.listView(students);
				break;
			case 3:
				Student s = ss.search(students);
				if(s != null) {
				sv.view(s);
				}
				break;
			default:
				check = !check;
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}

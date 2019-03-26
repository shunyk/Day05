package com.shunyk.seoul;

import java.util.Scanner;

public class StudentSearch {

	Scanner sc = new Scanner(System.in);
	SeoulMenu sm = new SeoulMenu();
	public Student search(Student [] students) {
		System.out.println("학생 번호 입력");
		int find = sc.nextInt();
		Student student = null;
		for(int i=0; i<students.length; i++) {
				
				if(find == students[i].num) {
					student = students[i];
					break;
				}
			}
		return student;
	}
}

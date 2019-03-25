package com.shunyk.school;

import java.util.Scanner;

public class StudentView {
	Teacher tc = new Teacher();
	SchoolMain5 sm5 = new SchoolMain5();
	Scanner sc = new Scanner(System.in);

	//public void listView(Student[] students){
	public void listView(Student[] students) {
		for(int i=0; i<students.length; i++) {
			System.out.println("이름 : " + students[i].name);
			System.out.println("번호 : " + students[i].num);
			System.out.println("국어 : " + students[i].kor);
			System.out.println("수학 : " + students[i].math);
			System.out.println("영어 : " + students[i].eng);
			System.out.println("총점 : " + students[i].total);
			System.out.println("평균 : " + students[i].avg);
			System.out.println("=============================");
		}

	}

	public void view(Student student) {
		System.out.println("이름 : " + student.name);
		System.out.println("번호 : " + student.num);
		System.out.println("국어 : " + student.kor);
		System.out.println("수학 : " + student.math);
		System.out.println("영어 : " + student.eng);
		System.out.println("총점 : " + student.total);
		System.out.println("평균 : " + student.avg);
	}
}

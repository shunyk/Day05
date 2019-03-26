package com.shunyk.seoul;

import java.util.Scanner;

public class StudentInput {
	public Student[] makeStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 입력");
		int count = sc.nextInt();
		Student[] students = new Student[count];

		for(int i=0; i<count; i++) {
			Student student = new Student();
			System.out.println("이름 입력");
			student.name = sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("kor 입력");
			student.kor = sc.nextInt();
			System.out.println("math 입력");
			student.math = sc.nextInt();
			System.out.println("eng 입력");
			student.eng = sc.nextInt();
			student.total = student.kor+student.math+student.eng;
			student.avg = student.total/3.0;
			students[i] = student;
		}
		return students;
	}
}

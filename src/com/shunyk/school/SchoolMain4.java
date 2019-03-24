package com.shunyk.school;

import java.util.Scanner;

public class SchoolMain4 {

	public static void main(String[] args) {
		//1. 받은 수 만큼 학생 객체 생성
		//2. 각 학생의 정보를 입력
		//3. 각 학생의 정보가 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수 입력");
		int count = sc.nextInt();
		Student st[] = new Student[count];
		
		
		for(int i=0; i<count; i++) {
			st[i] = new Student();
			System.out.println("이름 입력");
			
			st[i].name = sc.next();
			System.out.println("번호 입력");
			st[i].num = sc.nextInt();
			System.out.println("국어점수 입력");
			st[i].kor = sc.nextInt();
			System.out.println("수학점수 입력");
			st[i].math = sc.nextInt();
			System.out.println("영어점수 입력");
			st[i].eng = sc.nextInt();
			st[i].total=st[i].kor+st[i].math+st[i].eng;
			st[i].avg=st[i].total/3.0;
		}
		
		
		System.out.println("번호\t이름\t국어점수\t수학점수\t영어점수\t총 점수\t평균");

		for(int i=0; i<count; i++) {
			System.out.println(st[i].name + "\t" + st[i].num + "\t" + st[i].kor + "\t" + st[i].math + "\t" + st[i].eng + "\t" + st[i].total + "\t" + st[i].avg );
		}


	}

}

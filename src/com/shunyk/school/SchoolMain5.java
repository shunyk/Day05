package com.shunyk.school;

import java.util.Scanner;

public class SchoolMain5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select=0;
		boolean st = true;
		int count;
		int find;
		StudentView stv = new StudentView();
		
		Teacher tc = new Teacher();
		System.out.println("선생님의 이름을 입력하세요");
		tc.name = sc.next();
		System.out.println("선생님의 과목명을 입력하세요");
		tc.subject = sc.next();
		
		do {
			System.out.println("1.학생정보입력\t2.전체정보출력\t3.학생정보검색\t4.프로그램종료");
			select = sc.nextInt();
			if(select==1) {
				
				System.out.println("선생님이 담당하는 학생 수 입력");
				count = sc.nextInt();
				tc.students = new Student[count];
				for(int i=0; i<tc.students.length; i++) {
					Student student = new Student();
					System.out.println("학생의 이름을 입력");
					student.name = sc.next();
					System.out.println("학생의 번호를 입력");
					student.num = sc.nextInt();
					System.out.println("학생의 국어성적을 입력");
					student.kor = sc.nextInt();
					System.out.println("학생의 수학성적을 입력");
					student.math = sc.nextInt();
					System.out.println("학생의 영어성적을 입력");
					student.eng = sc.nextInt();
					student.total = student.kor+student.eng+student.math;
					student.avg = student.total/3.0;
					tc.students[i]=student;
					
					/*Engine e = new Engine();
					e.hp=1000;
					e.fuel="항공유";
					e.cc=30000;
					airplane2.engine[i]=e;*/
				}
			}else if(select==2){
					stv.listView(tc.students);
			}else if(select==3){
				System.out.println("학생 번호 입력");
				find = sc.nextInt();
				if(tc.students != null) {
					for(int i=0; i<tc.students.length; i++) {
						if(find == tc.students[i].num) {
							stv.view(tc.students[i]);
							break;
						}else {
							System.out.println("없는 번호입니다.");
						}
					}
				}else {
					System.out.println("학생정보가 없습니다.");
				}
			}else{
				st = false;
				System.out.println("프로그램 종료");
			}
		}while(st == true);

	}

}

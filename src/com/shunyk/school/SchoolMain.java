package com.shunyk.school;

public class SchoolMain {

	public static void main(String[] args) {
		//Student 클래스를 참조해서 student 객체를 생성
		//클래스명 변수명 = new 클래스명();
		Student st = new Student();
		
		System.out.println(st);
		System.out.println(st.name);
		System.out.println(st.num);
		
		st.name = "sk";
		st.num = 1;
		
		st.kor=40;
		st.math=40;
		st.eng=40;
		
		st.total=st.kor+st.eng+st.math;
		st.avg=st.total/3.0;
		
		System.out.println(st.name);
		System.out.println(st.num);
		
		Student st2 = new Student();
		System.out.println(st2);
		System.out.println(st2.name);
		System.out.println(st2.num);
		
		System.out.println(st==st2);
		
	}

}

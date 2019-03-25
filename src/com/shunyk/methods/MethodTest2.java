package com.shunyk.methods;

public class MethodTest2 {
	public void m1(int salary) {
		//고용보험 0.2%
		double p1 = salary * 0.002;
		System.out.println("고용보험 : " + p1);
	}
	public void m2(int salary) {
		//의료보험 1.3%
		double p2 = salary * 0.013;
		System.out.println("의료보험 : " + p2);
	}
	public void m3(int salary) {
		//국민연금 1.0%
		double p3 = salary * 0.01;
		System.out.println("국민연금 : " + p3);
	}
	public void m4(int salary) {
		//산재보험0.4%
		double p4 = salary * 0.004;
		System.out.println("산재보험: " + p4);
	}
}

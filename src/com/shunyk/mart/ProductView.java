package com.shunyk.mart;

public class ProductView {
	//제품의 정보를 출력하는 메소드
	public void View(Product product) {
		System.out.println("상품 이름 : " + product.brand);
		System.out.println("상품 가격 : " + product.price);
		System.out.println("상품 재고 : " + product.amount);
		System.out.println("할인 : " + product.sale);
		
		System.out.println("=======================");
	}
	
	public void info(int price, int amount, String brand, double sale) {
		System.out.println("상품 이름 : " + brand);
		System.out.println("상품 가격 : " + price);
		System.out.println("상품 재고 : " + amount);
		System.out.println("할인 : " + sale);
		System.out.println("=======================");
	}
}

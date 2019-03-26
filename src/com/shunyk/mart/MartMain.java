package com.shunyk.mart;

public class MartMain {

	public static void main(String[] args) {
		ProductView pv = new ProductView();
		
		Product product = new Product();
		product.price = 10000;
		product.amount = 100;
		product.brand = "nike";
		pv.View(product);
		
		
		Product product2 = new Product();
		product2.price = 20000;
		product2.amount = 20;
		product2.brand = "adidas";
		pv.View(product2);

	}

}

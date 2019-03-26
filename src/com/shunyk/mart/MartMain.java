package com.shunyk.mart;

public class MartMain {

	public static void main(String[] args) {
		ProductView pv = new ProductView();
		
		Product product = new Product();
		product.price = 10000;
		product.amount = 100;
		product.brand = "nike";
		product.sale = 3.2;
		pv.View(product);
		//pv.info(product.price, product.amount, product.brand, product.sale);
		
		
		Product product2 = new Product();
		product2.price = 20000;
		product2.amount = 20;
		product2.brand = "adidas";
		product.sale = 3.2;
		pv.View(product2);
		//pv.info(product2.price, product2.amount, product2.brand, product2.sale);

	}

}

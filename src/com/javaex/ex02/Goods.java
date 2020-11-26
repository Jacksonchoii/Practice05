package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;

	//기본 연산자 추가 for camera
	public Goods() {}
	
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	//private을 public으로 바꿔주어 접근 가능하게 해야함
	public void setName(String name) {  
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
}









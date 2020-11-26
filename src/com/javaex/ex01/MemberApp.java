package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		
		Member jung = new Member();
		
		jung.setId("jws");
		jung.setName("정우성");
		jung.setPoint(50000);
		
		Member yu = new Member();
		
		yu.setId("yjs");
		yu.setName("유재석");
		yu.setPoint(30000);
		
		Member lee = new Member();
		
		lee.setId("ihr");
		lee.setName("이효리");
		lee.setPoint(40000);
		
		jung.showInfo();
		yu.showInfo();
		lee.showInfo();
	}

}

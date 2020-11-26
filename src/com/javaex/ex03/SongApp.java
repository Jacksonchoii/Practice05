package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		
		//출력결과를 예상해서 주석으로 작성해 보세요
		
		//파라미터0개 , 파라미터5개, 파라미터6개
		
		Song ex01 = new Song();
		System.out.println(ex01);
		
		Song ex02 = new Song("좋은날","아이유","Real","이민수 작곡","2010");
		System.out.println(ex02);
		
		Song ex03 = new Song("좋은날","아이유","Real","이민수작곡","2010",3);
		System.out.println(ex03);
		
		
		//기본 생성자와 생성자 오버로딩간에 차이는 숙지하였으나,
		
		//com.javaex.ex03.Song@6d06d69c?
		//파라미터 6개 짜리를 입력하면 왜 5개,6개,위의 영어가 나오는지 잘 모르겠음
	}

}



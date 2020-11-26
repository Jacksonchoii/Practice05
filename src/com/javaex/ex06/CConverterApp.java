package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        //Scanner 로 값 받아서 계산기처럼 이용할 수 있게끔 만들 수 있도록 더 생각해보기
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        won = 1000000;
        System.out.println("백만원은 "+CConverter.toDoller(won)+" 달러 입니다");
        
        //100달려를 원으로 출력하기
        dollar = 100;
        System.out.println("백달러는 "+CConverter.toKWR(dollar)+" 원 입니다.");
        
    }

}

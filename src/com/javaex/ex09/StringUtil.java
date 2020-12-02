package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] Arr){
       
        //메소드 내용작성
    
    	String result = "";
    	
    	for(int i=0; i<Arr.length; i++) {
    		
    		result = result + Arr[i];
    	}
    	
    	return result;
    }

}

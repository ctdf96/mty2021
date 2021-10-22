package jp.kenschool.chapter6;

import java.util.ArrayList;

public class GenericsSample1 {
	
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("KEN");
		array.add("IT");
		array.add("Engineer School");
		
		for(String strValue : array) {
		 System.out.println(strValue.length());
		}
	}
	}	
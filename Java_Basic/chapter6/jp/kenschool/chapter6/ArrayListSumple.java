package jp.kenschool.chapter6;

import java.util.ArrayList;

public class ArrayListSumple {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		String strValue1 ="Java";
		Integer iValue =100;
		Double dValue =10.5;

		array.add(strValue1);
		array.add(iValue);
		array.add(dValue);
		System.out.println(array);
		System.out.println(array.get(2));
		System.out.println(array.size());

		for(int i=0;i< array.size();i++) {
			System.out.println(array.get(i));

		}
		
		System.out.println(array);
		array.remove(1);
		
		System.out.println(array);
	
		array.add(1,iValue);
		System.out.println(array);
	}

}

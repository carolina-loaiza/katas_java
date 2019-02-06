package com.cenfotec.katas.numbRomanos;

import java.util.Arrays;

public class Convertidor {
	static String[] letras = {"I","V","X","L","C","D","M"};
	static Integer[] valores = {1,5,10,50,100,500,1000};
	
	public static String convertir (int number) {
		String result = "";
		
		if ( checkNumber(number) != "" ) {
			return checkNumber(number);
		}
		
		for (int num : valores) {
			if ((number-num) < 0) {
				int indexVal = Arrays.asList(valores).indexOf(num);
				result = result + letras[indexVal-1];
				System.out.println(result);
				System.out.println(valores[indexVal-1]);
				System.out.println((number-valores[indexVal-1]));
				if ( checkNumber((number-valores[indexVal-1])) != "" ) {
					result = result + checkNumber((number-valores[indexVal-1]));
				}
				break;
			}
		}
		
		return result;
	}
	
	public static String checkNumber(int number) {
		String result = "";
		if ( Arrays.asList(valores).contains(number) ) {
			int index = Arrays.asList(valores).indexOf(number);
			result = letras[index];
		}
		
		return result;
	}
}

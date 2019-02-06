package com.cenfotec.katas.calculadora;

public class CalculadoraHileras {
	
	public static int Add (String numbers) throws Exception {
		if (numbers == "")
			return 0;

		try {
			String[] listNumbers = numbers.split(",");
			int result = 0;
			
			for (String numbString : listNumbers) {
				int number = Integer.parseInt(numbString);
				result = result + number;
			}
			
			return result;
		} catch (Exception e) {
			throw new Exception("Error" + e);
		}
	}
}

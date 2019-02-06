package com.cenfotec.katas.calculadora;

public class CalculadoraHileras {
	
	public static int Add (String numbers) throws Exception {
		if (numbers == "")
			return 0;

		try {
			String[] listNumbers = numbers.split(",");
			
			if (listNumbers.length > 2)
				throw new Exception("Error > 3");
			
			int number1 = Integer.parseInt(listNumbers[0]);
			int number2 = 0;
			if (listNumbers.length == 2)
				number2 = Integer.parseInt(listNumbers[1]);
			
			return number1 + number2;
		} catch (Exception e) {
			throw new Exception("Error" + e);
		}
	}
}

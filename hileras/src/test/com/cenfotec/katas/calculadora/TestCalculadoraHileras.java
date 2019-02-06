package test.com.cenfotec.katas.calculadora;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import com.cenfotec.katas.calculadora.CalculadoraHileras;

class TestCalculadoraHileras {

	@Test
	public void testReturnNumber() throws Exception {
		String numbers = "13";
		int result = CalculadoraHileras.Add(numbers);
		
		assertEquals(13, result, "Should return 13 as number");
	}
	
	@Test
	public void testReturnSuma() throws Exception {
		String numbers = "1,3";
		int result = CalculadoraHileras.Add(numbers);
		
		assertEquals(4, result, "Should return 4 as number");
	}
	
	@Test
	public void testReturnSumaMasDos() throws Exception {
		String numbers = "1,3,1,2";
		int result = CalculadoraHileras.Add(numbers);
		
		assertEquals(7, result, "Should return 7 as number");
	}
	
	@Test
	public void testReturnCero() throws Exception {
		String numbers = "";
		int result = CalculadoraHileras.Add(numbers);
		
		assertEquals(0, result, "Should return 0 as number");
	}
	
	/*@Test
	public void testReturnErrorMasTres() {
		String numbers = "1,3,1";
		
		try{
			CalculadoraHileras.Add(numbers);
	        fail("Exception Expected!");
	   }
	   catch(Exception e) {
		   assertTrue(true);
	   }
	}*/
	
	@Test
	public void testReturnErrorSinComas() {
		String numbers = "1/2";
		
		try{
			CalculadoraHileras.Add(numbers);
	        fail("Exception Expected!");
	   }
	   catch(Exception e) {
		   assertTrue(true);
	   }
	}

}

package test.com.cenfotec.katas.numbRomanos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.cenfotec.katas.numbRomanos.Convertidor;

class TestConvertidor {

	@Test
	public void testReturnNumber() {
		int number = 5;
		String result = Convertidor.convertir(number);

		assertEquals("V", result, "Should return V");
	}
	
	@Test
	public void testReturnNumberY() {
		int number = 31;
		String result = Convertidor.convertir(number);

		assertEquals("V", result, "Should return V");
	}

}

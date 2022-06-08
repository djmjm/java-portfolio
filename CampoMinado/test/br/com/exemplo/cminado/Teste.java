package br.com.exemplo.cminado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		assertEquals(1, 1);
		
		var obj = new String("DOUGLAS");
		assertEquals(obj, "DOUGLAS");
	}
	
	@Test
	void operadorIncremento() {
		int x = 1;
		
		assertEquals(++x, 2);
		x++;
		assertEquals(--x, 2);
	}

}

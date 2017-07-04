package es.cic.taller.ejercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

public class App2Test {

	@Test
	public void testOperar2() {
		App2 sut =new App2();
		assertEquals(12,sut.operar2());
	}

}

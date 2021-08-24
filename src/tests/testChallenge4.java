package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import quests.Challenge4;

public class testChallenge4 {

	@Test
	public void deveCalcularComDistânciaDeOitoMetros() {
		boolean expected0 = false;
		boolean actual0 = Challenge4.retornaSeHaEcoNoEstudio(8);
		assertEquals(expected0, actual0);
	}

	@Test
	public void deveCalcularComDistânciaDeVinteMetros() {
		boolean expected0 = true;
		boolean actual0 = Challenge4.retornaSeHaEcoNoEstudio(20);
		assertEquals(expected0, actual0);
	}
}

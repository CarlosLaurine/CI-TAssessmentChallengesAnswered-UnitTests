package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import quests.Challenge7;

public class testChallenge7 {

	@Test
	public void deveCalcularComDistânciaDeQuatrocentosECinquentaMetros() {
		String expected0 = "315";
		String actual0 = Challenge7.tamanhoSetorBusca(2834, 314);
		assertEquals(expected0, actual0);
	}
}

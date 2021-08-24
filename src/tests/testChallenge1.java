package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import quests.Challenge1;

public class testChallenge1 {

	@Test
	public void deveCalcularComDistânciaDeQuatrocentosECinquentaMetros() {
		Integer expected0 = 1324;
		Integer actual0 = Challenge1.retornaTempoArenaEmMilisegundos("0.45", 340);
		assertEquals(expected0, actual0);
	}
}

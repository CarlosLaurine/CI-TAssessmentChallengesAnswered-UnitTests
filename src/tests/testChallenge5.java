package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import quests.Challenge5;

public class testChallenge5 {

	@Test
	public void comUmaRodadaDeEnsaiosEUmShow() {
		Integer expected0 = 45500;
		Integer actual0 = Challenge5.calculaDistanciaBandaPercorre(1, 1);
		assertEquals(expected0, actual0);
	}
}

package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import quests.Challenge8;

public class testChallenge8 {

	@Test
	public void ingressoNumeroVinteESeis() {
		Integer expected0 = 6;
		Integer actual0 = Challenge8.retornaGuicheIngresso(26);
		assertEquals(expected0, actual0);
	}
}

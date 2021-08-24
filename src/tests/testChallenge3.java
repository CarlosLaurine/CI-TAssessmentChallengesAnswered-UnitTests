package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import quests.Challenge3;

public class testChallenge3 {

	@Test
	public void calculoComDezMilPessoas() {
		Integer expected0 = 2500;
		Integer actual0 = Challenge3.retornaPessoasPreferemUmUnicoPalco(10000);
		assertEquals(expected0, actual0);
	}
}

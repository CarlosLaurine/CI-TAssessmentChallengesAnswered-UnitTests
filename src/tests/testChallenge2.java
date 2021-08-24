package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import quests.Challenge2;

public class testChallenge2 {

	@Test
	public void deveCalcularComDuasMilSetecentosEQuarentaENovePessoasEOitoPortoesACinquentaSegundosPorPessoa() {
		Integer expected0 = 287;
		Integer actual0 = Challenge2.retornaTempoMinimoEmMinutos(2749, 50, 8);
		assertEquals(expected0, actual0);
	}
}

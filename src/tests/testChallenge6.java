package tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import quests.Challenge6;

public class testChallenge6 {

	@Test
	public void deveCalcularComFrequenciaParaUmSemitonAcimaDeA() {
		List<String> expected0 = Arrays.asList("466.1638", "A#");
		List<String> actual0 = Challenge6.geraFrequenciaNota(1);
		assertEquals(expected0, actual0);
	}

	@Test
	public void deveCalcularComFrequenciaPara2SemitonsAcimaDeA() {
		List<String> expected0 = Arrays.asList("493.8833", "B");
		List<String> actual0 = Challenge6.geraFrequenciaNota(2);
		assertEquals(expected0, actual0);
	}

	@Test
	public void deveCalcularComFrequenciaParaDoisSemitonsAbaixoDeA() {
		List<String> expected0 = Arrays.asList("391.9954", "G");
		List<String> actual0 = Challenge6.geraFrequenciaNota(-2);
		assertEquals(expected0, actual0);
	}
}

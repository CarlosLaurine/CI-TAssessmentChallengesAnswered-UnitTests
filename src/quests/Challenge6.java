package quests;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Challenge6 {
	public static List<String> geraFrequenciaNota(Integer semitons) {

		Locale.setDefault(Locale.US);

		Double semitonsDouble = semitons.doubleValue();
		Integer frequencia = 440;
		Boolean isFloat = false;
		Boolean isCrescente = false;

		String[] crescentes = { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };
		String[] decrescentes = { "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B" };

		String[] progressão = new String[12];

		String[] arrayResultado = new String[2];

		Double frequenciaDouble = frequencia * (Math.pow(2, semitonsDouble / 12));

		System.out.println(frequenciaDouble);

		Double decimalDiff = frequenciaDouble - frequenciaDouble.intValue();

		if (decimalDiff != 0) {
			isFloat = true;
		}

		if (semitons >= 0) {
			isCrescente = true;
		}

		if (isCrescente) {
			progressão = crescentes;
		}

		else {
			progressão = decrescentes;
		}

		if (isCrescente) {

			if (isFloat) {
				arrayResultado[0] = String.format("%.4f", frequenciaDouble);
				arrayResultado[1] = progressão[(9 + (semitons % 12)) % 12];
				return Arrays.asList(arrayResultado);
			}

			else if (!isFloat) {

				arrayResultado[0] = String.valueOf(frequenciaDouble.intValue());
				arrayResultado[1] = progressão[(9 + (semitons % 12)) % 12];
				return Arrays.asList(arrayResultado);
			}
		}

		else if (!isCrescente) {

			if (isFloat) {

				arrayResultado[0] = String.format("%.4f", frequenciaDouble);
				arrayResultado[1] = progressão[(9 + (semitons % 12)) % 12];
				return Arrays.asList(arrayResultado);
			}

			else if (!isFloat) {

				arrayResultado[0] = String.valueOf(frequenciaDouble.intValue());
				arrayResultado[1] = progressão[(9 + (semitons % 12)) % 12];
				return Arrays.asList(arrayResultado);
			}

		}
		;
		return null;
	}
}

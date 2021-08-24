package quests;

import java.util.Locale;

public class Challenge2 {
	public static Integer retornaTempoMinimoEmMinutos(Integer p, Integer s, Integer n) {

		Locale.setDefault(Locale.US);

		boolean isFloat = false;

		Double minuto = 60.00;

		Double tempoMinimoDoubleEmMinutos = (((p.doubleValue() * s.doubleValue()) / (n.doubleValue())) / minuto);

		if (tempoMinimoDoubleEmMinutos.compareTo((double) tempoMinimoDoubleEmMinutos.intValue()) != 0) {
			isFloat = true;
		}

		Integer tempoMinimoIntegerEmMinutos = tempoMinimoDoubleEmMinutos.intValue();

		if (isFloat) {
			return tempoMinimoIntegerEmMinutos + 1;
		} else {
			return tempoMinimoIntegerEmMinutos;
		}

	}
}

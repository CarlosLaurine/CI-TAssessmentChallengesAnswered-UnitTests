package quests;

public class Challenge1 {

	public static Integer retornaTempoArenaEmMilisegundos(String distancia, Integer velocidade) {

		boolean isFloatCeil = false;

		Double tempoDoubleEmSegundos = (Double.parseDouble(distancia) * 1000) / (velocidade);

		System.out.println(tempoDoubleEmSegundos);

		Double tempoDoubleMilisegundos = (tempoDoubleEmSegundos * 1000);

		double decimalDiff = tempoDoubleMilisegundos - tempoDoubleMilisegundos.intValue();

		if (decimalDiff != 0) {

			if (decimalDiff >= 0.5) {

				isFloatCeil = true;

			}
		}
		Integer tempoIntegerEmMilisegundos = tempoDoubleMilisegundos.intValue();

		if (isFloatCeil) {

			return tempoIntegerEmMilisegundos + 1;

		} else {

			return tempoIntegerEmMilisegundos;

		}

	}
}
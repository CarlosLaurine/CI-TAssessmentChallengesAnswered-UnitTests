package quests;

public class Challenge7 {
	public static String tamanhoSetorBusca(Integer areaMaior, Integer areaMenor) {

		Double areaMaiorDouble = Double.valueOf(areaMaior);

		Double areaMenorDouble = Double.valueOf(areaMenor);

		Double areaPopularSetor3 = (areaMaiorDouble - areaMenorDouble) / 8;

		if ((Math.ceil(areaPopularSetor3) - areaPopularSetor3) != 0) {

			return String.valueOf(areaPopularSetor3);

		} else {
			return String.valueOf(areaPopularSetor3.intValue());
		}

	}
}
package quests;

public class Challenge3 {
	public static Integer retornaPessoasPreferemUmUnicoPalco(Integer quantidadePessoasEvento) {

		Double pessoasPreferemUmUnicoPalcoDouble = quantidadePessoasEvento * 0.25;

		Integer pessoasPreferemUmUnicoPalco = pessoasPreferemUmUnicoPalcoDouble.intValue();

		return pessoasPreferemUmUnicoPalco;

	}
}

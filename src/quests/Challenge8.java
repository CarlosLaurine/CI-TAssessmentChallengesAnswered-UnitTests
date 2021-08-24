package quests;

public class Challenge8 {

	public static Integer retornaGuicheIngresso(Integer ingressoNumero) {

		Double guicheQueContemOIngressoDouble = Math.ceil(Math.pow(ingressoNumero.doubleValue(), 0.5));

		Integer guicheQueContemOIngressoInteger = guicheQueContemOIngressoDouble.intValue();

		return guicheQueContemOIngressoInteger;

	}
}

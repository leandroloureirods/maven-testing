package br.com.alura.maven.testing;

import br.com.caelum.stella.validation.CPFValidator;

public class App {
	public static void main(String[] args) {
		String cpf = "";
		boolean cpfValido = false;

		cpf = "07800812774";
		cpfValido = valida(cpf);
		System.out.printf("O CPF informado %s é %s.\n", cpf, cpfValido ? "válido" : "inváldo");

		cpf = "11111111111";
		cpfValido = valida(cpf);
		System.out.printf("O CPF informado %s é %s.\n", cpf, cpfValido ? "válido" : "inválido");

	}

	public static boolean valida(String cpf) {
		CPFValidator cpfValidator = new CPFValidator();
		try {
			cpfValidator.assertValid(cpf);
			return true;
		} catch (Exception e) {
			// e.printStackTrace();
			return false;
		}
	}

}
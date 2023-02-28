package view;

import controller.InteiroController;

public class Principal {

	public static void main(String[] args) {
		
		InteiroController ic = new InteiroController();
		int valor = 3982749;

		int inteiro = ic.inteiro(valor);
		System.out.println("Quantidade de dígitos = " + inteiro);

	}

}
package controller;

public class InteiroController {
	
	public InteiroController() {
		
		super();
		
	}
	
	public int inteiro(int valor) {
		
		//Condição de parada
		if (valor < 1 ) {
			
			return 0; 
			
			//Quando o valor for divido o suficiente para descobrir quantos digítos
			//tem o número, será menor que 1, então retornará 0
			
		} else {
			
			valor = valor / 10;
			return 1 + inteiro(valor);
			//Retorno é feito somando 1 a chamada da função com o valor dividido
			//por 10
			
		}
		
	}
	
}
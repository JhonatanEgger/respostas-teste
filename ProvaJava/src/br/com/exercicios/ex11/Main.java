package br.com.exercicios.ex11;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		double num = 1.999;
		BigDecimal x = BigDecimal.valueOf(num);

		// Novo Codigo
		x = x.setScale(2, 1);
		
		System.out.print(x);

	}

}

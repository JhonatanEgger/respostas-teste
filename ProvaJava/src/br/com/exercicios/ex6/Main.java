package br.com.exercicios.ex6;

public class Main {
	
	public static void main(String[] args) {
		Father father = new Father();
		
		String father1 = father.validateAge("55");
		String father2 = father.validateAge("77");
		
		System.out.println("Testando um jovem: " + father1);
		System.out.println("Testando um idoso: " + father2);
	}

}

package br.com.exercicios.ex6;

public class Father extends Man {
	
	public String validateAge(String age) {
		
		String returnAge = null;
		
		try {
			returnAge = isOld(Integer.parseInt(age))? "idoso": "jovem";
			System.out.println("validateAge(), validou um "+ returnAge);
		} catch (NumberFormatException e) {
			throw new NumberFormatException("O valor informado não é um valor numérico valido");
		}
		
		return  returnAge;
	}


}

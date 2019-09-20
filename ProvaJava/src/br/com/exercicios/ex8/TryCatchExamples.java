package br.com.exercicios.ex8;

public class TryCatchExamples {
	
	public static void main(String[] args) throws Exception {
		try {

			String nullPointer = null;
			
			nullPointer.toUpperCase();
			
		} catch (NullPointerException e1) {
			System.out.print("deu nullPointer ");
			fazAlgumaCoisa();
		} finally {
			System.out.println("Finally ");
		}
	}

	private static void fazAlgumaCoisa() throws Exception {
		throw new Exception("Faz alguma exception");
	}
	
}
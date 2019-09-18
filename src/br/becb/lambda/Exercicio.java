package br.becb.lambda;

public class Exercicio {

	
	public static void main(String[] b) {
		
		System.out.println("início de churumbeladas");
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("rodando o runable");
			}
		}).start();
		
		
		new Thread( () ->System.out.println("Runnable em lambda")).start();
				
	}
}

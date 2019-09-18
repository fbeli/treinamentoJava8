package br.becb.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;



public class UsandoLambda_PrimeiroComString {

	public static void main(String[] args) {
		
		List<String> palavras = pegaString();
		
		//Classe AN�NIMA, j� da new e escreve o m�todo
		Consumer consumidor = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		palavras.forEach(consumidor);
		
		
		//ou passar direto pelo par�metro.
		//passa direto como argumento e evita criar uma nova vari�vel  
		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		//�bvio que vou implementar o m�todo accept do consumer. Ainda pode reduzir com o lambda
		palavras.forEach((String t) -> {
				System.out.println(t);
			
		});
	
		//se o lambda so recebe 1 arqumento n�o � obrigado a usar os parenteses e inferir o tipo;
		//se so tem 1 comando pode tb tirar as chaves e o ;
		palavras.forEach( t-> 
			System.out.println(t)
		);
		
		
		
	}

	private static List<String> pegaString(){
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("uma grande frase, bem grande");
		palavras.add("fred");
		palavras.add("essa frase � m�dia");
		
		return palavras;
	}
}

package br.becb.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class UsandoLambda_doisComComparator {

	public static void main(String[] args) {

		List<String> palavras = pegaString();
		
		// chamada por new
		palavras.sort(new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length())
					return -1;
				if(o1.length() > o2.length())
					return 1;
				return 0;
			}
			
		});				
		palavras.forEach(s-> System.out.println(s));
		
		palavras = pegaString();
		
		// chamada por lambda 1
		System.out.println("\nPor lambda 1, invertido");
		palavras.sort((String o1, String o2) -> {
				if(o1.length() < o2.length())
					return 1;
				if(o1.length() > o2.length())
					return -1;
				return 0;			
			
		});				
		palavras.forEach(s-> System.out.println(s));
		
		
		// chamada por lambda 2.
		//não precisa mandar o tipo de dado
			System.out.println("\nPor lambda 2");
			palavras = pegaString();			
			palavras.sort( ( o1,  o2) -> Integer.compare(o1.length(), o2.length()));
			
			
			
			
			palavras.forEach(s-> System.out.println(s));
		
			//Abaixo 2 linhas que seria somente 1
			//Consumer é uma interface funcional, o lambda precia ter a interface funcional compatível
			Consumer consumidor = s -> System.out.println(s);
			palavras.forEach(consumidor);
		
		

		
		
	}

	private static List<String> pegaString() {

		List<String> palavras = new ArrayList<String>();
		palavras.add("uma grande frase, bem grande");
		palavras.add("fred");
		palavras.add("essa frase é média");

		return palavras;
	}
}

package br.becb.methodReferences;

import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.function.Function;

public class MethodReferences {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<String> palavras = pegaString();
		
		
		//Comparator tem v�rios m�todos est�ticos
		//dado um objeto ele devolve outro
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.forEach(s -> System.out.println(s));
		
		//methodo reference - tb � lambda
		//forma de escrever mais enxuto
		palavras.sort(Comparator.comparing(String::length));
		//import star
		palavras.sort(comparing(String::length));
		palavras.forEach(System.out::println);
		
		
		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s-> s.length();
		
		
	}
	
	
	private static List<String> pegaString() {

		List<String> palavras = new ArrayList<String>();
		palavras.add("uma grande frase, bem grande");
		palavras.add("fred");
		palavras.add("essa frase � m�dia");

		return palavras;
	}
}

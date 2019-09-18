package br.becb.methodReferences;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReferences {

	public static void main(String[] args) {
		
		List<String> palavras = pegaString();
		
		
		//Comparator tem vários métodos estáticos
		//dado um objeto ele devolve outro
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.forEach(s -> System.out.println(s));
		
		
		
	}
	private static List<String> pegaString() {

		List<String> palavras = new ArrayList<String>();
		palavras.add("uma grande frase, bem grande");
		palavras.add("fred");
		palavras.add("essa frase é média");

		return palavras;
	}
}

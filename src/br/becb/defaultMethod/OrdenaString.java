package br.becb.defaultMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {
		
		List<String> palavras = pegaString();
				
		//Java Antigo
		System.out.println("JAVA < 8");
		System.out.println("sem ordenação: \n"+palavras);
		
		Collections.sort(palavras);
		System.out.println("Collections.sort sem comparador definido: \n"+palavras);
		
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println("Collections.sort e comparator: \n"+palavras);
		
		//Java 8
		System.out.println("\n\nJAVA 8");
		palavras = pegaString();		
		palavras.sort(comparador);		
		System.out.println("Collections.sort e comparator: \n"+palavras);
		
		
		System.out.println("\nforeach antigo");
		for (String string : palavras) {
			System.out.println(string);
		}
		
		System.out.println("\nforeach novo");
		Consumer consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
	}
	
	private static List<String> pegaString(){
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("uma grande frase, bem grande");
		palavras.add("fred");
		palavras.add("essa frase é média");
		
		return palavras;
	}
}


class ImprimeNaLinha implements Consumer<String>{
	@Override
	public void accept(String t) {
		System.out.println(t);
	}
 	
}



class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length())
			return -1;
		if(o1.length() > o2.length())
			return 1;
		return 0;
	}
	
	
	
	
}
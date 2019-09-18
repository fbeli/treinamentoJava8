package br.becb.defaultMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio {

	public static void main(String[] args) {
	
		List<String> palavras = new ArrayList<String>();
		palavras.add("uma grande frase, bem grande");
		palavras.add("fred");
		palavras.add("essa frase é média");
		
		Consumer imprimir  = new Imprimir();
		palavras.forEach(imprimir);
		System.out.println("\n");
		Comparator c = new comparadorImplements();
		palavras.sort(c);
		palavras.forEach(imprimir);
	}

}

class comparadorImplements implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length() < o2.length())
			return -1;
		if (o1.length()>o2.length())
			return 1;
		return 0;
	}

	
	
}
class Imprimir implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
	
}

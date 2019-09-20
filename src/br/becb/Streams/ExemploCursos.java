package br.becb.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ExemploCursos {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Python",45));
		cursos.add(new Curso("javaScript",150));
		cursos.add(new Curso("Java 8",113));
		cursos.add(new Curso("C",55));
		
		
		//cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		//cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//ComparingInt já trabalha com int diretamente, mais rápido
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			//.map(c -> c.getAlunos())
			.map(Curso::getAlunos)
			//.forEach(total -> System.out.println(total));
			.forEach(System.out::println);
		
		IntStream istream = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.mapToInt(c -> c.getAlunos());
		
		//pode trabalhar direto, sem a var IntStream
		int sum = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.mapToInt(c -> c.getAlunos())
		.sum();
		
		System.out.println(sum);
		
		
		
		
		
	}

}

package br.becb.Streams;

import java.util.Comparator;
import java.util.List;

public class Exercicio {
	static List<Curso> cursos;
	
	
	
	public static void main(String[] args) {

		cursos = Curso.getCursos();

			
			one();
			System.out.println("    ");
			two();
	
	}

	/**
	 * Listar cursos pelo número de alunos
	 */
	private static void one() {
		/*
		 * cursos.stream() .sorted(Comparator.comparingInt( c-> getAlunos()));
		 */			 
		
		cursos.sort((c2, c1) -> Integer.compare(c1.getAlunos(), c2.getAlunos()));
		
		cursos.sort(Comparator.comparingInt(c->c.getAlunos()));
	
		cursos.forEach(c -> System.out.println(c.getNome()));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void two() {
		
		cursos.stream().filter( c->c.getAlunos()>100 )
			.forEach(c-> System.out.println(c.getNome()));
		
		
		System.out.println("    ");
		
		//FIXME
		//cursos.sort(Comparator.comparingInt());forEach(c-> System.out.println(c.getNome()));
	}
	
}

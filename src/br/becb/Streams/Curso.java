package br.becb.Streams;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	private int alunos;
	
	
	public Curso(String nome, int alunos) {
		super();
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAlunos() {
		return alunos;
	}
	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}
	
	public static List<Curso> getCursos(){
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python",45));
		cursos.add(new Curso("javaScript",150));
		cursos.add(new Curso("Java 8",113));
		cursos.add(new Curso("Moda",500));
		cursos.add(new Curso("C",55));
		
		return cursos;
	}
}

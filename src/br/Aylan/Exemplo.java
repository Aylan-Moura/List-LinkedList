package br.Aylan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exemplo extends Linkedlist {

	public static void main(String[] args) {
	
	Exemplo1();
	Exemplo2();
	Exemplo3();
	exp();

}
public static void exp() {
	List<String> lista = new LinkedList<>();
	lista.add("Aylan");
	lista.add("Moura");
	lista.add("Sousa");
	lista.remove(0); /*remove o intem na posição 1*/
	boolean contem = lista.contains("moura");
	System.out.println(contem);
	System.out.println(lista);
		
	}
private static void Exemplo1() {
	List <String> lista = new ArrayList<String>();
	lista.add("João");
	lista.add("Maria");
	lista.add("Pedro");
	lista.add("Dark");
	System.out.println(lista);
}
private static void Exemplo2() {
	List <String> lista = new ArrayList<String>();
	lista.add("João grilo");
	lista.add("Aylan Moura");
	lista.add("Maria antonieta");
	lista.add("Pedro c");
	lista.add("Dark side");
	Collections.sort(lista); 
	System.out.println(lista);
}

private static void Exemplo3  () {
	

	 List<Aluno> lista = new ArrayList<>();
     
     Aluno a = new Aluno("Aylan", 7812.0, 5465465L, 70.5);
     Aluno b = new Aluno("Joao", 7894.0, 7465465L, 7.2);
     Aluno c = new Aluno("Pedro", 7612.0, 6546574L, 18.7);
	
	lista.add(a);
	lista.add(b);
	lista.add(c);
	
	ComparaNotaAluno comparanotaaluno = new ComparaNotaAluno();
	Collections.sort(lista, comparanotaaluno);
	
	System.out.println("lista com ordenação por nota:" + lista);
}
}

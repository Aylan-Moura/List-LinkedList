package br.Aylan;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
	
public static void exp()  {
	List<String> lista = new LinkedList<>();
	lista.add("Aylan");
	lista.add("Moura");
	lista.add("Sousa");
	lista.remove(0); /*remove o intem na posição 1*/
	boolean contem = lista.contains("moura");
	System.out.println(contem);
	System.out.println(lista);
}
}

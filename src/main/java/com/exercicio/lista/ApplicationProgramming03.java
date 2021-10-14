package com.exercicio.lista;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ApplicationProgramming03 {
	/**
	 * Exemplos de ordenação de lista por String e Integer
	 * */
	public static void main(String[] args) {
		
		List<ToDo> todos = new ArrayList<>();
		todos.add(new ToDo(3, "Hugo"));
		todos.add(new ToDo(4, "Jefferson"));
		todos.add(new ToDo(1, "Luiz"));
		todos.add(new ToDo(2, "Cruz"));
		
		//01 - Ordenação pela descrição
		Comparator<ToDo> comparePelaDescricao = Comparator.comparing(n -> n.getDescricao());
		todos.sort(comparePelaDescricao);
		
		//02 -  Ordenação pela descrição
		//Function - Dado um ToDo extraia uma String do tipo getDescricao();
		Function<ToDo, String> extraiDescricao = n -> n.getDescricao();
		Comparator<ToDo> comparePelaDescricaoUsandoFaction = Comparator.comparing(extraiDescricao);
		todos.sort(comparePelaDescricaoUsandoFaction);
		
		//01 - Ordenação pela prioridade
		Function<ToDo, Integer> extraiPrioridade = n -> n.getPrioridade();
		Comparator<ToDo> comparePelaPrioridadeFaction = Comparator.comparing(extraiPrioridade);
		todos.sort(comparePelaPrioridadeFaction);
		
		//02 - Ordenação pela prioridade
		//ToIntFunction - É usando quando trabalha com valores inteiros primitivos
		ToIntFunction<ToDo> extraiPrioridadeIntPrimitivo = n -> n.getPrioridade();
		Comparator<ToDo> comparePelaPrioridadeFactionIntPrimitivo = Comparator.comparingInt(extraiPrioridadeIntPrimitivo);
		todos.sort(comparePelaPrioridadeFactionIntPrimitivo);
		
		System.out.println(todos);
	}

}

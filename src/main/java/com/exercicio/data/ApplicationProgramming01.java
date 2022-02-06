package com.exercicio.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationProgramming01 {
	public static void main(String[] args) {
		
		/**
		 * Apartir de quanto tempo falta para completar ano?
		 * */
		
		LocalDate completaAno = LocalDate.of(1991, Month.MARCH, 14);
		LocalDate hoje = LocalDate.now();
		
		// Exemplo 01
		int idadeAtual = completaAno.getYear() - hoje.getYear();
		System.out.println(idadeAtual);
		
		// Exemplo 02
		Period aniversario = Period.between(completaAno, hoje);
		System.out.println(aniversario.getDays());
		
		/**
		 * Formatar data e hora
		 * */
		DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorHoraEMinutos = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDate dataDeHoje = LocalDate.now();
		LocalDateTime dataHoraEminutos = LocalDateTime.now();
		
		System.out.println(dataDeHoje.format(formatadorData));
		System.out.println(dataHoraEminutos.format(formatadorHoraEMinutos));
	}

}

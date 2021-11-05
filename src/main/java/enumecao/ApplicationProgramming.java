package enumecao;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ApplicationProgramming {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana:");
		String dia = input.next();
		Optional<DiasDaSemana> dias = DiasDaSemana.get(dia);
		List<DiasDaSemana> resultadoDoDia = dias.stream().filter(d -> d != null).collect(Collectors.toList());
		
		resultadoDoDia.forEach(n -> System.out.println(n));
		System.out.println("--------------");
		for(DiasDaSemana semana : resultadoDoDia) {
			if(semana.equals(dias.get())) {
				System.out.println("Parabéns. O dia da Semana é " + dia);
			}else {
				System.out.println("Esse não é o dia da Semana para você");
			}
		}

	}

}

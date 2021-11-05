package enumecao;

import java.util.Optional;

public enum DiasDaSemana {
	
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valorDaSemana;
	
	public static Optional<DiasDaSemana> get(String diaDaSemana) {
		if(diaDaSemana.equals(SEGUNDA.toString())) {
			return Optional.of(SEGUNDA);
		}
		
		if(diaDaSemana.equals(TERCA.toString())) {
			return Optional.of(TERCA);
		}
		
		if(diaDaSemana.equals(QUARTA.toString())) {
			return Optional.of(QUARTA);
		}
		
		if(diaDaSemana.equals(QUINTA.toString())) {
			return Optional.of(QUINTA);
		}
		
		if(diaDaSemana.equals(SEXTA.toString())) {
			return Optional.of(SEXTA);
		}
		
		if(diaDaSemana.equals(SABADO.toString())) {
			return Optional.of(SABADO);
		}
		
		if(diaDaSemana.equals(DOMINGO.toString())) {
			return Optional.of(DOMINGO);
		}
		
		return Optional.empty();
	}
	
	private DiasDaSemana(int valorDaSemana) {
		this.valorDaSemana = valorDaSemana;
	}

	public int getValorDaSemana() {
		return valorDaSemana;
	}
}

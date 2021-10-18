package com.exercicio.csv;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TamplateService {

	public static Scanner input;
	private List<TamplateCSV> listCSV = new ArrayList<>();
	
	public List<TamplateCSV> listAll() {
		try {
			input = new Scanner(Paths.get("tamplate.csv"));
			input.nextLine();
		
			while(input.hasNext()) {
				String[] arrayString = input.nextLine().split(",");
				TamplateCSV t = new TamplateCSV();
				t.setCategoria(arrayString[0]);
				t.setProduto(arrayString[1]);
				t.setPreco(Double.valueOf(arrayString[2]));
				t.setCatelago(arrayString[3]);
				listCSV.add(t);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listCSV;
	}
}

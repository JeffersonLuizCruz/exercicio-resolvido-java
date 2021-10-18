package com.exercicio.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplicationProgramming03 {
	public static void main(String[] args) {
		
		 String path = "tamplate.csv";
		 List<TamplateCSV> listCSV = new ArrayList<TamplateCSV>();
		 
			try(BufferedReader br = new BufferedReader(new FileReader(path))){
				
				String line = br.readLine();
				line = br.readLine();
				while(line != null) {
					String[] vect = line.split(",");
					
					String categoria = vect[0];
					String produto = vect[1];
					Double preco = Double.valueOf(vect[2]);
					String catalogo = vect[3];
					
					TamplateCSV csv = new TamplateCSV(categoria, produto, preco, catalogo);
					listCSV.add(csv);
					
					line = br.readLine();
				}
				
				
				listCSV.stream().forEach(n -> System.out.println(n));
				
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
}

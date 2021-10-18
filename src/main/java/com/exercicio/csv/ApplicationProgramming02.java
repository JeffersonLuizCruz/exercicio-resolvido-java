package com.exercicio.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ApplicationProgramming02 {
	public static void main(String[] args) {	
		
		 String path = "tamplate.csv";
		 
			try(BufferedReader br = new BufferedReader(new FileReader(path))){
				
				String line = br.readLine();
				
				while(line != null) {
					System.out.println(line);
					line = br.readLine();
				}
				
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
}

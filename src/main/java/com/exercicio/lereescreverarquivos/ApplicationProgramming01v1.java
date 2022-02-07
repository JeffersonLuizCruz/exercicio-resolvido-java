package com.exercicio.lereescreverarquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Exemplo de uma segunda maneira de fazer a escrita de arquivos
 * */
public class ApplicationProgramming01v1 {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("write-v1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Exemplo de escrita de arquivo usando FileWrite");
		bw.newLine();
		bw.newLine();
		bw.write("Exemplo de quebra de linha usando o bw.newLine()");
		bw.newLine();
		bw.write("Exemplo de qubra de linha");
		bw.close();
		
		// Com esse exemplo usando o FileWriter eu perco alguns métodos de quebra de linha
		// e outros. Por isso o ideal é usar o combo com BufferWriter. Exemplo do código de cima.
		FileWriter fw2 = new FileWriter("write-v2.txt");
		fw2.write("Exemplo usando o FlieWrite");
		fw2.close();
		
	}

}

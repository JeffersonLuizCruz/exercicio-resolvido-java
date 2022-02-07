package com.exercicio.lereescreverarquivos;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Exemplo de escrita de arquivos
 * */
public class ApplicationProgramming02 {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("write.txt");
		Writer osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Rezendo teste de OutputStream e Write");
		bw.newLine();
		bw.close();
	}

}

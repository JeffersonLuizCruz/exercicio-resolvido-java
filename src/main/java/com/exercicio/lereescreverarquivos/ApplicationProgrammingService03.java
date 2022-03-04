package com.exercicio.lereescreverarquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApplicationProgrammingService03 {
	
	@Autowired private PropertiesLoadService propertiesLoad;
	
	
	public ApplicationProgrammingService03() throws IOException {
		this.createDirectories();
	}
	
	private void createDirectories() throws IOException {
		Path directoriesPath = Paths.get("target\\temp\\create-files", "create-files");
		Path rootPath = directoriesPath.resolve(directoriesPath);
		
		//Path directoryPath = Paths.get("target\\temp\\create-files");
		
		if(!verifyIfExistsFiles(rootPath)){
			System.out.println("Diretório Criado com sucesso!");
			Files.createDirectories(rootPath);
			createFile(rootPath);
		} 
	}
	
	private boolean verifyIfExistsFiles(Path path) {
		return Files.exists(path);
	}
	
	private File createFile(Path path) {
	
		File newFile;
		try {
		newFile = new File(path.toString(), "response-teste.txt");
		FileWriter fw = new FileWriter(newFile);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(String.format("%s", "Teste de escrita de arquivo .json"));
		bw.close();
		
		return newFile;
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}

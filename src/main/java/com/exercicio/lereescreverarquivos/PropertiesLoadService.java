package com.exercicio.lereescreverarquivos;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@ConfigurationProperties(prefix = "bean-list-property.propertiesLoadService")
@Service
public class PropertiesLoadService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String rootPath;
	private String directoriesPath;
	
	public PropertiesLoadService(String rootPath, String directoriesPath) {
		this.rootPath = rootPath;
		this.directoriesPath = directoriesPath;
	}
	public String getRootPath() {
		return rootPath;
	}
	public void setRootPath(String rootPath) {
		this.rootPath = rootPath;
	}
	public String getDirectoriesPath() {
		return directoriesPath;
	}
	public void setDirectoriesPath(String directoriesPath) {
		this.directoriesPath = directoriesPath;
	}
	@Override
	public String toString() {
		return "PropertiesLoadService [rootPath=" + rootPath + ", directoriesPath=" + directoriesPath + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(directoriesPath, rootPath);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PropertiesLoadService other = (PropertiesLoadService) obj;
		return Objects.equals(directoriesPath, other.directoriesPath) && Objects.equals(rootPath, other.rootPath);
	}
	
}

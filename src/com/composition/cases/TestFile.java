package com.composition.cases;

import java.io.File;

/**
 * A classe JavaFile é um padrão composto
 * 
 * @author Danilo
 *
 */
public class TestFile {
	
	private static String level = "";
	
	public static void main(String[] args) {
		showAllDirectory("C:/Users/Danilo/Desktop/Gi");
	}
	
	public static void showAllDirectory(String stringPath) {
		File dir = new File(stringPath);
		
		// lista todos os subdiretorios e arquivos do diretório
		File[] dirs = dir.listFiles();
		
		for(int i = 0; dirs != null && i < dirs.length; i++) {
			File f = dirs[i];
			if(f.isFile()) {
				System.out.println(level+f.getName());				
			}else if(f.isDirectory()) {
				System.out.println(level+f.getName());
				level += "------";
				showAllDirectory(f.getAbsolutePath());
				level = level.substring(0, level.lastIndexOf("------"));
			}
		}
	}
}

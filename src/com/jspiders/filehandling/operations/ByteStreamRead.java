package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("F:/File/Demo2.txt");
		
		if (file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			System.out.println(fileInputStream.read());
			System.out.println("Data is fetched from the file is : ");			
			fileInputStream.close();
		} else {
			
			System.out.println("File does not exist");
		}
	}
}

package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) {
		
		File file = new File("Demo1.txt");
		
		try {
			boolean status = file.createNewFile();
			if (status) {
				System.out.println("File is created");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

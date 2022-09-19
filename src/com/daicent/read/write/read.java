package com.daicent.read.write;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class read {
	public static void main(String[] args) {

		File f = new File("D:\\O's Documents\\Downloads/text.txt");
		try {
			BufferedReader bReader = Files.newBufferedReader(f.toPath(),StandardCharsets.UTF_8);
			String line = null;
			while(true) {
				line = bReader.readLine();
				if (line==null) {
					break;					
				}else {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		int numLines = 0;
		int numWord = 0;
		int numChars = 0;
		Scanner myFile = null;
		try {
			Scanner file =  new Scanner(new File("D:\\O's Documents\\Downloads/text.txt"));
			myFile = file;
		} catch (Exception e) {
			System.out.println("You file does not exist");
		}
		
		while (myFile.hasNextLine()) {
			String curLine = myFile.nextLine();
			int size = curLine.length();
			boolean foundDiv = true;//No word on this line
			boolean foundChar = false;//No characters yet
			//Check the current line for words
			for (int i = 0; i < size; i++) {
				if (curLine.charAt(i) == ' ') {
					foundDiv =  true;
					foundChar = false;
				}
				else {
					foundChar =  true;
					numChars++;
				}
				if (foundChar && foundDiv) {
					numWord++;
					foundDiv = false;
				}
			}
			numLines++;
		}
		myFile.close();
		System.out.println("Number of Words: " + numWord);
		System.out.println("Number of Lines: " + numLines);
		System.out.println("Number of Characters: " + numChars);

 }
}


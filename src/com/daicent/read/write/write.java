package com.daicent.read.write;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Random;

public class write {
	public static void main(String[] args) {
		File file1 = new File("D:\\IDE\\Read,Write/file.txt");
		Random random = new Random();
		try {
			BufferedWriter bufferedWriter = Files.newBufferedWriter(file1.toPath(),StandardCharsets.UTF_8);
			for (int i=0;i<100000;i++) {
				bufferedWriter.write(i+"Trần Hiếu Phúc :"+random.nextInt(100));
				bufferedWriter.newLine();
			}
			bufferedWriter.flush();
			bufferedWriter.close();
			System.out.println("Finally.......");
		} catch (Exception e) {
}}}


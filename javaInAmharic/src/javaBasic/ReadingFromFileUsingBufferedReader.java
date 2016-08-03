package javaBasic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadingFromFileUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// Reading from File located at 
		String myFile="C:\\Users\\ayana_000\\workspace\\javaInAmharic\\JavaDefinition.txt";
		//File reader reads 1 character at a time
		FileReader fr = new FileReader(myFile);
		// Buffer reader reads more than one character at a time, to make it fast
		BufferedReader br = new BufferedReader(fr);
		String currentLine;
		while((currentLine= br.readLine()) !=null){
			System.out.println(currentLine);
		}

	}

}

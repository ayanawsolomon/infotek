package javaBasic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFileUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File text = new File("D:/test.txt");
		Scanner sn= new Scanner(text);
		while(sn.hasNextLine()){
			System.out.println(sn.nextLine());
		}
		

	}

}

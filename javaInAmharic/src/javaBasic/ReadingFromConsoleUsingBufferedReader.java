package javaBasic;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
public class ReadingFromConsoleUsingBufferedReader {
	//use buffer reader just to read bulk text data, has big buffer to store, reads number of data at once
	     public static void main(String []args) throws IOException{
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	         System.out.println("enter your name");
	         System.out.println(br.readLine());
	        
	     }
	}



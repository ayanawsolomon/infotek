package javaBasic;

public class ForLoop {

	public static void main(String[] args) {
		// to print all students name existed in String array
		String[] Name={"solomon", "Piter", "Abreham", "John", "Jay", "Arol"};
		int[] Age={32, 31, 34, 26, 35, 40};
		for(int i=0; i<=5;i=i+2){
			//your code is here 
			System.out.println(Name[i] + ": "+ Age[i]);
		}
		
		
		
		// System.out.println(Name[3] + ": " + Age[3]);

	}

}

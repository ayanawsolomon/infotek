package javaBasic;

public class methos {
//adding two numbers using method
	public static void main(String[] Args) {
		
		// i need to add 20 and 50
		int i=60;
		int j=100;
		int a= add(i, j);
		System.out.print("sum of " + i + "  and " + j + " is : " + a);
		
	}

	// Addition of two numbers
	static int add(int a, int b){
		// use a and be
		int c=a+ b;
		// preocess that 
		//return the result
		return c;
	}
	
}

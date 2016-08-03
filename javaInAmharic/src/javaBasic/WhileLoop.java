package javaBasic;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Name={"solomon", "Amsalu", "Abreham", "Danat", "Tesfa", "Eyayu"};
		int[] Age={32, 31, 34, 26, 35, 40};
		int i=0;
		while(i<=5){
			
			//your code is here 
			System.out.println(Name[i] + ": "+ Age[i]);
			i=i+5;
		}
		//compare it to for loop also
				/*for(int i=0; i<=5;i=i+2){
					//your code is here 
					System.out.println(Name[i] + ": "+ Age[i]);
				}*/
	}

}

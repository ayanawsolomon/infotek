package javaBasic;

public class IfConditon {
//a program based on your age input, to guss which grade you might be inn currently.
	public static void main(String[] args) {
		String name="Solomon";
		int age=10;
		if(age <12){
			System.out.println("your are an elementary school student");
		}else if(age < 18){
			System.out.println("your are a high school student");
		}else if(age<24){
			System.out.println("your are a university student");
		}else{
			System.out.println("your are in employee age");
		}

	}

}

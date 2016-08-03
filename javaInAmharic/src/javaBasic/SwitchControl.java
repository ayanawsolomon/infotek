package javaBasic;

public class SwitchControl {
//Switch program based on your age it guess which grade you must be in normal situation . 
	public static void main(String[] args) {
		int age=18;
		switch(age){
		case 12:
			System.out.println("you must take minstry exam");
			break;
		case 18:
			System.out.println("you must take eslce exam this year");
			break;
		case 24:
			System.out.println("you must be graduated at a university this year");
			break;
		default:
			System.out.println("your out of boundary age");
		}

	}

}

package javaBasic;

public class LogicalOperator {
// this program prints either True or False based on the logic 
	public static void main(String[] args) {
		// java logic &&, ||
/*
 * and login && 
 * T&&T = T
 * T&&F =F
 * or || 
 * T||F=T
 *  
 * 
 * */
		System.out.println(((10<=20) && (40==40)));
		System.out.println(((10<=20) || (40==40)));
		System.out.println(((10>=20) || (40==40)));
		System.out.println(((10>=20) || (40>40)));
	}

}

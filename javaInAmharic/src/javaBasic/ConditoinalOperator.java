package javaBasic;

public class ConditoinalOperator {
	public static void main(String[] Args){
		// Calculating your body mass ration
		int hight = 6;
		int weight=160;
		String myBodMasResult= (weight/hight < 50)?"Normal": "Over weight";
		System.out.println(myBodMasResult);
		weight=300;
		myBodMasResult= (weight/hight < 50)?"Normal": "Over weight";
		System.out.println(myBodMasResult);
		
	}

}

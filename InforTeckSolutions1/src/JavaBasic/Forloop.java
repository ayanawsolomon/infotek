package JavaBasic;

public class  Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
		System.out.print("solomon's age is ="  + age + "dfdfsdfsdfsdf" + "\n");
		String myreturneddata= myAgeFuncion(age);
		for(int i =1; i <=10; i++){
			System.out.println(i + ")"  +  myreturneddata);
		}
		
	
	}
	
	
	
	private static  String  myAgeFuncion(int myage){
		String  myreturn;
		if(myage > 0 && myage < 49 ) {
		myreturn= "yourng"; 
	}else if(myage > 49 &&   myage<100){
		myreturn= "old";
	}else{
		myreturn= "out of range";
	}
		return myreturn;
}

}

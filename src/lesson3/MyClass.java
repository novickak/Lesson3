package lesson3;

public class MyClass {

	private int x = 5;
	
	//create a method
	public  void myString(){
		System.out.println("Print me");
		
	}
	//create method with parameters
	
	public void myNumber(int xNumber){
		System.out.println("xNumber is: " + xNumber);
		
	}
	
	
	public static void main(String[] args) {
		//create an object of type MyClass
		MyClass my0bj = new MyClass();
		
		System.out.println("X: " + my0bj.x);
		my0bj.myString();
		my0bj.myNumber(44);
		
		
	}//end main

}//end class

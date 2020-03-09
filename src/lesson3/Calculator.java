package lesson3;
//perform simple calculation using methods
public class Calculator {

	private double result;
	
	//declare a method called add - each method describes bahviour task with two parameters
	
	public void add(double number0ne, double numberTwo){
		//add value number0ne and numberTwo and store in instance variables
		result = number0ne + numberTwo;
		System.out.println(number0ne + " + " + numberTwo + " = " + result);
		
		result = number0ne - numberTwo;
		System.out.println(number0ne + " - " + numberTwo + " = " + result);
		
		result = number0ne / numberTwo;
		System.out.println(number0ne + " / " + numberTwo + " = " + result);
	}//ends the body of add method
	
	public static void main(String[] args) {
	

		//reuse the Calculator class
		//declare a variable of type  of Calculator
		Calculator calc;
		calc = new Calculator();
		
		calc.add(12.6, 18.8);
		
	}//end main	
	
	
}//end class

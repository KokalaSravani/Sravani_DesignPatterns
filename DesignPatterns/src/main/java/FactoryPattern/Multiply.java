package FactoryPattern;

public class Multiply implements Calculate {
	public void calculate(float a, float b) {
		System.out.println("Multiplication: "+(a*b));
	}

}
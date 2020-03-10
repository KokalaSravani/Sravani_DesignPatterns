package FactoryPattern;

public class Subtract implements Calculate{
	public void calculate(float a, float b) {
		System.out.println("Subtraction:"+(a-b));
	}

}
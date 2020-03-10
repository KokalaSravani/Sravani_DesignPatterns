package FactoryPattern;

public class Divide implements Calculate{
	
	public void calculate(float a, float b) {
		System.out.println("Division: "+(a/b));
	}

}
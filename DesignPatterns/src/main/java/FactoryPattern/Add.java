package FactoryPattern;

public class Add implements Calculate {

	public void calculate(float a, float b) {
		System.out.println("Addition: "+(a+b));
	}
}
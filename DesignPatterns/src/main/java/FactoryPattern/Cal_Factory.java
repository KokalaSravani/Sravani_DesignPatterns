package FactoryPattern;

public class Cal_Factory {
	public Calculate operations(int choose) {
		Calculate c = null;
		if(choose == 1) {
			c = new Add();
		} else if(choose == 2) {
			c = new Subtract();
		}else if(choose == 3) {
			c = new Multiply();
		}else if(choose == 4) {
			c = new Divide();
		} else {
			System.out.println("Invalid Operation");
		}
		return c;
	}

}
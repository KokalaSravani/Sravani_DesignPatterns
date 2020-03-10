package DecoratorPattern;

public class i10_Car extends CarDecorator{
	public i10_Car(CarModel car) {
		super(car);
	}
	
	@Override
	public void model() {
		// TODO Auto-generated method stub
		super.model();
		System.out.println("Adding Features of i10 Car");
	}
}
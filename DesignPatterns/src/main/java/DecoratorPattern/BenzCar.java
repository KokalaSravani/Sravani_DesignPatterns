package DecoratorPattern;


public class BenzCar extends CarDecorator{
	public BenzCar(CarModel car) {
		super(car);
	}
	
	@Override
	public void model() {
		// TODO Auto-generated method stub
		super.model();
		System.out.println("Adding Features of Benz Car");
	}
}
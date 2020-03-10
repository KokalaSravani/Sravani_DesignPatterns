package DecoratorPattern;

public class ImplementDecoration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic_CarModel bcar = new Basic_CarModel();
		System.out.println("----Sports car----");
		CarModel sportsCar = new i10_Car(bcar);
		sportsCar.model();
		System.out.println();
		
		System.out.println("----Luxury car----");
		CarModel luxuryCar = new BenzCar(bcar);
		luxuryCar.model();
		System.out.println();
		
		System.out.println("----Sportsluxury car---");
		CarModel sportsLuxuryCar = new i10_Car(new BenzCar(bcar));
		sportsLuxuryCar.model();
	}

}
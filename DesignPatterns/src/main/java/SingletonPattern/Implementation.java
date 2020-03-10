package SingletonPattern;

public class Implementation {

	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		
		System.out.println("Singleton objects are:");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Implementation obj1 = new Implementation();
		Implementation obj2 = new Implementation();
		
		System.out.println("\nNon singleton objects are:");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());


	}

}

public class DecoratorDemo {
	
	public static void demo() {
		Apartment apartment = new TwoBHK();
		Apartment apartment1=new ThreeBHK();
		
		Apartment twoBHKDecorator = new FloorDecorator(new TwoBHK());
		Apartment threeBHKDecorator = new FloorDecorator(new ThreeBHK());
		
		System.out.println("2 BHK Apartment with normal floor");
		apartment.buy();
		
		System.out.println("\n3 BHK Apartment with normal floor");
		apartment1.buy();
		
		System.out.println("\n2 BHK Apartment with woolen floor");
		twoBHKDecorator.buy();
		
		System.out.println("\n3 BHK Apartment with woolen floor");
		threeBHKDecorator.buy();

	}
}

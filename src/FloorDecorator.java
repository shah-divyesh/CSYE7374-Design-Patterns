
public class FloorDecorator extends ApartmentDecorator {

	public FloorDecorator(Apartment apartment) {
		super(apartment);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		super.buy();
		setFloorType();
		
	}

	public void setFloorType() {
		System.out.println("This apartment has woolen carpet on the floor");
	}
	

}

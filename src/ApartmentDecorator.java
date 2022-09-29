
public abstract class ApartmentDecorator implements Apartment {
	protected Apartment apartment;

	public ApartmentDecorator(Apartment apartment) {
		super();
		this.apartment = apartment;
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		apartment.buy();
	}
	
	
}

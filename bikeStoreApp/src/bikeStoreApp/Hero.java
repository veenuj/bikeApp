package bikeStoreApp;

public class Hero implements bikeDetail {

	@Override
	public String Info() {
		// TODO Auto-generated method stub
		System.out.println("Name of Bike: ");
		return "Hero Bike";
	}

	@Override
	public int Year() {
		// TODO Auto-generated method stub
		System.out.println("Year of Bike: ");
		return 2019;
	}

	@Override
	public int Price() {
		// TODO Auto-generated method stub
		System.out.println("Price of Bike: ");
		return 1200;
	}

}

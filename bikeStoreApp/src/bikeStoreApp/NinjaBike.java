package bikeStoreApp;

public class NinjaBike implements bikeDetail {

	@Override
	public String Info() {
		// TODO Auto-generated method stub
		System.out.println("Name of Bike: ");
		return "Ninja Bike";
	}

	@Override
	public int Year() {
		// TODO Auto-generated method stub
		System.out.println("Year of Bike: ");
		return 2018;
	}

	@Override
	public int Price() {
		// TODO Auto-generated method stub
		System.out.println("Price of Bike: ");
		return 14000;
	}

}

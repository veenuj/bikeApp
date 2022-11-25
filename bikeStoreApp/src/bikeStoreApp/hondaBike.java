package bikeStoreApp;

public class hondaBike implements bikeDetail {

	@Override
	public String Info() {
		// TODO Auto-generated method stub
		System.out.println("Name of Bike: ");
		return "Honda Bike";
	}

	@Override
	public int Year() {
		// TODO Auto-generated method stub
		System.out.println("Year of Bike: ");
		return 2021;
	}

	@Override
	public int Price() {
		// TODO Auto-generated method stub
		System.out.println("Price of Bike: ");
		return 2000;
	}

}

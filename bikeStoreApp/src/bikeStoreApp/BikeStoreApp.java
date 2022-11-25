package bikeStoreApp;

import java.util.Scanner;

public class BikeStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String mail;
		int x;
		int c = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		name=scanner.nextLine();
		System.out.println("Enter Your mail-id:");
		mail=scanner.nextLine();
		System.out.println("Your Mail-Id is :");
		System.out.println(mail);
		System.out.println("Choose bike by type 1,2,3 : \n1.Honda \n2. Ninja  \n3.Hero");
		x=scanner.nextInt();
		scanner.nextLine();
		switch(x){
		case 1: {
			hondaBike h=new hondaBike();
			System.out.println("____________________________________________________");
			System.out.println(h.Info());
			System.out.println(h.Year());
			System.out.println(h.Price());
			System.out.println("____________________________________________________");
			System.out.println("Hello");
			System.out.println(name);
			System.out.println("You Choose Bike");
			System.out.println(h.Info());
			System.out.println("____________________________________________________");

		}
		break;
		case 2: {
			NinjaBike n=new NinjaBike();
			System.out.println("____________________________________________________");
			System.out.println(n.Info());
			System.out.println(n.Year());
			System.out.println(n.Price());
			System.out.println("____________________________________________________");
			System.out.print("Hello");
			System.out.println(name);
			System.out.println("You Choose Bike");
			System.out.println(n.Info());
			System.out.println("____________________________________________________");

		}
		break;
		case 3: {
			Hero hh=new Hero();
			System.out.println("____________________________________________________");
			System.out.println(hh.Info());
			System.out.println(hh.Year());
			System.out.println(hh.Price());
			System.out.println("____________________________________________________");
			System.out.print("Hello");
			System.out.println(name);
			System.out.println("You Choose Bike");
			System.out.println(hh.Info());
			System.out.println("____________________________________________________");

		}
		break;
		default : 
		{
			System.out.println("____________________________________________________");
			System.out.println("Wait For update for more bikes");

			System.out.println("Wait For update for more bikes");
			System.out.print("Hello");
			System.out.println(name);
			System.out.print("You Choose Bike Wrong Bike Option");
			System.out.println("____________________________________________________");
			
		}


		}
		
		System.out.println("Want to buy ");
		System.out.println("chose 1&2 only :1. Yes or 2.No");
		c=scanner.nextInt();
		scanner.nextLine();
		if(c==1) {
			System.out.println("____________________________________________________");
			System.out.println("Please Contact on this +91-234278492");
			System.out.println("____________________________________________________");
		}else {
			System.out.println("____________________________________________________");
			System.out.println("!!!!Thank You For visit.!!!");
			System.out.println("____________________________________________________");
		}




		scanner.close();

	}

}

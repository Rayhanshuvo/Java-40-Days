package carShop;

import java.util.ArrayList;

public class SellCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarWithPrice carWithPrice1 = new CarWithPrice();
		CarWithPrice carWithPrice2 = new CarWithPrice();
		CarWithPrice carWithPrice3 = new CarWithPrice();
		CarWithPrice carWithPrice4 = new CarWithPrice();
		carWithPrice1.setCarName("BMW");
		carWithPrice1.setCarPrice("1000000");
		carWithPrice2.setCarName("TATA");
		carWithPrice2.setCarPrice("2000000");
		carWithPrice3.setCarName("ALPHARD");
		carWithPrice3.setCarPrice("3000000");
		carWithPrice4.setCarName("VO");
		carWithPrice4.setCarPrice("4000000");

		ArrayList<CarWithPrice> arrayListOfCarWithPrice = new ArrayList<>();

		/*
		 * arrayListOfCarWithPrice.add(0, carWithPrice1); arrayListOfCarWithPrice.add(1,
		 * carWithPrice2); arrayListOfCarWithPrice.add(2, carWithPrice3);
		 * arrayListOfCarWithPrice.add(3, carWithPrice4);
		 */

		arrayListOfCarWithPrice.add(carWithPrice1);
		arrayListOfCarWithPrice.add(carWithPrice2);
		arrayListOfCarWithPrice.add(carWithPrice3);
		arrayListOfCarWithPrice.add(carWithPrice4);

		for (CarWithPrice carWithPrice : arrayListOfCarWithPrice) {

			System.out.println("Car name is:" + carWithPrice);

		}

		System.out.println("Choose specification of car:");
		Car car = new Car();
		BuyerDemand buyerDemand = new BuyerDemand();

		car.setNameOfCAr("BMW");
		car.setCompanyOfCar("Miner");
		car.setModelOfCar("A6FFT20019");
		car.setColorOfCar("Black");
		buyerDemand.buyerDemand(car);
		buyerDemand.expectedCarPriceIs(40000000);

		buyerDemand.priceAndCountry("696435346534", "India");

	}

}

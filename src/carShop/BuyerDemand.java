package carShop;

import java.util.ArrayList;

public class BuyerDemand<T> {

	ArrayList<T> ex = new ArrayList<>();

	CarWithPrice carWithPrice = new CarWithPrice();

	public void buyerDemand(Car... cars) {

		for (Car car : cars) {

			System.out.println("Your demand is listed...Look at..." + car.getColorOfCar() + car.getCompanyOfCar()
					+ car.getCompanyOfCar() + car.getModelOfCar());

			if (car.getNameOfCAr() == "BMW") {

				System.out.println("Found BMW");

			}
		}

	}

	@SuppressWarnings("hiding")
	public <T> void expectedCarPriceIs(T carPrice) {
		// TODO Auto-generated method stub

		System.out.println("Car price is:" + carPrice);

	}

	public <T> void priceAndCountry(T price, T country) {

		System.out.println("Price" + price + "\n" + "Country" + country);

	}

}

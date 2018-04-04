package carShop;

public class CarWithPrice {

	private String carName;
	private String carPrice;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(String carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "CarWithPrice [carName=" + carName + ", carPrice=" + carPrice + "]";
	}

}

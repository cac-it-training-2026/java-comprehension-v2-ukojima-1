package q02_advanced.question01;

public class Coupon {

	private int id;
	private double discountRate;
	private String descriptionString;

	/**
	 * 
	 */
	public Coupon() {
	}

	/**
	 * @param id
	 * @param discountRate
	 * @param descriptionString
	 */
	public Coupon(int id, double discountRate, String descriptionString) {
		this.id = id;
		this.discountRate = discountRate;
		this.descriptionString = descriptionString;
	}

	@Override
	public String toString() {

	}

}

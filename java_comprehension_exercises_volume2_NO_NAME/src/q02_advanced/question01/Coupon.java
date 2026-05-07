package q02_advanced.question01;

public class Coupon {

	/**
	 * @param id
	 * @param discountRate
	 * @param descriptionString
	 */
	//	void setCoupon(int id, double discountRate, String description) {
	//		this.id = id;
	//		this.discountRate = discountRate;
	//		this.description = description;
	//	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private int id;
	private double discountRate;
	private String description;

	public int getId() {
		return id;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * 
	 */
	public Coupon() {
	}

	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;

	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + "\n"
				+ discountRate + ", description=" + description + "]";
	}

}

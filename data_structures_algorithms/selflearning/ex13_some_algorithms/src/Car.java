
public class Car {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n" + brand + "\n" + model + "\n" + year + "\n";
	}

	String brand;
	String model;//Accord 
	int year;//1999

	public Car() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param brand
	 * @param model
	 * @param year
	 */
	public Car(String brand, String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand to set
	 */
	public void setBrand(String b) {
		brand = b;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model to set
	 */
	public void setModel(String m) {
		model = m;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year to set
	 */
	public void setYear(int y) {
		this.year = y;
	}
	
	

}

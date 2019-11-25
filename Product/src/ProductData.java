import java.text.NumberFormat;

public class ProductData {

	private String code; // product code, "AB-01"
	private String description; // description of product
	private double price; // price of the product
	private int stock; // product count

	// New product code

	public ProductData() {

	}

	public String newCode() {
		return code;
	}

	public String newDescription() {
		return description;
	}

	public double newPrice() {
		return price;
	}

	public int newStock() {
		return stock;
	}

	public String toString() {
		return "Product Code: " 
				+ getCode() + "\n" + "Is a " 
				+ getDescription() + "\n" + "Its cost is "
				+ getPriceFormatted() + "\n" + "There is currently " 
				+ getStock() + " in stock.";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}

	public void setPriceFormatted(double price) {
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}

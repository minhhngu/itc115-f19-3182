package assignment_10;

public class advanceTicket extends Ticket {

	private int days;
	public double getPrice;

	public advanceTicket(int number, int days) {
		super(number);
		this.days = days;
	}

	public double getPrice() {
		if (days <= 10 ) {
			return 30.00;
		}
		else {
			return 40.00;
		}
	}
	
	public String toString() {
		return "Number: " + getNumber() + ", Price Per Ticket: " +  getPrice() + ", Total Cost: " +  (getNumber() * getPrice()) + " (ID required)";
	}
}

package assignment_10;

public class studentAdvanceTicket extends advanceTicket {

	private int days;
	
	public studentAdvanceTicket(int number, int days) {
		super(number, days);
		this.days = days;
	}
	
	public double getPrice() {
		if (days <= 10) {
			return 15.00;
		}
		else {
			return 20.00;
		}
	}
	
	public String toString() {
		return "Number: " + getNumber() + ", Price Per Ticket: " +  getPrice() + ", Total Cost: " +  (getNumber() * getPrice()) + " (ID required)";
	}
}

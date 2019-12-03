package assignment_10;

public class walkUpTicket extends Ticket {
	
	public walkUpTicket(int number) {
		super(number);
	}
	
	public double getPrice() {
		return 50;
	}
	
	public String toString() {
		return "Number: " + getNumber() + ", Price Per Ticket: " +  getPrice() + ", Total Cost: " + (getNumber() * getPrice()); 
	}
}

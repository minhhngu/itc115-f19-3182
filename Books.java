
public class Books extends librarySystem {
	
	private int days;
	public double finesAccrued;
	private String titleStatus;


	public Books(String titleStatus, int days) {
		this.days = days;
		this.titleStatus = titleStatus;
		
	}
	
	public String gettitleStatus() {
		return titleStatus;
	}

	public int getdays() {
		return days;
	}
	
	public double finesAccrued() {
		if (days > 1) {
			return 0.5 * days;
		}
		
		else {
			return 0;
		}
	}
	
	public String toString() {
		return "Title, reserved, checked in: " + gettitleStatus() + "How many days late? " + getdays() + ", The fine is: " + finesAccrued();
	}

	@Override
	public String titleStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
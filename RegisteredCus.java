package version_b.q1;

public class RegisteredCus extends Customer{
	private double rewardPoints = 0.0;
	private double subTotal = 0.0;
	private double netAmount = 0.0;
	
	public RegisteredCus() {}

	public RegisteredCus(int id, String name, double rpoints, double stot) {
		super(id, name);
		this.rewardPoints = rpoints;
		this.subTotal = stot;
	}

	@Override
	public void calculateBill() {
		rewardPoints = subTotal * (15/100.0);
		netAmount = subTotal - (subTotal * (7/100.0));
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Customer Reward Points   : " + rewardPoints + "0");
		System.out.println("Customer Net Amount      : " + netAmount + "0");
	}

}

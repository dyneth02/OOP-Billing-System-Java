package version_b.q1;

public abstract class Customer {
	protected int id;
	protected String name;
	
	public Customer() {
		this.id = 0;
		this.name = "Unknown"
	}
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public abstract void calculateBill();
	
	public void display() {
		System.out.println("Customer ID is " + id);
		System.out.println("Customer Name is " + name);
	}
	
}

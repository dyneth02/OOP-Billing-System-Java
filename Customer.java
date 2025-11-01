package version_b.q1;

public abstract class Customer {
	protected int id;
	protected String name;
	
	public Customer() {}
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public abstract void calculateBill();
	
	public void display() {
		System.out.println("Customer ID              : " + id);
		System.out.println("Customer Name            : " + name);
	}
	
}

package version_b.q1;

import java.util.Scanner;

public class BillingApp {

	public static void main(String[] args) {
		RegisteredCus newCus = null;
		double billAmt = 0.0;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter your bill amount   : ");
		billAmt = read.nextDouble();
		
		newCus = new RegisteredCus(101, "Mr.Galpaatha", 0.0, billAmt);
		newCus.calculateBill();
		newCus.display();
		
	}
}

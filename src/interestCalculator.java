import java.util.Scanner;

public class interestCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double principal;
		double rate;
		int timesCompunded;
		int years;
		double amount;
		
		System.out.print("Enter the principal amount: ");
		principal = scanner.nextDouble();
		
		System.out.print("Enter the interest rate (in %): ");
		rate = scanner.nextDouble() / 100;
		
		System.out.print("Enter the # of times compunded: ");
		timesCompunded = scanner.nextInt();
		
		System.out.print("Enter the amount of years: ");
		years = scanner.nextInt();
		
		amount = principal * Math.pow(1 + rate / timesCompunded, timesCompunded * years);
		
		System.out.printf("The amount after %d years is $%.2f", years, amount);
		
		scanner.close();

	}

}

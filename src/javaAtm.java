import java.util.Scanner;

public class javaAtm {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// BAKNKING PROGRAM.
		
				double balance = 200;
				boolean isRunning = true;
				int choice;
				
				while(isRunning) {
					
					System.out.println("********************************");
					System.out.println("WELCOME TO THE BANKING PROGRAM");
					System.out.println("********************************\n");
					System.out.println("Select one of the following options:");
					System.out.println("1-Balance");
					System.out.println("2- Deposit");
					System.out.println("3- Withdraw");
					System.out.println("4- Exit");
					System.out.println("********************************\n");
					
					System.out.print("Enter your choice (1-4): ");
					choice = scanner.nextInt();
					
					switch(choice) {
					case 1 -> showBalance(balance);
					case 2 -> balance +=  deposit();
					case 3 -> balance -= withdraw(balance);
					case 4 -> isRunning = false;
					default -> System.out.println("INVALID CHOICE");
					}
				}
				
				System.out.println("********************************\n");
				System.out.println("THANKS! HAVE A WONDERFUL DAY");
				


			}
			
			static void showBalance( double balance) {
				System.out.printf("$%.2f\n", balance);
			}
			
			static double deposit() {
				
				double amount;
				
				System.out.print("Enter an amount to be deposited: ");
				amount = scanner.nextDouble();
				
				if(amount < 0) {
					System.out.println("Amount cannot be negative");
					return 0;
				} else {
					return amount;
				}
				
			}
			
			static double withdraw(double balance) {
				
				double amount;
				
				System.out.println("Enter the amount to be withdrawn: ");
				amount = scanner.nextDouble();
				
				if(amount > balance) {
					System.out.println("INNSUFFICIENT FUNDS");
					return 0;
				} else if (amount < 0) {
					System.out.println("AMOUNT CAN'T BE NEGATIVE");
					return 0;
				} else {
					return amount;
			}
			}
}



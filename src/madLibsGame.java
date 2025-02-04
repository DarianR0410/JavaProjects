import java.util.Scanner;

public class madLibsGame {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		String adjetiveOne;
		String nounOne;
		String adjetiveTwo;
		String verbOne;
		String adjetiveThree;

		System.out.println("\nEnter an adjetive: ");
		adjetiveOne = scanner.nextLine();
		System.out.println("Enter a noun (animal or person): ");
		nounOne = scanner.nextLine();
		System.out.println("Enter an adjetive:");
		adjetiveTwo = scanner.nextLine (); 
		System.out.println("Enter a verb ending with -ing:");
		verbOne = scanner.nextLine();
		System.out.println("Enter an adjetive:");
		adjetiveThree = scanner.nextLine();

		
		System.out.println("Today I went to a "+ adjetiveOne + " zoo");
		System.out.println("In an exhibit, I saw a "+ nounOne + ".");
		System.out.println(nounOne + " was "+ adjetiveTwo + " and " + verbOne + "!");
		System.out.println("I was " + adjetiveThree + "!");
		
		scanner.close();

	}

}

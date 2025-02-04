import java.util.Random;
import java.util.Scanner;

public class diceRoller {

	public static void main(String[] args) {
		// DICE ROLLER PROGRAM
		
				Scanner scanner = new Scanner(System.in);
				
				Random random = new Random();
				int numbDice;
				int total = 0;
				
				System.out.print("Enter the # of dice to roll: ");
				numbDice = scanner.nextInt();
				
				
				if (numbDice > 0) {
					for (int i = 0; i < numbDice; i++) {
						int roll = random.nextInt(1,7);
						printDie(roll);
						System.out.println("You roll "+ roll);
						total += roll;
					}
					System.out.println("Total = "+ total);
				} else {
					System.out.println("# Of dice must be greater than 0");
				}
				
				
				// DISPLACE THE ASCII DICE
				
				scanner.close();
				
			}

			static void printDie(int roll) {
				
				
				String diceOne = """
					   -------
					   |     |
					   |  •  |
					   |     |
					   -------
					   		""";
				
				String diceTwo =  """
						   -------
						   |•    |
						   |     |
						   |    •|
						   -------
						   		""";
				
				String diceThree = """
						   -------
						   |•    |
						   |  •  |
						   |    •|
						   -------
						   		""";
				
				String diceFour = """
						   -------
						   |•   •|
						   |     |
						   |•   •|
						   -------
						   		""";
				
				String diceFive ="""
						   -------
						   |•   •|
						   |  •  |
						   |•   •|
						   -------
						   		""";
				
				String diceSix ="""
						   -------
						   |•   •|
						   |•   •|
						   |•   •|
						   -------
						   		""";
				
				switch(roll) {
				
				case 1 -> System.out.println(diceOne);
				case 2 -> System.out.println(diceTwo);
				case 3 -> System.out.println(diceThree);
				case 4 -> System.out.println(diceFour);
				case 5 -> System.out.println(diceFive);
				case 6 -> System.out.println(diceSix);
				default -> System.out.println("Invalid roll");
				}
				

	}

}

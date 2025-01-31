import java.util.Scanner;

public class quizzGame {

	public static void main(String[] args) {

		// JAVA QUIZZ GAME
	
		
		String[] question = {"What component of a computer makes it able to use WiFi?", "What's the main component of a computer?", "What is ASCII code?", "What's a software developer?", "What's the function of AI?"};
		
		String[][] options = {{"1. The motherboard", "2 The WLAN Card", "3. The charger"}, {"1 The hardware", "2. The WiFi", "3. The CPU"}, {"1. Code that represent characters as numbers", "2. A motherboeard component", "3. A router"}, {"1. Someone who cooks for others", "2. A dumbass", "3. A person who's prepared to build a software project by themself"}, {"1. Get control of the world", "2. Make us their slaves", "3. Help people on their daily duties"}};
		
		
		int[] answer = {2, 3, 1, 3, 3};
		int score = 0;
		int guess = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("**********************************");
		System.out.println("WElCOME! To the Java Quizz game");
		System.out.println("**********************************");
		
		
		for(int i = 0; i < question.length; i++) {
			
			System.out.println(question[i]);
			
			for(String option : options[i]) {
				System.out.println(option);
			}
			
			System.out.println("Enter the guess: ");
			guess = scanner.nextInt();
			
			if(guess == answer[i]) {
				System.out.println("****************");
				System.out.println("CORRECT!!");
				System.out.println("****************");
				score++;
			} else {
				System.out.println("****************");
				System.out.println("WRONG!!");
				System.out.println("****************");
				
			}
		}
		
		System.out.println("Your final score is: "+ score + " out of "+ question.length);
		

	}

}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangmanGame {

	public static void main(String[] args) {
		
		String filePath = "src/words";
		
		ArrayList<String> words = new ArrayList<>();	
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			
			while((line = reader.readLine()) != null) {
				words.add(line.trim());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Couldn not find this file");
			
		} catch (IOException e) {
			System.out.println("Something went wrong!");
		}
		
		Random random = new Random();
		String word = words.get(random.nextInt(words.size()));
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Character> wordState = new ArrayList<>();
		
		int wrongGuess = 0;
		
		for(int i = 0; i < word.length(); i++) {
			
			wordState.add('_');
			
		}
		
		System.out.println("--------------------");
		System.out.println("Welcome to hangman!");
		System.out.println("--------------------");
	
		
		while (wrongGuess < 6) {
			
			System.out.println(getHangmanArt(wrongGuess));
			
			System.out.print("Word: ");
			
			for(char c : wordState) {
				System.out.print(c + " ");
				
			}
			System.out.println();
			
			System.out.print("Guess a letter: ");
			char guess = scanner.next().toLowerCase().charAt(0);
			
			if(word.indexOf(guess) >= 0) {
				System.out.println("Correct guess!\n");
				
				for(int i = 0; i < word.length(); i++) {
					if(word.charAt(i) == guess) {
						wordState.set(i,  guess);
						
					}
					
					if(!wordState.contains('_')) {
						System.out.println(getHangmanArt(wrongGuess));
						System.out.println("You won! The word was: "+ word);
						break;
					}
				}
				
			} else {
				wrongGuess++;
				System.out.println("That was a weong guess.\n");
			}
			
			if(wrongGuess >= 6) {
				System.out.println(getHangmanArt(wrongGuess));
				System.out.println("GAME OVER!");
				System.out.println("The correct word was: "+ word);
			}
			
			
		}
		
		scanner.close();
		

	}

	static String getHangmanArt(int wrongGuess) {
		
		return switch(wrongGuess) {
		
		case 0 -> """
				
				
				
				""";
		case 1 -> """
				
				O
				
				
				""";
		
		case 2 -> """
		
		        O
		        |
		
		
		        """;
		
		case 3 -> """
		
                 O
                /|


               """;
		
		case 4 -> """
		
                   O
                  /|\\


                 """;
		case 5 -> """
		
                  O
                 /|\\
                 /

                 """;
		
		case 6 -> """
		
                  O
                 /|\\
                 / \\

                    """;
		
		default -> " ";
		
		};
	}
}

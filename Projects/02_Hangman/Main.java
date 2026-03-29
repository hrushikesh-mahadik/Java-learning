import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HangmanGame game = new HangmanGame();

        game.loadWords("words.txt");
        game.startGame();

        while (true) {
            game.displayWord();

            System.out.print("Enter a letter: ");
            char letter;

            try {
                letter = sc.next().toLowerCase().charAt(0);
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
                continue;
            }

            game.guessLetter(letter);

            if (game.isWon()) {
                System.out.println("🎉 You Won! Word: " + game.getWord());
                break;
            }

            if (game.isGameOver()) {
                System.out.println("💀 Game Over! Word was: " + game.getWord());
                break;
            }
        }
    }
}
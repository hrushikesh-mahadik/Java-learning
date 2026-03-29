import java.io.*;
import java.util.*;

class HangmanGame {

    private ArrayList<String> words = new ArrayList<>();
    private String word;
    private char[] guessedWord;
    private int attempts = 6;

    // Load words from file
    public void loadWords(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line.toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Start game
    public void startGame() {
        if (words.isEmpty()) {
            System.out.println("No words available!");
            return;
        }

        Random rand = new Random();
        word = words.get(rand.nextInt(words.size()));
        guessedWord = new char[word.length()];
        Arrays.fill(guessedWord, '_');
    }

    // Display current progress
    public void displayWord() {
        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println("\nAttempts left: " + attempts);
    }

    // Guess letter
    public void guessLetter(char letter) {
        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedWord[i] = letter;
                found = true;
            }
        }

        if (!found) {
            attempts--;
            System.out.println("Wrong guess!");
        }
    }

    // Check win
    public boolean isWon() {
        return word.equals(new String(guessedWord));
    }

    // Check game over
    public boolean isGameOver() {
        return attempts <= 0;
    }

    public String getWord() {
        return word;
    }
}

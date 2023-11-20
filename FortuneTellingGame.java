import java.util.Random;
import java.util.Scanner;

public class FortuneTellingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Fortune Telling Game!");
        System.out.println("Ask a yes/no question, and I will reveal your fortune.");

        while (true) {
            System.out.print("Ask a question (or type 'exit' to end the game): ");
            String question = scanner.nextLine().trim().toLowerCase();

            if (question.equals("exit")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            String fortune = generateFortune();
            System.out.println("Your fortune: " + fortune);
        }

        scanner.close();
    }

    private static String generateFortune() {
        String[] fortunes = {
            "Yes, for sure.",
            "Nope, not happening!",
            "It's possible.",
            "Uncertain, try again.",
            "You will have become rich.",
            "I wouldn't do that if I were you.",
            "It is clear you should do it.",
            "You shouldn't do that.",
            "The stars are aligning!",
            "Go for it!"
        };

        Random random = new Random();
        int index = random.nextInt(fortunes.length);

        return fortunes[index];
    }
}

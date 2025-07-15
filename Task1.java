import java.util.*;

public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int rounds = 0;
        int totalScore = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            rounds++;
            System.out.println("\n🔁 Starting Round " + rounds);
            int score = playRound(); 
            totalScore += score;

            System.out.print("Do you want to play another round? (yes/no): ");
            String response = sc.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\n🎉 Game Over!");
        System.out.println("Total Rounds Played: " + rounds);
        System.out.println("Total Score: " + totalScore);
    }

    // Play one round of the game
    public static int playRound() {
        int target = rand.nextInt(100) + 1; 
        int maxAttempts = 7;
        int attempts = 0;

        while (attempts < maxAttempts) {
            attempts++;
            System.out.print("🔢 Attempt " + attempts + ": Enter your guess (1-100): ");
            int guess = sc.nextInt();

            if (guess == target) {
                System.out.println("✅ Correct! You guessed the number in " + attempts + " attempts.");
                int score = 10 - attempts + 1; 
                System.out.println("🏆 Score for this round: " + score);
                return score;
            } else if (guess < target) {
                System.out.println("📉 Too low!");
            } else {
                System.out.println("📈 Too high!");
            }
        }

        System.out.println("❌ You've used all attempts. The correct number was: " + target);
        return 0; 
    }
}

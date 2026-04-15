import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess number between 1 to 100");

        while (guess != number) {
            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High ⬆");
            else if (guess < number)
                System.out.println("Too Low ⬇");
            else
                System.out.println("Correct 🎉");
        }
    }
}
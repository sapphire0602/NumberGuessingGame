import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        int number1 = (int) (Math.random() * 10);
        Scanner guess = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.println("Enter your guessed number : ");
            int answer = guess.nextInt();
            if (answer == number1)
                System.out.println("Wow , You guessed right  : " + number1);
            else if (answer > number1)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
    }
}

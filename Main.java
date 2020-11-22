import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Random aleatoria = new Random();
    Scanner in = new Scanner(System.in);
    int x = aleatoria.nextInt(100) + 1;

    System.out.println("I have magically conjured up a number from 1-100. ");
    System.out.println("I want you to guess it!");
    System.out.println(
        "I will count how many guesses it takes and then tell you once you get it right. I'm not sure why. Maybe to humiliate you.");
    int count = 1;
    int guess = 0;
    do {
      count++;
      System.out.println("Guess the number and enter it here: ");
      guess = in.nextInt();
      if (guess > x) {
        System.out.println("Too high〜");
      } else if (guess < x) {
        System.out.println("Too low〜");
      } else if (guess == x) {
        System.out.println("You got it!!!");
      }
    } while (guess != x);
    System.out.println("The number was " + x + ".");
    System.out.println("It took you " + count + " guesses to get it right.");
  }
}
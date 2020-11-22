import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Random aleatoria = new Random();
    Scanner in = new Scanner(System.in);
    int x = aleatoria.nextInt(100) + 1;

    System.out.println("私は魔法のように1から100までの数（整数）を作成しました");
    System.out.println("それが何であるかを推測してみてください！");
    System.out.println("私はそれがあなたにかかる推測の数を数えます。");
    int count = 1;
    int guess = 0;
    do {
      count++;
      System.out.println("番号を推測して、ここに入力します:");
      guess = in.nextInt();
      if (guess > x) {
        System.out.println("高すぎる〜");
      } else if (guess < x) {
        System.out.println("低すぎる〜");
      } else if (guess == x) {
        System.out.println("正しい!!!");
      }
    } while (guess != x);
    System.out.println("私が作成した数は" + x + "でした");
    System.out.println("あなたは数を推測するために" + count + "回の試みが必要でした");
  }
}
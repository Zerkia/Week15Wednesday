package Week15Wednesday;

import java.util.Scanner;

public class StudentMain {
  Student karl = new Student("Karl", null);

  void run() {
    karl.setGrades(giveGrades());
    System.out.println(karl);
  }

  public int[] giveGrades() {
    Scanner sc = new Scanner(System.in);
    int[] temp = new int[7];

    System.out.println("Kan kun modtage -3, 00, 2, 4, 7, 10 og 12");
    int input = 0;
    boolean valid = false;

    for (int i = 0; i < temp.length; i++) {
      valid = false;
      while (!valid) {
        input = sc.nextInt();
        switch (input) {
          case -3, 0, 2, 4, 7, 10, 12:
            temp[i] = input;
            valid = true;
            break;
          default:
            System.out.println("Kan kun modtage -3, 00, 2, 4, 7, 10 og 12");
        }
      }
    }
    return temp;
  }

  public static void main(String[] args) {
    new StudentMain().run();
  }
}

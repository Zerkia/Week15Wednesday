package Week15Wednesday;

import java.util.Scanner;

public class StudentMain {
  Student karl = new Student("Karl", null);
  Student jens = new Student("Jens", null);


  void run(){
    karl.setGrades(giveGrades());
    System.out.println(karl);
  }

  public int[] giveGrades(){
    Scanner sc = new Scanner(System.in);
    int[] temp = new int[7];

    System.out.println("Kan kun modtage -3, 00, 2, 4, 7, 10 og 12");
    int input = 0;

    for (int i = 0; i < temp.length; i++) {
      for (int j = 0; j < Student.getGradeCurve().length; j++) {
        while (!Student.getGradeCurve().equals(input)) {
          System.out.println("Kan kun modtage -3, 00, 2, 4, 7, 10 og 12");
          input = sc.nextInt();
        }
      }
      //input = sc.nextInt();
      temp[i] = input;
    }
   return temp;
  }

  public static void main(String[] args) {
    new StudentMain().run();
  }
}

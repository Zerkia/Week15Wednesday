package Week15Wednesday;

import java.util.Scanner;

public class StudentMain {
  Student karl = new Student("Karl", null);
  Student jens = new Student("Jens", null);


  void run(){
    karl.setGrades(giveGrades());
  }

  public int[] giveGrades(){
    Scanner sc = new Scanner(System.in);
    int[] temp = new int[7];
    for (int i = 0; i < temp.length; i++) {
      temp[i] = sc.nextInt();
    }
   return temp;
  }

  public static void main(String[] args) {
    new StudentMain().run();
  }
}

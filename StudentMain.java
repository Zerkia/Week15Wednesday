package Week15Wednesday;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
  Student karl = new Student("Jens", null);

  void run() {
    karl.setGrades(giveGrades());
    System.out.println(karl);
    System.out.println();
  }

  public int readGrades(){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    return input;
  }

    public int[] giveGrades(){
      int[] temp = new int[8];
      System.out.println("Kan kun modtage -3, 00, 2, 4, 7, 10 og 12");
      int input;
      boolean valid = false;

      for (int i = 0; i < temp.length; i++) {
        valid = false;
        while (!valid) {
          input = readGrades();
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

    int writtenGrade = temp[6];
    int vocalGrade = temp[7];
    double totalGrade = ((vocalGrade * 0.75) + (writtenGrade * 0.25));

    if (totalGrade <= -3 ) {
      totalGrade = -3;
    } else if (totalGrade >= -3 && totalGrade <= 00){
      totalGrade = 0;
    } else if (totalGrade >= 00 && totalGrade <= 2){
      totalGrade = 2;
    } else if (totalGrade >= 2 && totalGrade <= 4) {
      totalGrade = 4;
    }else if (totalGrade >= 4 && totalGrade <= 7) {
      totalGrade = 7;
    }else if (totalGrade >= 7 && totalGrade <= 10) {
      totalGrade = 10;
    }else if (totalGrade >= 10 && totalGrade <= 12) {
      totalGrade = 12;
    }

    temp[6] = (int) totalGrade;
    int[] temp2 = Arrays.copyOf(temp, temp.length-1);

    return temp2;
  }

  public static void main(String[] args) {
    new StudentMain().run();
  }
}

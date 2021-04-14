package Week15Wednesday;

import java.util.Arrays;

public class Student {
  private String name;
  private int grades[] = new int[7];
  private static final int[] gradeCurve = {-3, 00, 02, 4, 7, 10, 12};

  public Student(String name, int grade[]){
    this.name = name;
    this.grades = grade;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int[] getGrades() {
    return grades;
  }

  public void setGrades(int[] grades) {
    this.grades = grades;
  }

  public static int[] getGradeCurve() {
    return Arrays.copyOf(gradeCurve, gradeCurve.length);
  }

  @Override
  public String toString() {
    return "Name: " + name + "\n" +
        "Grade: " + Arrays.toString(grades) +
        "\nGrades: " + Arrays.toString(gradeCurve);
  }
}

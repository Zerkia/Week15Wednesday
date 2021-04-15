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

  public void setGrades(int[] grades) {
    this.grades = grades;
  }

  @Override
  public String toString() {
    return "Student name: " + name + "\n" +
        "Grade: " + Arrays.toString(grades);
  }
}

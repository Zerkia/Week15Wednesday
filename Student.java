package Week15Wednesday;

import java.util.Arrays;

public class Student {
  private String name;
  private int[] grade = new int[7];
  private int[] grades = {-3, 00, 02, 4, 7, 10, 12};

  public Student(String name, int grade[], int [] grades){
    this.name = name;
    this.grade = grade;
    this.grades = grades;
  }

  public String getName() {
    return name;
  }

  public int[] getGrade() {
    return grade;
  }

  public int[] getGrades() {
    return grades;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGrade(int[] grade) {
    this.grade = grade;
  }

  public void setGrades(int[] grades) {
    this.grades = grades;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", grade=" + Arrays.toString(grade) +
        ", grades=" + Arrays.toString(grades) +
        '}';
  }
}

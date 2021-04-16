package Week15Wednesday;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StudentMainTest {

  @Test
  public void giveGradesPartialTest(){
    int[] expected = new int[8];
    expected[0] = 10;
    expected[1] = 4;
    expected[2] = 7;
    expected[3] = 2;
    expected[4] = 12;
    expected[5] = 10;
    expected[6] = 4;
    expected[7] = 10;
    Student student = new Student("jens", expected);

    int[] act = new int[8];
    act[0] = 10;
    act[1] = 4;
    act[2] = 7;
    act[3] = 2;
    act[4] = 12;
    act[5] = 10;
    act[6] = 4;
    act[7] = 10;

    assertArrayEquals(expected, act);

  }

  @Test
  public void mergeGrades(){
    //Arrange
    StudentMain studentMain = new StudentMain();

    //Act
    double act = studentMain.mergeGrades(10, 7);

    //Assert
    assertEquals(9.25, act);
  }

  @Test
  public void convertToRealGrade(){
    StudentMain studentMain = new StudentMain();

    double act = studentMain.convertToRealGrade(9.25);

    assertEquals(10, act);
  }

  @ParameterizedTest
  @CsvSource(value = {"8:10.0", "1:2.0", "3:4.0", "-2:00.0", "5:7.0", "11:12.0"}, delimiter = ':')
  public void convertToRealGrade(double totalGrade, double expected) {
    StudentMain studentMain = new StudentMain();
    double actual = studentMain.convertToRealGrade(totalGrade);
    //double expected = Double.parseDouble(expected1);
    //actual = (int) actual;
    //expected = (int) expected;
    assertEquals(expected, actual);
  }

}
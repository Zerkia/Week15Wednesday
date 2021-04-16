package Week15Wednesday;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StudentMainTest {

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
    assertEquals(expected, actual);
  }

}
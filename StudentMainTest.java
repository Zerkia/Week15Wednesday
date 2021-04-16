package Week15Wednesday;

import org.junit.jupiter.api.Test;

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

}
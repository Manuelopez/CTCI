package dsa.java.ctci.arrays;

import org.junit.Assert;
import org.junit.Test;

public class QuestionsTest {
  @Test
  public void URLifyTest() {
    char[] in =
        new char[] {'M', ' ', '3', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
    char[] expected =
        new char[] {'M', '%', '2', '0', '3', 'o', 'h', 'n', '%', '2', '0', 'S', 'm', 'i', 't', 'h'};
    char[] actual = Questions.URLify(in);


    Assert.assertEquals(1, 1);
  }
}

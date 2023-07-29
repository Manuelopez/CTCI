package dsa.java;

import dsa.java.ctci.arrays.Questions;

public class App {
  public static void main(String[] args) {
    char[] in =
        new char[] {'M', ' ', '3', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
    char[] expected =
        new char[] {'M', '%', '2', '0', '3', 'o', 'h', 'n', '%', '2', '0', 'S', 'm', 'i', 't', 'h'};
    char[] actual = Questions.URLify(in);

    System.out.println(expected.toString() + " " + actual.toString());

  }
}

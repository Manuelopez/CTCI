package dsa.java.ctci.arrays;

import java.util.Arrays;

/**
 * Solutuins to cracking the coding inerview arrays quesitons
 **/
public class Questions {

  /**
   * Solution to the is unique problem -- Time O (N) -- Space O(1)
   * 
   * @param
   * @return boolean
   **/
  public static boolean isUnique(String str) {

    if (str.length() > 256) {
      return false;
    }

    boolean[] alphabet = new boolean[256];

    for (char c : str.toCharArray()) {
      if (alphabet[c]) {
        return false;
      } else {
        alphabet[c] = true;
      }
    }
    return true;
  }


  /**
   * Solutions to the check Permuation -- Time O(N) -- Space O(1)
   * 
   * @param
   * @return true if the two strings contain the same characters forgetting arragement
   **/
  public static boolean checkPermutation(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }

    int[] aFeq = new int[256];
    int[] bFeq = new int[256];

    for (int i = 0; i < a.length(); i++) {
      char cA = a.charAt(i);
      char cB = b.charAt(i);

      aFeq[cA] += 1;
      bFeq[cB] += 1;
    }

    return Arrays.equals(aFeq, bFeq);
  }


  /**
   * Solutuon to the URlify Problem
   * 
   * @param
   * @return the url version of the string or char[]
   **/
  public static char[] URLify(char[] str) {

    for (int i = 0; i < str.length; i++) {
      if (str[i] == ' ') {
        for (int j = str.length - 1; j > i; j--) {
          str[j] = str[j - 1];
        }

        for (int j = str.length - 1; j > i; j--) {
          str[j] = str[j - 1];
        }

        str[i] = '%';
        str[i + 1] = '2';
        str[i + 2] = '0';
      }
    }

    return str;
  }

}

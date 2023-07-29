package dsa.java.sort;

public class Sort {

  public static void InsertionSort(int[] arr) {

    while (true) {

      boolean swap = false;

      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          swap = true;
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
        }
      }

      if (!swap) {
        break;
      }
    }

  }

}

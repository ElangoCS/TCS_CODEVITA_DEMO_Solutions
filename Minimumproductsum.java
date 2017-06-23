import java.util.*;
public class Main {
 public static void main(String args[]) {
  Scanner in = new Scanner(System.in);
  int size_of_array = in .nextInt();
  int no_of_reduction = ( in .nextInt()) * 2;
  int[] arr1 = new int[size_of_array];
  for (int i = 0; i < size_of_array; i++) {
   arr1[i] = in .nextInt();
  }
  int total = 0;
  int[] arr2 = new int[size_of_array];
  int use = 0;
  for (int i = 0; i < size_of_array; i++) {
   arr2[i] = in .nextInt();
   total = total + (arr2[i] * arr1[i]);
   use = arr1[i];
   if (arr1[i] > 0) {
    arr1[i] = arr2[i] * (arr1[i] - no_of_reduction);
   } else {
    arr1[i] = arr2[i] * (arr1[i] + no_of_reduction);
   }
   arr2[i] = arr2[i] * use;
  }

  int min = Integer.MAX_VALUE;
  int n_total = 0;
  for (int i = 0; i < size_of_array; i++) {
   n_total = total + arr1[i] - arr2[i];
   if (min > n_total) {
    min = n_total;
   }
  }
  System.out.println(min);
 }
}

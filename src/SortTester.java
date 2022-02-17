import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 ={17, 16, 15, 14, 13 ,12 ,11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {17, 16, 15, 14, 13 ,12 ,11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}

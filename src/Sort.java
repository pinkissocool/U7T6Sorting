import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?
  public static void selectionSort(int[] elements)
  {
    int count = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {      
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
        count++;
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;

    }
    System.out.println("Sort: " + count);
  }

  // Part A.  Which Sort is Which?
  public static void insertionSort(int[] elements)
  {
    
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp > elements[possibleIndex - 1])
      {     
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;

      }
      elements[possibleIndex] = temp;

    }
    System.out.println("Insert: ");
  }
  
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {

    for (int j = 0; j < words.size() - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < words.size(); k++)
      {
        if (words.get(k).compareTo(words.get(minIndex)) < 0)
        {
          minIndex = k;
        }

      }
      String temp = words.get(j);
      words.set(j, words.get(minIndex));
      words.set(minIndex, temp);

    }

  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> elements)
  {
    for (int i = 1; i < elements.size(); i++)
    {
      String temp = elements.get(i);
      int possibleIndex = i;
      while (possibleIndex > 0 && temp.compareTo(elements.get(possibleIndex-1)) < 0)
      {
        elements.set(possibleIndex, elements.get(possibleIndex-1));
        possibleIndex--;

      }
      elements.set(possibleIndex, temp);

    }

  }
}
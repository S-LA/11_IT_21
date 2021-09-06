package sorting;

// Java implementation of QuickSort


public class Merge {

  // A utility function to swap two elements
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  /* This function takes last element as pivot, places
  the pivot element at its correct position in sorted
  array, and places all smaller (smaller than pivot)
  to left of pivot and all greater elements to right
  of pivot */
  public static int partition(int[] arr, int low, int high) {

    // pivot
    int pivot = arr[high];
    System.out.println("pivot: " + pivot );

    // Index of smaller element and
    // indicates the right position
    // of pivot found so far
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {

      // If current element is smaller
      // than the pivot
      if (arr[j] < pivot) {

        // Increment index of
        // smaller element
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    for(int k: arr){
      System.out.print(k + " ");
    }
    System.out.println();
    return (i + 1);
  }

  /* The main function that implements QuickSort
  		arr[] --> Array to be sorted,
  		low --> Starting index,
  		high --> Ending index
  */
  public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {

      // pi is partitioning index, arr[p]
      // is now at right place
      int pi = partition(arr, low, high);

      // Separately sort elements before
      // partition and after partition
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  // Function to print an array
  public static void printArray(int[] arr, int size) {
    for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");

    System.out.println();
  }

  public static int[] sort(int[] arrIn) {

    int n = arrIn.length;

    int[] arr = new int[n];
    System.arraycopy(arrIn, 0, arr, 0, n);

    quickSort(arr, 0, n - 1);
    System.out.println("Sorted array: ");
    printArray(arr, n);
    
    return arr;
    
  }
  
  // Driver Code
  public static void main(String[]args) {
    int[] arr = {10, 7, 8, 9, 1, 5,3, 8,4,9,2,1,2,6,4,5,5,8,7,9};
    int n = arr.length;

    quickSort(arr, 0, n - 1);
    System.out.println("Sorted array: ");
    printArray(arr, n);
  }
}

// This code is contributed by Ayush Choudhary

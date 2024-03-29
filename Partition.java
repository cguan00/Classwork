public class Partition {
    /*Modify the array such that:
   *1. Only the indices from start to end inclusive are considered in range
   *2. A random index from start to end inclusive is chosen, the corresponding
   *   element is designated the pivot element.
   *3. all elements in range that are smaller than the pivot element are placed before the pivot element.
   *4. all elements in range that are larger than the pivot element are placed after the pivot element.
   *@return the index of the final position of the pivot element.
   */
    public static int partition(int[] data, int start, int end) {
      int pivotIndex = (int) (Math.random()*(end - start) + start);
      int pivot = data[pivotIndex];
      int low = start + 1;
      int high = end;
      data[pivotIndex] = data[0];//swap pivot and index
      data[0] = pivot;//swap pivot and index
      while(low <= high){//while still within bounds
        if(data[low] > pivot){//if less than the pivot
          swap(data, low, high);
          high--;
        }else{
          low++;//start moves over by one
        }
      }
      swap(data, start, high);
      return high;
   }

    public static void swap(int[] data, int start, int end) {
        int temp = data[end];
        data[end] = data[start];
        data[start] = temp;
    }
}


public class SelectionSort {

    /**
     * Sorts the first n objects in an array into ascending order.
     * This initial method is a wrapper for the actual selectionSort method.
     *
     * @param arr An array of Comparable objects.
     * @param n   An integer > 0.
     */
    public static <T extends Comparable<? super T>>
    void selectionSort(T[] arr, int n) {
        // Invoke the selectionSort algorithm:
        selectionSort(arr, 0, n - 1);
    }

    /**
     * Sorts the first n objects in an array into ascending order.
     *
     * @param arr   An array of Comparable objects.
     * @param first An integer >= 0.
     * @param last  An integer > first and < arr.length.
     */
    private static <T extends Comparable<? super T>>
    void selectionSort(T[] arr, int first, int last) {
        int count = 0;
        long memory;
        //find memory usage using Runtime util
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        //Loop through the array, obtaining the index of the smallest item and swapping
        //the current item with the smallest item:
        for (int index = first; index < last; index++) {
            int indexOfNextSmallest = getIndexOfSmallest(arr, index, last);
            swap(arr, index, indexOfNextSmallest);
            count++;
        }
        memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Total memory used: " + (memory / 1024L) + " kilobytes.");
        System.out.println("Number of iterations: " + count);
    }

    /**
     * Private method to finds the index of the smallest value in an array a.
     *
     * @param arr   An array of Comparable objects.
     * @param first An integer >= 0 and < arr.length that is the index of the first
     *              array entry to consider.
     * @param last  An integer >= 0 and < arr.length that is the index of the last
     *              array entry to consider.
     * @return The index of the smallest value among
     */
    private static <T extends Comparable<? super T>>
    int getIndexOfSmallest(T[] arr, int first, int last) {

        // Set the current smallest value:
        T minVal = arr[first];

        // Set the index of the current smallest value:
        int indexMin = first;

        //Loop through the remainder of the array:
        for (int index = first + 1; index <= last; index++) {
            // Compare the value at arr[index] with the current smallest value.
            if (arr[index].compareTo(minVal) < 0) {
                minVal = arr[index];
                indexMin = index;
            }
        }
        return indexMin;
    }

    /**
     * Method to swap the array entries arr[i] and arr[j].
     *
     * @param arr  An array of objects.
     * @param from An integer >= 0 and < arr.length.
     * @param to   An integer >= 0 and < arr.length.
     */
    private static <T>
    void swap(T[] arr, int from, int to) {
        T temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}


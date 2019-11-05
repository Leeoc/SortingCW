/**
 * CW1 COM498.
 * John Lee O'Connell
 * B00757542
 */

public class ShellSort {

    /** Sorts the first n objects in an array into ascending order.
     * This initial method is a wrapper for the actual shellSort method.
     * @param arr An array of Comparable objects.
     * @param n An integer > 0.
     */
    public static <T extends Comparable<? super T>>
    void shellSort(T[] arr, int n)
    {
        // Invoke the shellSort algorithm:
        shellSort(arr, 0, n-1);
    }


    /** Sorts the first n objects in an array into ascending order.
     * Use incremental insertion sort with different increments to
     * sort a range of values in the array.
     * @param arr An array of Comparable objects.
     * @param first An integer >= 0.
     * @param last An integer > first and < arr.length.
     */
    private static <T extends Comparable<? super T>>
    void shellSort(T[] arr, int first, int last) {

        // Size of the array (number of array entries):
        int n = last - first + 1;
        int count = 2;

        // create the interval for sub arrays to be created.
        int interval = n/2;
        long memory;

        //find memory usage using Runtime util
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();


        // Perform the interval-based insertion sort:
        while (interval > 0) {

            for (int begin = first; begin < first + interval; begin++) {
                count += incrementalInsertionSort(arr, first,last, interval);
                count++;
            }
            interval = interval/2;
            count++;
        }
        //calculate the memory used my the algorithm
        memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Total memory used: " + (memory / 1024L) + " kilobytes.");
        System.out.println("Number of operations: " + count);
    }


    /** Sorts equally spaced entries of an array into ascending order.
     @param arr An array of Comparable objects.
     @param first The integer index of the first array entry to
     consider; first >= 0 and < arr.length.
     @param last The integer index of the last array entry to
     consider; last >= first and < arr.length.
     @param interval the difference between the indices of the
     entries to sort.
     */
    private static <T extends Comparable<? super T>>
    int incrementalInsertionSort(T[] arr, int first, int last, int interval) {
        int unsorted, index;
        int count = 0;  // counts operations

        //Loop through the array, insert each unsorted item in order:
        for (unsorted = first + interval; unsorted <= last; unsorted = unsorted + interval) {
            // Get the next item in the unsorted array to be inserted:
            T nextToInsert = arr[unsorted];
            count++;
            // Set the index to the first entry in the unsorted part of the array (unsorted - interval):
            index = unsorted - interval;

            // Insert the entry into the appropriate position in the array.
            // Shift (make room), if necessary, in the sorted portion of the array for the entry.

            while ((index >= first) && (nextToInsert.compareTo(arr[index]) == -1)){
                // Shift (make room) to the right of the current index + interval for the current item:
                arr[index + interval] = arr[index];
                index = index - interval;
                count++;    // counts operations
            }

            // Insert the entry into the array:
            arr[index + interval] = nextToInsert;
            count++;
        }
        return count;
    }

}

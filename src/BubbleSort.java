/**
 * CW1 COM498.
 * John Lee O'Connell
 * B00757542
 */

public class BubbleSort {

    /** Sorts the first n objects in an array into ascending order.
     * This initial method is a wrapper for the actual BubbleSort method.
     * @param arr An array of Comparable objects.
     * @param length An integer > 0.
     */
    public static <T extends Comparable<? super T>>
    void bubbleSort(T[] arr, int length)
    {
        // Invoke the bubbleSort algorithm:
        bubbleSort(arr, 0,length-1);
    }


    /** Sorts the first n objects in an array into ascending order.
     * Using bubble sort technique.
     * sort a range of values in the array.
     * @param arr An array of Comparable objects.
     * @param first An integer >= 0.
     * @param last An integer > first and < arr.length.
     */
    private static <T extends Comparable<? super T>>
    void bubbleSort(T[] arr, int first, int last) {
        first ++;
        last ++;

        //count the iterations
        int count = 0;

        //find memory usage using Runtime util
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        //loop until the array is fully sorted
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                count++;
                if (arr[(j + 1)].compareTo(arr[j]) > 0) {
                    count++;
                    T temp = arr[(j + 1)];
                    arr[(j + 1)] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Total memory used: " + (memory / 1024L) + " kilobytes.");
        System.out.println("Number of iterations: " + count);
    }
}

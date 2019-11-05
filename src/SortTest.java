/**
 * CW1 COM498.
 * John Lee O'Connell
 * B00757542
 */

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SortTest {

    public static void main(String args[]){

        // Init variables
        int arraySize;
        long startTimeShell, startTimeBubble, startTimeSelect, endTimeShell, endTimeBubble, endTimeSelect,
                durationShell, durationBubble, durationSelect;
        Integer testArray[];

        // Start testing:
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Sort Test Started:");
        System.out.println("Please enter an integer for the size of the array?");

        // Read in an integer value for the array size:
        arraySize = getInt("  The integer value should be greater than or equal to 1: ");

        // Generate an array of data containing randomly generated integers:
        testArray = ArrayMaker.generateRandomArray(arraySize);
        Integer[] dataBubbleSort = ArrayMaker.duplicateArray(testArray);
        Integer[] dataShellSort = ArrayMaker.duplicateArray(testArray);
        Integer[] dataSelectSort = ArrayMaker.duplicateArray(testArray);

        // Generate an array of data containing randomly generated Strings:
        String[] testStringArray = ArrayMaker.generateRandomStringArray(arraySize,6);
        String[] dataStringSelectSort = ArrayMaker.duplicateArrayString(testStringArray);
        String[] dataStringShellSort = ArrayMaker.duplicateArrayString(testStringArray);
        String[] dataStringBubbleSort = ArrayMaker.duplicateArrayString(testStringArray);

        // Generate an array of data containing randomly generated floats.
        Float[] testFloatArray = ArrayMaker.generateRandomFloatArray(arraySize);
        Float[] dataFloatSelectSort = ArrayMaker.duplicateArrayFloat(testFloatArray);
        Float[] dataFloatShellSort = ArrayMaker.duplicateArrayFloat(testFloatArray);
        Float[] dataFloatBubbleSort = ArrayMaker.duplicateArrayFloat(testFloatArray);


        // Test Integer Array:
        System.out.println("The unsorted Integer array is: ");
        ArrayMaker.displayArrayContent(testArray);
        System.out.println("-------------------------------------------------------------------------------");

        // Test shell sort, and get metrics:
        System.out.println();
        System.out.println("Sorting using Shell Sort: ");
        startTimeShell = System.nanoTime();
        ShellSort.shellSort(dataShellSort, arraySize);
        endTimeShell = System.nanoTime();
        durationShell = TimeUnit.NANOSECONDS.toMillis(endTimeShell - startTimeShell); // time to execute in milliseconds
        System.out.println("\nThe Shell sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataShellSort);
        System.out.println("Time to complete: " + durationShell + " milliseconds.");
        System.out.println("-------------------------------------------------------------------------------");

        // Test Bubble sort, and get metrics:
        System.out.println();
        System.out.println("Sorting using Bubble Sort: ");
        startTimeBubble = System.nanoTime();
        BubbleSort.bubbleSort(dataBubbleSort,arraySize);
        endTimeBubble = System.nanoTime();
        durationBubble = TimeUnit.NANOSECONDS.toMillis(endTimeBubble - startTimeBubble); // time to execute in milliseconds
        System.out.println("\nThe Bubble sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataShellSort);
        System.out.println("Time to complete: " + durationBubble + " milliseconds.");
        System.out.println("-------------------------------------------------------------------------------");

        // Test Bubble sort, and get metrics:
        System.out.println();
        System.out.println("Sorting using Selection Sort: ");
        startTimeSelect = System.nanoTime();
        BubbleSort.bubbleSort(dataSelectSort,arraySize);
        endTimeSelect= System.nanoTime();
        durationSelect = TimeUnit.NANOSECONDS.toMillis(endTimeSelect - startTimeSelect); // time to execute in milliseconds
        System.out.println("\nThe Selection sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataSelectSort);
        System.out.println("Time to complete: " + durationSelect + " milliseconds.");
        System.out.println("-------------------------------------------------------------------------------");

        // Test String arrays:
        System.out.println("Unsorted String Array:");
        ArrayMaker.displayArrayContent(testStringArray);
        System.out.println("-------------------------------------------------------------------------------");

        // Test Bubble sort (String) and get metrics:
        System.out.println();
        System.out.println("Sorting using Bubble Sort: ");
        startTimeSelect = System.nanoTime();
        BubbleSort.bubbleSort(dataStringBubbleSort,arraySize);
        endTimeSelect= System.nanoTime();
        durationSelect = TimeUnit.NANOSECONDS.toMillis(endTimeSelect - startTimeSelect); // time to execute in milliseconds
        System.out.println("\nThe Bubble sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataStringBubbleSort);
        System.out.println("Time to complete: " + durationSelect + " milliseconds.");
        System.out.println("-------------------------------------------------------------------------------");

        // Test Selection sort (String) and get metrics
        System.out.println();
        System.out.println("Sorting using Selection Sort: ");
        startTimeSelect = System.nanoTime();
        SelectionSort.selectionSort(dataStringSelectSort,arraySize);
        endTimeSelect= System.nanoTime();
        durationSelect = TimeUnit.NANOSECONDS.toMillis(endTimeSelect - startTimeSelect); // time to execute in milliseconds
        System.out.println("\nThe Selection sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataStringSelectSort);
        System.out.println("Time to complete: " + durationSelect + " milliseconds.");
        System.out.println("-------------------------------------------------------------------------------");

        // Test Shell sort (String) and get metrics:
        System.out.println();
        System.out.println("Sorting using Shell Sort: ");
        startTimeSelect = System.nanoTime();
        ShellSort.shellSort(dataStringShellSort, arraySize);
        endTimeSelect= System.nanoTime();
        durationSelect = TimeUnit.NANOSECONDS.toMillis(endTimeSelect - startTimeSelect); // time to execute in miliseconds
        System.out.println("\nThe Shell sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataStringShellSort);
        System.out.println("Time to complete: " + durationSelect + " milliseconds.");
        System.out.println("-------------------------------------------------------------------------------");

        // Test float arrays:
        System.out.println("The unsorted Float array is: ");
        ArrayMaker.displayArrayContent(testFloatArray);
        System.out.println("-------------------------------------------------------------------------------");

        // Test Bubble sort (Float) and get metrics:
        System.out.println();
        System.out.println("Sorting using Bubble Sort: ");
        startTimeSelect = System.nanoTime();
        BubbleSort.bubbleSort(dataFloatBubbleSort,arraySize);
        endTimeSelect= System.nanoTime();
        durationSelect = TimeUnit.NANOSECONDS.toMillis(endTimeSelect - startTimeSelect); // time to execute in milliseconds
        System.out.println("\nThe Selection sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataFloatBubbleSort);
        System.out.println("Time to complete: " + durationSelect + " milliseconds.");
        System.out.println("-------------------------------------------------------------------------------");

        // Test Selection sort (Float) and get metrics:
        System.out.println();
        System.out.println("Sorting using Selection Sort: ");
        startTimeSelect = System.nanoTime();
        SelectionSort.selectionSort(dataFloatSelectSort,arraySize);
        endTimeSelect= System.nanoTime();
        durationSelect = TimeUnit.NANOSECONDS.toMillis(endTimeSelect - startTimeSelect); // time to execute in milliseconds
        System.out.println("\nThe Selection sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataFloatSelectSort);
        System.out.println("Time to complete: " + durationSelect + " milliseconds.");
        System.out.println("-------------------------------------------------------------------------------");

        // Test Selection sort (Float) and get metrics:
        System.out.println();
        System.out.println("Sorting using Shell Sort: ");
        startTimeSelect = System.nanoTime();
        ShellSort.shellSort(dataFloatShellSort,arraySize);
        endTimeSelect= System.nanoTime();
        durationSelect = TimeUnit.NANOSECONDS.toMillis(endTimeSelect - startTimeSelect); // time to execute in milliseconds
        System.out.println("\nThe Shell sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataFloatShellSort);
        System.out.println("Time to complete: " + durationSelect + " milliseconds.");
        System.out.println("-------------------------------------------------------------------------------");

    }


    /**
     * Private method to get an integer value from user input
     * @return An integer.
     */
    private static int getInt(String rangePrompt) {

        Scanner input;

        // Integer with a default value of 10:
        int nResult = 10;

        // Wrap attempt to read from input in a try-catch block
        // so as to handle any exceptions that may arise:
        try {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            nResult = input.nextInt();
        } catch(NumberFormatException e) {
            System.out.println("Warning: could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Warning: will use 10 as the default value");
        } catch(Exception e) {
            System.out.println("Warning: there was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Warning: will use 10 as the default value");
        }
        return nResult;
    }

}

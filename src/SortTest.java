import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SortTest {

    public static void main(String args[]){

        //init varibles
        int arraySize;
        long startTimeShell, startTimeBubble, startTimeSelect, endTimeShell, endTimeBubble, endTimeSelect,
                durationShell, durationBubble, durationSelect;

        Integer testArray[];

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
        System.out.println("The unsorted array is: ");
        ArrayMaker.displayArrayContent(testArray);


        // Test shell sort, and get metrics
        System.out.println();
        System.out.println("Sorting using Shell Sort: ");
        startTimeShell = System.nanoTime();
        ShellSort.shellSort(dataShellSort, arraySize);
        endTimeShell = System.nanoTime();
        durationShell = TimeUnit.NANOSECONDS.toMillis(endTimeShell - startTimeShell); // time to execute in miliseconds
        System.out.println("\nThe Shell sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataShellSort);
        System.out.println("Time to complete: " + durationShell + " miliseconds.");

        // Test Bubble sort, and get metrics
        System.out.println();
        System.out.println("Sorting using Bubble Sort: ");
        startTimeBubble = System.nanoTime();
        BubbleSort.bubbleSort(dataBubbleSort,arraySize);
        endTimeBubble = System.nanoTime();
        durationBubble = TimeUnit.NANOSECONDS.toMillis(endTimeBubble - startTimeBubble); // time to execute in miliseconds
        System.out.println("\nThe Bubble sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataShellSort);
        System.out.println("Time to complete: " + durationBubble + " miliseconds.");

        // Test Bubble sort, and get metrics
        System.out.println();
        System.out.println("Sorting using Selection Sort: ");
        startTimeSelect = System.nanoTime();
        BubbleSort.bubbleSort(dataSelectSort,arraySize);
        endTimeSelect= System.nanoTime();
        durationSelect = TimeUnit.NANOSECONDS.toMillis(endTimeSelect - startTimeSelect); // time to execute in miliseconds
        System.out.println("\nThe Selection sort, sorted array is: ");
        ArrayMaker.displayArrayContent(dataSelectSort);
        System.out.println("Time to complete: " + durationSelect + " miliseconds.");


        // test with strings
        int test = 10;
        String[] stringTest = ArrayMaker.generateRandomStringArray(10, 3);
        String [] charTest = ArrayMaker.generateRandomCharArray(10);
        ArrayMaker.displayArrayContent(stringTest);
        ArrayMaker.displayArrayContent(charTest);
        BubbleSort.bubbleSort(stringTest,test);
        BubbleSort.bubbleSort(charTest,test);
        ArrayMaker.displayArrayContent(charTest);
        ArrayMaker.displayArrayContent(stringTest);
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

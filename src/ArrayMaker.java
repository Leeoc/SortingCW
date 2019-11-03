import java.util.Random;

/**
 * Lab Session C (based on source code by Charles Hoot)
 * ArrayUtil Class used to provide some utility methods
 * for the array sorting algorithms
 */

public class ArrayMaker {

    /**
     * Method to display the contents of an array of objects as a String
     * @param  data The array to display.
     */
    public static void displayArrayContent(Object [] data)
    {
        System.out.println(getString(data));
    }

    /**
     * Method to return the contents of an array of objects as a String
     * A displayable representation of an array of Objects where toString is
     * applied on each object in the array
     * @param   data    The array to display.
     * @return  A printable string.
     */
    private static String getString(Object [] data)
    {
        String resultString = new String("[ ");

        for(int i = 0; i< data.length; i++) {
            resultString = resultString + data[i].toString() + " ";
        }
        resultString = resultString + "]";

        return resultString;
    }

    /**
     * Method to return a random string of length size.
     * @param   size    The length each string will be.
     * @return  A random string.
     */
    private static String generateRandomString(int size){
        int lowerLimit = 97;
        int upperLimit = 122;

        Random rand = new Random();
        StringBuffer buffer = new StringBuffer(size);

        for(int i = 0; i < size; i++){
            int nextRandChar = lowerLimit + (int)(rand.nextFloat() * (upperLimit - lowerLimit));
            buffer.append((char)nextRandChar);
        }
        return buffer.toString();
    }

    /**
     * Method to return a random float between 0 and maxVal.
     * @return  A random Float.
     */
    private static Float generateRandomFloat(){
        Random rand = new Random();
        return rand.nextFloat();
    }

    /**
     * Method to generate an array of random integer values.  The values will be between 0 and size.
     * @param   size    The size of the array to generate.
     * @return  The array of integers.
     */
    public static Integer[] generateRandomArray(int size)
    {
        Integer resultArray[] = new Integer[size];
        int value;
        Random generator = new Random();

        for(int i = 0; i< size; i++) {
            value = generator.nextInt(size);
            resultArray[i] = value;
        }
        return resultArray;
    }

    /**
     * Method to duplicate the content of an array.
     * @param  orig The source array to copy.
     * @return The array containing a copy of the values in the source array.
     */
    public static Integer[] duplicateArray(Object [] orig) {
        int size = orig.length;
        Integer resultArray[] = new Integer[size];

        for (int i = 0; i < size; i++) {
            resultArray[i] = (Integer) orig[i];
        }
        return resultArray;
    }

    /**
     * Method to create an array of strings.
     * @param  arrayLength The length of the array to be returned
     * @return The array of strings.
     */
    public static String[] generateRandomStringArray(int arrayLength, int stringLength){
        String[] strings = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            strings[i] = generateRandomString(stringLength);
        }
        return strings;
    }

    /**
     * Method to create an array of characters.
     * @param  arrayLength The length of the array to be returned
     * @return The array of characters.
     */
    public static String[] generateRandomCharArray(int arrayLength){
        String[] strings = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            strings[i] = generateRandomString(1);
        }
        return strings;
    }

    /**
     * Method to create an array of random floats.
     * @param  arrayLength The length of the array to be returned
     * @return The array of floats.
     */
    public static Float[] generateRandomFloatArray(int arrayLength){
        Float[] floats = new Float[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            floats[i] = generateRandomFloat();
        }
        return floats;
    }

}

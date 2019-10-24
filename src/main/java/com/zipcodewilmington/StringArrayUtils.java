package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */
    public static boolean contains(String[] array, String value) {
        boolean containsValue = false;
        for (String s : array) {
            if (s.contains(value)) {
                containsValue = true;
            }
        }
        return containsValue;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */
    public static String[] reverse(String[] array) {
        ArrayList<String> strArrayList = new ArrayList<String>(Arrays.asList(array));
        Collections.reverse(strArrayList);
        String[] newReversedArray = strArrayList.toArray(new String[strArrayList.size()]);
        return newReversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = reverse(array);
        if (Arrays.equals(array, reversedArray)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        // create a String array with letters from alphabet
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};
        // combine elements in array into one string
        String arrayJoin = String.join("", array).toLowerCase();
        int countLetters = 0;
        //write for loop to iterate through string array of alphabet letters
        for (int i = 0; i < alphabet.length; i++) {
            // check if element of alphabet array is contained in array
            if (arrayJoin.contains(alphabet[i])) {
                countLetters = countLetters + 1;
            }
        }
        return countLetters == 26;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOfOccurrences = 0;
        ArrayList<String> newArrayList = new ArrayList<String>(Arrays.asList(array));
        for (String strArr : newArrayList) {
            if (strArr.equals(value)) {
                numOfOccurrences = numOfOccurrences + 1;
            }
        }
        return numOfOccurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArrayList = new ArrayList<String>(Arrays.asList(array));
        newArrayList.remove(valueToRemove);
        String[] valueRemovedArray = newArrayList.toArray(new String[newArrayList.size()]);
        return valueRemovedArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArrayList = new ArrayList<String>(Arrays.asList(array));
        for (int i = 0; i < newArrayList.size() - 1; i++) {
            if (newArrayList.get(i).equals(newArrayList.get(i + 1))) {
                newArrayList.remove(i);
            }
        }
        for (int i = 0; i < newArrayList.size() - 1; i++) {
            if (newArrayList.get(i).equals(newArrayList.get(i + 1))) {
                newArrayList.remove(i);
            }
        }
        return newArrayList.toArray(new String[newArrayList.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String newString = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i].equals(array[i-1])) {
                newString = newString + array[i-1];

            } else {
                newString = newString + " " + array[i];
            }
        }
        return newString.split(" ");
    }
}

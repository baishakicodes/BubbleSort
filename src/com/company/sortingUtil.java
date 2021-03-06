package com.company;

public class sortingUtil {
    //swap method for integers
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //swap method for strings
    public static void swap(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //swap method for doubles
    public static void swap(double[] arr, int a, int b) {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //creates an random array, length count, and fills with numbers from 0 and 10000
    public static int[] randIntArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10001);
        }
        return arr;
    }

    //creates a random array of doubles
    public static double[] randDoubleArr(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (double) (Math.random() * 101);
        }
        return arr;
    }

    //checks whether the array is sorted or not.
    //this is only for arrays that have integer values in it
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //checks whether an array with doubles are sorted
    public static boolean isSorted(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //checks whether the array is sorted by comparing the sum of the unsorted array and the sum of the sorted array.
    //If the sums are the same that means that nothing happened to the elements in the original array(unsorted array)
    //well for the most part it means nothing happened
    public static boolean checkSum(int[] before, int[] after) {
        int beforeSum = 0;
        int afterSum = 0;
        for (int i = 0; i < before.length; i++) {
            beforeSum = beforeSum + before[i];
        }
        for (int j = 0; j < after.length; j++) {
            afterSum = afterSum + after[j];
        }
        return (beforeSum == afterSum);
    }

    //checks the sum of the original array and the sorted array
    public static boolean checkSum(double[] before, double[] after) {
        double beforeSum = 0;
        for (int i = 0; i < before.length; i++) {
            beforeSum = beforeSum + before[i];
        }
        double afterSum = 0;
        for (int j = 0; j < after.length; j++) {
            afterSum = afterSum + after[j];
        }
        return (beforeSum == afterSum);
    }

    //method to create copy of an int Array
    public static int[] copyOfArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    //method to create copy of a string array
    public static String[] copyOfArray(String[] arr) {
        String[] copy = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    //method to create copy of a double array
    public static double[] copyOfArray(double[] arr) {
        double[] copy = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    //method to generate an array of random strings
    public String[] randomStringArr(int num, int length) {
        String[] arr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char) ((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
    //two different methods for binary search

    //this method uses a for loop
    public static int binarySearch(int[] elements, int target) {
        inPlaceSorts.bubbleSortII(elements);
        int max =elements.length-1;
        int min = 0;
        for (int i = (min+max)/2; min<=max;i=(min+max)/2 ) {
            if (elements[i] == target) {
                return i;
            } else if (elements[i] > target) {
                max = i - 1;
            } else if (elements[i] < target) {
                min = i + 1;
            }
        }
        return -1;
    }
    //this method uses a while loop
    public static int binarySearch2(int[] elements, int target){
        inPlaceSorts.bubbleSortII(elements);
        int max =elements.length-1;
        int min = 0;
        int guess = (min+max)/2;
        boolean checker = true;
        while(min<=max){
            if(elements[guess]==target){
                return guess;
            }
            else if(elements[guess]>target){
                max = guess-1;
                guess = (min+max)/2;
            }
            else if(elements[guess]<target){
                min=guess+1;
                guess=(min+max)/2;
            }
        }
        return -1;
    }
    
}


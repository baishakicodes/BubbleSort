package com.company;

public class sortingUtil {
    //swap method for integers
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
    //swap method for strings
    public static void swap(String[] arr, int a, int b){
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
    //swap method for doubles
    public static void swap(double[] arr, int a, int b){
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
    //creates an random array, length count, and fills with numbers from 0 and 10000
    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*10001);
        }
        return arr;
    }
    //checks whether the array is sorted or not.
    //this is only for arrays that have integer values in it
    public static boolean isSorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isSorted = true;
            } else {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }
    //checks whether the array is sorted by comparing the sum of the unsorted array and the sum of the sorted array.
    //If the sums are the same that means that nothing happened to the elements in the original array(unsorted array)
    //well for the most part it means nothing happened
    public static boolean checkSum(int[] before, int[] after){
        int beforeSum=0;
        int afterSum=0;
        for(int i=0;i<before.length; i++){
            beforeSum = beforeSum + before[i];
        }
        for(int j=0; j<after.length; j++){
            afterSum= afterSum+after[j];
        }
        if(beforeSum == afterSum){
            return true;
        }
        return false;
    }
}

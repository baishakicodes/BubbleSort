package com.company;

public class sortingUtil {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }
    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*10001);
        }
        return arr;
    }
}

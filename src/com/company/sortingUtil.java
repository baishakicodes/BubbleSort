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
    public static boolean isSorted(int[] arr){
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                isSorted=true;
            }
            else{
                isSorted = false;
            }
        }
        return isSorted;
    }
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

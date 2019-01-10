package com.company;

public class bubbleSort {

    //bubble sort for an array of integers
    public static void bubbleSort(int[] arr){
        boolean swap = true;
        while(swap){
            //change the variable swap to false because nothing has been swapped yet
            //also we want to continue swapping until the whole array is ordered so we don't want the variable to be true prematurely
            swap = false;
            for(int i =0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    sortingUtil.swap(arr, i, i+1);
                    //int temp = arr[i];
                    //arr[i]=arr[i+1];
                    //arr[i+1]=temp;
                    //swapping has taken place so swap is true
                    swap = true;
                }
            }

        }

    }
    //Another way to write the method bubble sort for integers
    public static void bubbleSortII(int[] arr){
        //*the first for loop is for the out iteration
        for(int i =0; i<arr.length; i++){
        //*the second for loop is for the actual swapping in the first outer iteration
        //*the precondition j<arr.length-1 is so that we don't keep on going to the end of the array that is already sorted
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //selection sort for integers
    public static void selectionSort(int[] arr) {
        //create values minVal and minIndex
        int minVal, minIndex;
        //the outer loop
        for(int i=0; i<arr.length; i++){
            minVal=arr[i];
            minIndex=i;
            //the inner loop
            for(int j=i; j<arr.length; j++){
                //finds the minimum value in the array
                if(arr[j]<minVal){
                    minVal=arr[j];
                    minIndex=j;
                }
            }
            //this is where the swapping happens after we have found the min val
            if(arr[i]>minVal){
                sortingUtil.swap(arr, i, minIndex);
            }

            
        }

    }
    //bubbleSort for strings
    public static void bubbleSort(String[] arr){
        //*another method for bubble sort

        //*the first for loop is for the out iteration
        for(int i =0; i<arr.length; i++){
            //*the second for loop is for the actual swapping in the first outer iteration
            //*the precondition j<arr.length-1 is so that we don't keep on going to the end of the array that is already sorted
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1].compareTo(arr[j])>0) {
                    sortingUtil.swap(arr, j-1,j);
                    //String temp = arr[j - 1];
                    //arr[j - 1] = arr[j];
                    //arr[j] = temp;
                }
            }
        }
    }
    //selection sort for doubles
    public static void selectionSort(double[] arr){
        //create values minVal and minIndex
        double minVal;
        int minIndex;
        //the outer loop
        for(int i=0; i<arr.length; i++){
            minVal=arr[i];
            minIndex=i;
            //the inner loop
            for(int j=i; j<arr.length; j++){
                //finds the minimum value in the array
                if(arr[j]<minVal){
                    minVal=arr[j];
                    minIndex=j;
                }
            }
            //this is where the swapping happens after we have found the min val
            if(arr[i]>minVal){
                sortingUtil.swap(arr, i, minIndex);
            }


        }
    }
    public static void insertionSort(int[] arr){
        int origIndex;
        for(int i=1;i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j-1]<arr[j]){
                    sortingUtil.swap(arr, j-1, j);
                }
            }
        }
    }
}

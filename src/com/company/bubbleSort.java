package com.company;

public class bubbleSort {
    public static void bubbleSort(int[] arr){
        boolean swap = true;
        while(swap){
            //change the variable swap to false because nothing has been swapped yet
            //also we want to continue swapping until the whole array is ordered so we don't want the variable to be true prematurely
            swap = false;
            for(int i =0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    //swapping has taken place so swap is true
                    swap = true;
                }
            }

        }

        //*another method for bubble sort

        //*the first for loop is for the out iteration
        //for(int i =0; i<arr.length; i++){
            //*the second for loop is for the actual swapping in the first outer iteration
            //*the precondition j<arr.length-1 is so that we don't keep on going to the end of the array that is already sorted
            //for(int j=1; j<arr.length-i; j++){
                //if(arr[j-1]>arr[j]) {
                    //int temp = arr[j - 1];
                    //arr[j - 1] = arr[j];
                    //arr[j] = temp;
                //}
            //}
        //}

    }

}

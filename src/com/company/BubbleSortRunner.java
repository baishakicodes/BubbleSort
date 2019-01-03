package com.company;


public class BubbleSortRunner {

    public static void main(String[] args) {
	// write your code here
        int[] testArr= {3,1,8,10,4,6,5,2,0,7,9};

        //print out the unsorted array
        System.out.print("Before: ");
        for(int num:testArr){
            System.out.print(num+" ");
        }
        System.out.println();
        //sorting takes place here
        bubbleSort.bubbleSort(testArr);

        //Print out new sorted array
        System.out.print("After: ");
        for(int num:testArr){
            System.out.print(num+" ");
        }
        System.out.println();

        long time = System.nanoTime();
        //utils.bubbleSort(ran)
    }
}

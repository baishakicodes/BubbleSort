package com.company;


public class BubbleSortRunner {

    public static void main(String[] args) {
	// write your code here
        int[] testArr= {30,35,42,66,78,90,120,151,21,1,1111,49};

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
    }
}

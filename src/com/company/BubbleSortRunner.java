package com.company;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class BubbleSortRunner {

    public static void main(String[] args) {
	// write your code here
        int[] testArr= {8,6,7,5,3,0,9,10,1,2,4};

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

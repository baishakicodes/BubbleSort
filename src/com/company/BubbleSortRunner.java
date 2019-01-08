package com.company;


public class BubbleSortRunner {

    public static void main(String[] args) {
	// write your code here
        int[] testArr= {3,1,8,10,4,6,5,2,0,7,9};
        int[] copyOfTestArr = {3,1,8,10,4,6,5,2,0,7,9};
        int[] randArr = sortingUtil.randIntArr(6);

        //print out the unsorted array
        System.out.print("Before: ");
        for(int num: randArr){
            System.out.print(num+" ");
        }
        System.out.println();
        //sorting takes place here
        bubbleSort.selectionSort(randArr);

        //Print out new sorted array
        System.out.print("After: ");
        for(int num:randArr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Is the array sorted?" +sortingUtil.isSorted(randArr));
        System.out.println("CheckSum: "+sortingUtil.checkSum(copyOfTestArr, testArr));
       // System.out.println(sortingUtil.checkSum(randArr));

        long time = System.nanoTime();
        bubbleSort.bubbleSort(randArr);
        time = System.nanoTime()-time;
    }
}

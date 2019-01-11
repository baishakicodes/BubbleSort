package com.company;


public class SortRunner {

    public static void main(String[] args) {
	// write your code here
        int[] testArr= {3,1,8,10,4,6,5,2,0,7,9};
        int[] copyOfTestArr = {3,1,8,10,4,6,5,2,0,7,9};
        int[] randArr = sortingUtil.randIntArr(6);
        String[] arrOfStrings={"b","a","c","e","d"};
        double[] doubleArr = {2.6,1.1,.3,2.2,5.9,7.0};

        //print out the unsorted array
        System.out.println("Is the array sorted? " +sortingUtil.isSorted(testArr));
        System.out.print("Before: ");
        for(int num: testArr){
            System.out.print(num+" ");
        }
        System.out.println();
        //sorting takes place here
        inPlaceSorts.insertionSort(testArr);

        //Print out new sorted array
        System.out.print("After: ");
        for(int num: testArr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Is the array sorted? " +sortingUtil.isSorted(testArr));
        System.out.println("CheckSum: "+sortingUtil.checkSum(copyOfTestArr, testArr));

        //long time = System.nanoTime();
        //inPlaceSorts.bubbleSort(testArr);
        //time = System.nanoTime()-time;
        //System.out.println("Time taken: " +time);
    }
}

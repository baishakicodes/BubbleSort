package com.company;


public class SortRunner {

    public static void main(String[] args) {
	// write your code here
        int[] testArr= {3,1,8,10,4,6,5,2,0,7,9};
        int[] copyOfTestArr = {3,1,8,10,4,6,5,2,0,7,9};
        int[] randArr = sortingUtil.randIntArr(6);
        String[] arrOfStrings={"b","a","c","e","d"};
        double[] doubleArr = {2.6,1.1,.3,2.2,5.9,7.0};
        int[] timeRandArr = sortingUtil.randIntArr(10000);
        int[] copytimeRandArr = sortingUtil.copyOfArray(timeRandArr);
        long timeStart = 0;
        long timeStop = 0;

        //print out the unsorted array
        System.out.println("Is the array sorted? " +sortingUtil.isSorted(testArr));
        System.out.print("Before: ");
        for(int num: copytimeRandArr){
            System.out.print(num+" ");
        }
        System.out.println();

        //sorting using bubbleSort()
        System.out.println("Sorting using bubbleSort()");
        timeStart = System.nanoTime();
        inPlaceSorts.bubbleSort(copytimeRandArr);
        timeStop = System.nanoTime()-timeStart;
        System.out.println("Time for bubbleSort() :"+timeStop+" nanoseconds");

        //sorting using selectionSort()
        //System.out.println("sorting using selectionSort()");
        //timeStart = System.nanoTime();
        //inPlaceSorts.selectionSort(sortingUtil.copyOfArray(timeRandArr));

        //Print out new sorted array
        System.out.print("After: ");
        for(int num: copytimeRandArr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Is the array sorted? " +sortingUtil.isSorted(testArr));
        System.out.println("CheckSum: "+sortingUtil.checkSum(copyOfTestArr, testArr));

    }
}

package com.company;


public class SortRunner {

    public static void main(String[] args) {
	// write your code here
        int[] intTestArr = {3,6,10,5,2,1,4,7,0,8,9};
        int[] copyInt = sortingUtil.copyOfArray(intTestArr);
        double[] doubleTestArr = {3.6,2.1,3.3,1.5,0.1};
        double[] copyDouble = sortingUtil.copyOfArray(doubleTestArr);
        String[] stringTestArr = {"This", "is","a","test","string","array"};
        String[] copyString = sortingUtil.copyOfArray(stringTestArr);

        //initiating long time variables for each of the arrays
        long inttimeStart = 0;
        long inttimeStop = 0;
        long doubletimeStart = 0;
        long doubletimeStop = 0;
        long stringtimeStart = 0;
        long stringtimeStop = 0;


        //print out the unsorted int array
        System.out.println("Is the integer array sorted? " +sortingUtil.isSorted(copyInt));
        System.out.print("Before: ");
        for(int num: copyInt){
            System.out.print(num+" ");
        }
        System.out.println("\n");

        //print out unsorted double array
        System.out.println("Is the double array sorted? " +sortingUtil.isSorted(copyDouble));
        System.out.print("Before: ");
        for(double num: copyDouble){
            System.out.print(num+" ");
        }
        System.out.println("\n");

        //print out unsorted string array
        System.out.println("Below is the unsorted string array.");
        System.out.print("Before: ");
        for(String num: copyString){
            System.out.print(num+" ");
        }
        System.out.println();

        //sorting and time taken using Insertion sort
        System.out.println("\n");
        System.out.println("Sorting using insertionSort()");
        inttimeStart = System.nanoTime();
        inPlaceSorts.insertionSort(copyInt);
        inttimeStop = System.nanoTime()-inttimeStart;
        System.out.println("Time for insertionSort() :"+inttimeStop+" nanoseconds");

        //sorting using selectionSort()
        System.out.println("\n");
        System.out.println("sorting using selectionSort()");
        doubletimeStart = System.nanoTime();
        inPlaceSorts.selectionSort(copyDouble);
        doubletimeStop = System.nanoTime()-doubletimeStart;
        System.out.println("Time for selectionSort() :"+doubletimeStop+" nanoseconds");

        //soritng using bubbleSort
        System.out.println("\n");
        System.out.println("sorting using bubbleSort()");
        stringtimeStart = System.nanoTime();
        inPlaceSorts.bubbleSort(copyString);
        stringtimeStop = System.nanoTime()-stringtimeStart;
        System.out.println("Time for bubbleSort() :"+stringtimeStop+" nanoseconds");

        //Print out new int sorted array
        System.out.println("\n");
        System.out.println("The sorted integer array.");
        System.out.print("After: ");
        for(int num: copyInt){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Is the int array sorted? "+sortingUtil.isSorted(copyInt));
        System.out.println("Are the sums of the original int arr and sorted arr the same? "+sortingUtil.checkSum(intTestArr, copyInt));

        //Print out new double sorted array
        System.out.println("\n");
        System.out.println("The sorted double array.");
        System.out.print("After: ");
        for(double num: copyDouble){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Is the double array sorted? "+sortingUtil.isSorted(copyDouble));
        System.out.println("Are the sums of the original double arr and sorted arr the same? "+sortingUtil.checkSum(doubleTestArr,copyDouble));

        //Print out new String sorted array
        System.out.println("\n");
        System.out.println("The sorted String array.");
        System.out.print("After: ");
        for(String num: copyString){
            System.out.print(num+" ");
        }
        System.out.println();


    }
}

package com.learn.algorithm.sort;

public abstract class Sort {

    public synchronized int[] sortPrintArrayInfos(int... arr) {
        System.out.println("befor:");
        printArr(arr);
        int[] sortArr = sortPrintTimes(arr);
        System.out.println("after:");
        printArr(sortArr);
        return sortArr;
    }

    public synchronized int[] sortPrintTimes(int... arr) {
        long befor = System.currentTimeMillis();
        int[] sortArr = sort(arr);
        long after = System.currentTimeMillis();
        System.out.println("use time:" + (after - befor));
        return sortArr;
    }

    public abstract int[] sort(int... arr);

    public static void printArr(int... arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int lpoint, int rpoint) {
        int temp = arr[rpoint];
        arr[rpoint] = arr[lpoint];
        arr[lpoint] = temp;
    }
}

package com.learn.algorithm.sort.support;

import com.learn.algorithm.sort.Sort;

/**
 * @program: algorithmLearn
 * @Description: TODO
 * @Version: 1.0
 * @History: 1.Created by zan.kang on 2020/4/4 12:43.
 * 2.
 **/
public class SelectionSort extends Sort {
    @Override
    public int[] sort(int... arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            //找到最小下标
            minPos = findMinPos(arr, minPos, i);
            //移动最小数至当前下标
            swap(arr, i, minPos);
        }
        return arr;
    }

    /**
     * 从数组中找到最小数的下标
     *
     * @param arr    数组
     * @param minPos 当前最小下标
     * @param index  当前需要循环到的下标
     * @return
     */
    private int findMinPos(int[] arr, int minPos, int index) {
        for (int i = index + 1; i < arr.length; i++) {
            minPos = arr[i] < arr[minPos] ? i : minPos;
        }
        return minPos;
    }
}

package com.learn.algorithm.sort.support;

import com.learn.algorithm.sort.Sort;

/**
 * @program: algorithmLearn
 * @Description: TODO
 * @Version: 1.0
 * @History: 1.Created by zan.kang on 2020/4/4 15:00.
 * 2.
 **/
public class BubbleSort extends Sort {
    @Override
    public int[] sort(int... arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //依次将数组最大值往后移动
            if (!moveMaxByIndexRange(arr, arr.length - i - 1)) {
                //如果没有需要移动的最大值，则数组排序已经完成
                return arr;
            }
        }
        return arr;
    }


    /**
     * 1.顺序比较找到数组中在范围range内最大的值
     * 2.将最大值按顺序移动到range范围的最后
     *
     * @param arr   排序数组
     * @param range 要排序的范围
     */
    private boolean moveMaxByIndexRange(int[] arr, int range) {
        boolean isMove = false;
        for (int j = 0; j < range; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
                isMove = true;
            }
        }
        return isMove;
    }
}

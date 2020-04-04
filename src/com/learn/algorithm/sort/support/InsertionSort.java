package com.learn.algorithm.sort.support;

import com.learn.algorithm.sort.Sort;


/**
 * @program: algorithmLearn
 * @Description: TODO
 * @Version: 1.0
 * @History: 1.Created by zan.kang on 2020/4/4 22:52.
 * 2.
 **/
public class InsertionSort extends Sort {
    @Override
    public int[] sort(int... arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
            }
        }
        return arr;
    }

}

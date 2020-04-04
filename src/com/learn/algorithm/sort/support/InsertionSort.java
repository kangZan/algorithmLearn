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
            int temp = arr[i];
            int j;
            for (j = i; j > 0; j--) {
                if (temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            arr[j] = temp;
        }
        return arr;
    }

}

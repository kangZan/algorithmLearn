package com.learn.algorithm.sort.support;

import com.learn.algorithm.sort.Sort;

/**
 * @program: algorithmLearn
 * @Description: 自己写的，不知道是什么排序,知道的告知我下谢谢大佬
 * @Version: 1.0
 * @History: 1.Created by zan.kang on 2020/4/4 23:42.
 * 2.
 **/
public class MyUnknowSort extends Sort {
    public int[] sort(int... arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    swap(arr, j, i);
                }
            }
        }
        return arr;
    }
}
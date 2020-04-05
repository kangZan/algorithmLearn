package com.learn.algorithm.sort.support;

import com.learn.algorithm.sort.Sort;

/**
 * @program: algorithmLearn
 * @Description: TODO
 * @Version: 1.0
 * @History: 1.Created by zan.kang on 2020/4/5 12:28.
 * 2.
 **/
public class ShellSort extends Sort {
    @Override
    public int[] sort(int... arr) {
        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }
        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int j = gap; j < arr.length; j++) {
                int i = j;
                while (i >= gap && arr[i - gap] > arr[i]) {
                    swap(arr, i, i - gap);
                    i -= gap;
                }
            }
        }
        return arr;
    }
}

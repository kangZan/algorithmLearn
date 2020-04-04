package com.learn.algorithm.sort.support;

import com.learn.algorithm.sort.Sort;

import java.util.Arrays;

/**
 * @program: algorithmLearn
 * @Description: TODO
 * @Version: 1.0
 * @History: 1.Created by zan.kang on 2020/4/4 17:05.
 * 2.
 **/
public class ArraySort extends Sort {
    @Override
    public int[] sort(int... arr) {
        Arrays.sort(arr);
        return arr;
    }
}

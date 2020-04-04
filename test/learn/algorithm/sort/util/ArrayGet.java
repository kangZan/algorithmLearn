package learn.algorithm.sort.util;

import java.util.Random;

/**
 * @program: algorithmLearn
 * @Description: TODO
 * @Version: 1.0
 * @History: 1.Created by zan.kang on 2020/4/4 16:14.
 * 2.
 **/
public class ArrayGet {

    public static int[] getRandomArr() {
        return getRandomArrayForLength(9);
    }

    public static int[] getRandomTenArr() {
        return getRandomArrayForLength(99);
    }

    public static int[] getRandomHundredArr() {
        return getRandomArrayForLength(999);
    }

    public static int[] getRandomThousandArr() {
        return getRandomArrayForLength(9999);
    }

    public static int[] getRandomTenThousandArr() {
        return getRandomArrayForLength(99999);
    }

    public static int[] getOrderArr() {
        return getOrderArrayForLength(9);
    }

    public static int[] getOrderTenArr() {
        return getOrderArrayForLength(99);
    }

    public static int[] getOrderHundredArr() {
        return getOrderArrayForLength(999);
    }

    public static int[] getOrderThousandArr() {
        return getOrderArrayForLength(9999);
    }

    public static int[] getOrderTenThousandArr() {
        return getOrderArrayForLength(99999);
    }

    public static int[] getRandomArrayForLength(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(length);
        }
        return arr;
    }

    public static int[] getOrderArrayForLength(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = i;
        }
        return arr;
    }
}

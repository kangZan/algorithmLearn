package learn.algorithm.sort.util;

/**
 * @program: algorithmLearn
 * @Description: TODO
 * @Version: 1.0
 * @History: 1.Created by zan.kang on 2020/4/4 18:20.
 * 2.
 **/
public class ArrayUtil {

    public static int[] copyArray(int[] sourceArr) {
        int[] targetArr = new int[sourceArr.length];
        System.arraycopy(sourceArr, 0, targetArr, 0, targetArr.length);
        return targetArr;
    }

    public static void arrayCompare(int[] leftArr, int[] rightArr) throws Exception {
        if (leftArr.length != rightArr.length) {
            throw new Exception();
        }
        for (int i = 0; i < rightArr.length; i++) {
            if (rightArr[i] != leftArr[i]) {
                throw new Exception();
            }
        }
    }
}

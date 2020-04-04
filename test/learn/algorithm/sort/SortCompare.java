package learn.algorithm.sort;

import learn.algorithm.sort.util.ArrayGet;
import learn.algorithm.sort.util.ArrayUtil;
import com.learn.algorithm.sort.Sort;
import com.learn.algorithm.sort.support.ArraySort;
import com.learn.algorithm.sort.support.BubbleSort;
import com.learn.algorithm.sort.support.SelectionSort;
import org.junit.Test;

/**
 * @program: algorithmLearn
 * @Description: 排序算法比较
 * @Version: 1.0
 * @History: 1.Created by zan.kang on 2020/4/4 16:06.
 * 2.
 **/
public class SortCompare {
    @Test
    public void sortRandomArrTest() {
        int[] arr = ArrayGet.getRandomArr();
        Sort[] sorts = getAllSortAlgorithm();
        sortTest(sorts, arr);
    }

    @Test
    public void sortRandomTenArrTest() {
        int[] arr = ArrayGet.getRandomTenArr();
        Sort[] sorts = getAllSortAlgorithm();
        sortTest(sorts, arr);
    }

    @Test
    public void sortRandomHundredArrTest() {
        int[] arr = ArrayGet.getRandomHundredArr();
        Sort[] sorts = getAllSortAlgorithm();
        sortTest(sorts, arr);
    }

    @Test
    public void sortRandomThousandArrTest() {
        int[] arr = ArrayGet.getRandomThousandArr();
        Sort[] sorts = getAllSortAlgorithm();
        sortTest(sorts, arr);
    }

    @Test
    public void sortRandomTenThousandArrTest() {
        int[] arr = ArrayGet.getRandomTenThousandArr();
        Sort[] sorts = getAllSortAlgorithm();
        sortTest(sorts, arr);
    }


    @Test
    public void sortOrderArrTest() {
        int[] arr = ArrayGet.getOrderArr();
        Sort[] sorts = getAllSortAlgorithm();
        sortTest(sorts, arr);
    }

    @Test
    public void sortOrderTenArrTest() {
        int[] arr = ArrayGet.getOrderTenArr();
        Sort[] sorts = getAllSortAlgorithm();
        sortTest(sorts, arr);
    }

    @Test
    public void sortOrderHundredArrTest() {
        int[] arr = ArrayGet.getOrderHundredArr();
        Sort[] sorts = getAllSortAlgorithm();
        sortTest(sorts, arr);
    }

    @Test
    public void sortOrderThousandArrTest() {
        int[] arr = ArrayGet.getOrderThousandArr();
        Sort[] sorts = getAllSortAlgorithm();
        sortTest(sorts, arr);
    }

    @Test
    public void sortOrderTenThousandArrTest() {
        int[] arr = ArrayGet.getOrderTenThousandArr();
        Sort[] sorts = getAllSortAlgorithm();
        sortTest(sorts, arr);
    }

    private Sort[] getAllSortAlgorithm() {
        Sort[] sorts = {
                new BubbleSort()
                , new SelectionSort()
                , new ArraySort()
        };
        return sorts;
    }

    private void sortTest(Sort[] sorts, int[] sourceArr) {
        for (Sort sort : sorts) {
            System.out.println();
            int[] arr = ArrayUtil.copyArray(sourceArr);
            System.out.println(sort.getClass().getName() + ":");
            sort.sortPrintTimes(arr);
        }
    }


}

package learn.algorithm.sort;

import com.learn.algorithm.sort.support.*;
import learn.algorithm.sort.util.ArrayGet;
import learn.algorithm.sort.util.ArrayUtil;
import com.learn.algorithm.sort.Sort;
import org.junit.Test;

import java.util.Arrays;

/**
 * @program: algorithmLearn
 * @Description: 排序算法正确性验证
 * @Version: 1.0
 * @History: 1.Created by zan.kang on 2020/4/4 16:06.
 * 2.
 **/
public class SortCheck {

    @Test
    public void testBubbleSort() throws Exception {
        testSort(new BubbleSort());
    }


    @Test
    public void testSelectionSort() throws Exception {
        testSort(new SelectionSort());
    }

    @Test
    public void testArraySort() throws Exception {
        testSort(new ArraySort());
    }

    @Test
    public void testShellSort() throws Exception {
        testSort(new ShellSort());
    }

    @Test
    public void testInsertionSort() throws Exception {
        testSort(new InsertionSort());
    }

    @Test
    public void testUnknowSort() throws Exception {
        testSort(new MyUnknowSort());
    }

    private void testSort(Sort mySort) throws Exception {
        for (int k = 0; k < 10000; k++) {
            int[] systemSortArr = ArrayGet.getRandomThousandArr();
            int[] mySortArr = ArrayUtil.copyArray(systemSortArr);
            mySort.sort(mySortArr);
            Arrays.sort(systemSortArr);
            ArrayUtil.arrayCompare(mySortArr, systemSortArr);
        }
    }


}

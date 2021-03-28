import org.junit.Test;
import sample.java.*;

import java.util.Arrays;

public class MyTest {
    @Test
    public void bubbleTest() {
        BubbleSort<Integer> bubble = new BubbleSort<>();
        Integer[] array = {10,12,31,23,14,16,3,2,9};
        System.out.println(Arrays.toString(bubble.bubbleSort(array)));
    }

    @Test
    public void selectTest() {
        SelectSort<Integer> selectSort = new SelectSort<>();
        Integer[] array = {10,12,31,23,14,16,3,2,9};
        System.out.println(Arrays.toString(selectSort.selectSort(array)));
    }

    @Test
    public void insertTest() {
        InsertSort<Integer> insertSort = new InsertSort<>();
        Integer[] array = {10,12,31,23,14,16,3,2,9};
        System.out.println(Arrays.toString(insertSort.insertSort(array)));
        System.out.println(Arrays.toString(insertSort.insertSortInPlace2(array)));
    }

    @Test
    public void mergeTest() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        Integer[] array = {10,12,31,23,14,16,3,2,9};
        System.out.println(Arrays.toString(mergeSort.mergeSort(array)));
    }

    @Test
    public void quickTest() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] array = {10,12,31,23,14,16,3,2,9};
        System.out.println(Arrays.toString(quickSort.quickSort(array)));
    }

    @Test
    public void test(){
        System.out.println(2<<3);
    }

}

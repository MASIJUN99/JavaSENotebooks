package sample.java;

public class QuickSort<T extends Comparable<T>> {

    public T[] quickSort(T[] array) {
        int length = array.length;
        return quickSortInPlace(array, 0, length);
    }

    public T[] quickSortInPlace(T[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(array, left, right);
            quickSortInPlace(array, left, partitionIndex);
            quickSortInPlace(array, partitionIndex + 1, right);
        }
        return array;
    }

    private int partition(T[] array, int left, int right) {
        int ref = left;  // 参考点
        int index = ref + 1;
        for (int i = index; i < right; i++) {
            if (array[ref].compareTo(array[i]) > 0) {
                swap(array, i, index);
                index += 1;
            }
        }
        swap(array, ref, index - 1);
        return index - 1;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

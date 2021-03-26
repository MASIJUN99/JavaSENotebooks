package sample.java;

import java.util.Arrays;

public class MergeSort <T extends Comparable<T>> {

    public T[] mergeSort(T[] array) {
        return mergeSortInPlace(array);
    }

    public T[] mergeSortInPlace(T[] array) {
        int length = array.length;

        if (length <= 2) {
            return array;
        }
        int mid = length / 2;

        return merge(mergeSortInPlace(slice(array, 0, mid)), mergeSortInPlace(slice(array, mid, length)));
    }

    private T[] merge(T[] array1, T[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int length = length1 + length2;
        T[] newArray = Arrays.copyOf(array1, length);
        int p1 = 0;
        int p2 = 0;
        int idx = 0;
        while (p1 < length1 && p2 < length2) {
            if (array1[p1].compareTo(array2[p2]) > 0) {
                newArray[idx] = array2[p2];
                idx += 1;
                p2 += 1;
            } else {
                newArray[idx] = array1[p1];
                idx += 1;
                p1 += 1;
            }
        }
        if (p1 < length1) {
            for (; p1 < length1; p1++, idx++) {
                newArray[idx] = array1[p1];
            }
        } else {
            for (; p2 < length2; p2++, idx++) {
                newArray[idx] = array2[p2];
            }
        }
        return newArray;
    }

    private T[] slice(T[] array, int n, int m) {
        T[] newArray = Arrays.copyOf(array, m-n);

        for(int i = n, idx = 0; i < m; i++, idx++) {
            newArray[idx] = array[i];
        }
        return newArray;
    }

}

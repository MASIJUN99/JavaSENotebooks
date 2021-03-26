package sample.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort <T extends Comparable<T>> {

    public T[] insertSort(T[] array){
        return insertSortInPlace(array);
    }

    public T[] insertSortInPlace(T[] array) {
        int length = array.length;
        for(int i = 0; i < length; i++) {
            int chosen = i;
            for(int j = i; j >= 0; j--) {
                if (array[j].compareTo(array[chosen]) > 0) {
                    T temp = array[chosen];
                    array[chosen] = array[j];
                    array[j] = temp;
                    chosen = j;
                }
            }
        }
        return array;
    }

    public T[] insertSortInPlace2(T[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            T temp = array[i];
            int j = i;
            for (j = i; j > 0 && array[j - 1].compareTo(temp) > 0;) {
                array[j] = array[j - 1];
                j--;
            }
            if (j != i) {
                array[j] = temp;
            }
        }
        return array;
    }

    public T[] insertSortNotInPlace(T[] array) {
        int length = array.length;
        T[] newArray = Arrays.copyOf(array, length);
        return array;
    }

}

package sample.java;

public class BubbleSort <T extends Comparable<T>> {

    public T[] bubbleSort(T[] array) {
        return bubbleSortInPlace(array);
    }

    public T[] bubbleSortInPlace(T[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if ( array[i].compareTo(array[j]) > 0 ) {
                    // array[i] bigger than array[j]
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
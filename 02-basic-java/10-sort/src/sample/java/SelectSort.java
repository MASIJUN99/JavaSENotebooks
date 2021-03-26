package sample.java;

public class SelectSort <T extends Comparable<T>> {

    public T[] selectSort(T[] array) {
        return selectSortInPlace(array);
    }

    public T[] selectSortInPlace(T[] array) {
        int length = array.length;
        for(int i = 0; i < length; i++) {
            int selected = i;
            for(int j = i; j < length; j++) {
                if (array[selected].compareTo(array[j]) > 0){
                    selected = j;
                }
            }
            T temp = array[i];
            array[i] = array[selected];
            array[selected] = temp;
        }
        return array;
    }
}

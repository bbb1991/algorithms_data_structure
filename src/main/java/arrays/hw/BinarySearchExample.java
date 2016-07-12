package arrays.hw;

import java.util.Comparator;

/**
 * Created by bbb1991 on 7/12/16.
 * Реализация алгоритма поиска - бинарный поиск.
 * Эффективность - O(log(N))
 */
public class BinarySearchExample<T extends Number & Comparable<? super T>> {

    public int search(T[] values, T target) {
        return binarySearch(values, target, 0, values.length-1);
    }

    private int binarySearch(T[] values, T target, int min, int max) {
        if (min > max) {
            return -1;
        }
        int middle = (max + min) / 2;
        T value = values[middle];

        if (value.compareTo(target) == 1) {
            return binarySearch(values, target, min, middle-1);
        }
        if (value.compareTo(target) == -1) {
            return binarySearch(values, target, middle+1, max);
        }
        return middle;
    }

}

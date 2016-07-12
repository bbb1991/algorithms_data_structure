package arrays.hw;

import java.util.Objects;

/**
 * Created by bbb1991 on 7/13/16.
 * Реализация алгоритма линейного поиска
 * Эффективность: O(N)
 */
public class LinearSearchExample<T extends Number & Comparable<? super T>> {

    public int search(T[] values, T target) {
        for (int i = 0; i < values.length; i++) {
            if (Objects.equals(values[i], target)) {
                return i;
            }
        }
        return -1;
    }
}

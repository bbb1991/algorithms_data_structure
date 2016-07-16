package ch2_arrays.hw;

/**
 * Пример из книги
 * Created by bbb1991 on 7/12/16.
 */
public class HighArray {
    private long[] arr;
    private int numberElems;

    public HighArray(int size) {
        this.arr = new long[size];
        numberElems = 0;
    }

    public boolean find(long key) {
        for (long elem : arr) {
            if (elem == key) {
                return true;
            }
        }
        return false;
    }

    public void insert(long value) {
        arr[numberElems++] = value;
    }

    public boolean delete(long value) {
        int j = 0;

        for (; j < numberElems; j++) {
            if (value == arr[j]) {
                break;
            }
        }

        if (j == numberElems) {
            return false;
        } else {
            System.arraycopy(arr, j + 1, arr, j, numberElems - j);
        }
        numberElems--;
        return true;
    }

    /**
     * Метод, возвращающий максимальное значение
     * @return максимальное значение, либо -1 если массив пуст
     */
    public long getMax() {
        if (numberElems == 0) { // if array is empty
            return -1;
        }
        long maxElem  = Long.MIN_VALUE;
        for (long currentElement : arr) {
            if (maxElem < currentElement) {
                maxElem = currentElement;
            }
        }

        return maxElem;
    }

}

package ch2_arrays.hw;

import java.util.Arrays;

/**
 * Пример из книги
 * Created by bbb1991 on 7/17/16.
 */
public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBund = 0;
        int upperBound = nElems -1;
        int curIn;

        while (true) {
            curIn = (lowerBund + upperBound) / 2;

            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBund > upperBound) {
                return -1;
            } else {
                if (a[curIn] < searchKey) {
                    lowerBund = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int j = 0;

        for (; j < nElems; j++) {
            if (a[j] > value) {
                break;
            }
        }
        System.arraycopy(a, j, a, j + 1, nElems - j);
        a[j] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            System.arraycopy(a, j + 1, a, j, nElems - j);

            nElems--;
            return true;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(a);
    }
}

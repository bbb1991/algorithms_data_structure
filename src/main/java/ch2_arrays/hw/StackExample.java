package ch2_arrays.hw;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Простая реализация структуры данных Стэк
 * добавлеине O(1)
 * доступ O(1)
 * @param <T> какой тип стэка
 */

public class StackExample<T> {
    private T[] arr;
    private int pointer;

    public StackExample(Class<T> clazz, int size) {
        arr = (T[]) Array.newInstance(clazz, size);
        pointer = 0;
    }

    /**
     * Добавляет элемент в конец списка.
     * @param elem добавляемый элемент. добавление происходит в случае, если стек не полон
     * @return true если элемент вставлен, иначе false
     */
    public boolean push(T elem) {
        if (arr.length > pointer) {
            arr[pointer++] = elem;
            return true;
        }
        return false;
    }

    /**
     * получение последнего вставленного элемента с смещением указателя
     * @return последний элемент, иначе null.
     */
    public T pop() {
        if (pointer > 0) {
            T elem = arr[--pointer];
            return elem;
        }
        return null;
    }

    /**
     * получение последнего вставленного элемента без смещениения указателя
     * @return последний элемент, иначе null.
     */
    public T peek() {
        if (pointer > 0) {
            return arr[pointer-1];
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(arr);
    }
}

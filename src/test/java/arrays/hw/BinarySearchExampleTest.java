package arrays.hw;

import ch2_arrays.hw.BinarySearchExample;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchExampleTest {

    private BinarySearchExample<Integer> binarySearchExample;
    Integer[] a;

    @Before
    public void setup() {
        binarySearchExample = new BinarySearchExample<>();
        a = new Integer[]{1, 2, 4, 5, 6, 7, 8, 9, 11, 13,};
    }

    @Test
    public void notMatchSearch() throws Exception {
        Assert.assertEquals(-1, binarySearchExample.search(a, 10));
    }

    @Test
    public void matchSearch() throws Exception {
        Assert.assertEquals(a.length-1, binarySearchExample.search(a, 13));
    }



}
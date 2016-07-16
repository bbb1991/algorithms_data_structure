package arrays.hw;

import ch2_arrays.hw.LinearSearchExample;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by bbb1991 on 7/13/16.
 */
public class LinearSearchExampleTest {

    private LinearSearchExample<Integer> linearSearchExample;
    private Integer[] a;

    @Before
    public void setUp() throws Exception {
        linearSearchExample = new LinearSearchExample<>();
        a = new Integer[]{1, 2, 6, 7, 6, 56, 432, 32, 23, 8,};
    }

    @Test
    public void search() throws Exception {
        Assert.assertEquals(a.length-1, linearSearchExample.search(a, 8));
    }

}
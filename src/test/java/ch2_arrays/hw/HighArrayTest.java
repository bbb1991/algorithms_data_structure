package ch2_arrays.hw;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by bbb1991 on 7/17/16.
 */
public class HighArrayTest {

    private static Random random;

    @Before
    public void setup() {
        random = new Random();
    }

    @Test
    public void test1() {
        HighArray highArray = new HighArray(10);

        highArray.insert(1);
        highArray.insert(-100);
        highArray.insert(666);
        highArray.insert(456);

        assertEquals(666, highArray.getMax());
    }

}
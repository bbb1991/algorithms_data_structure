package arrays.hw;

import ch2_arrays.hw.StackExample;
import org.junit.Assert;
import org.junit.Test;

public class StackExampleTest {

    @Test
    public void test1() {
        StackExample<Integer> stack = new StackExample<>(Integer.class, 10);

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        Assert.assertEquals((Integer) 9, stack.peek());

        for (int i = 9; i > -1; i--) {
            Assert.assertEquals((Integer) i, stack.pop());
        }
    }

}
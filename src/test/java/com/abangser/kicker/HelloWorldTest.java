package test.java.com.abangser.kicker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {

    @Test
    public void onePlusOne_ShouldEqualTwo() {
        assertThat(1+1, is(2));
    }
}

package com.savdev;

import org.junit.Assert;
import org.junit.Test;

public class CoreProbeTest {

    public static final String EXPECTED = "Hello, New World!";

    Transmitter t = new CoreProbe();

    @Test
    public void testTouchdown(){
        Assert.assertEquals(EXPECTED, t.touchdown());
    }
}

package test.UnitTest;
import static org.junit.Assert.*;

import UnitTest.ArrayUtilsUsage;
import org.junit.Test;

public class TestArrayUtilsUsage {
    @Test
    public void TestArrayUtilsUsage()
    {
        ArrayUtilsUsage list=new ArrayUtilsUsage("12");
        String i1="1";
        String i2="2";
        assertEquals(1,list.last(i2));
        assertEquals(0,list.last(i1));


    }
}

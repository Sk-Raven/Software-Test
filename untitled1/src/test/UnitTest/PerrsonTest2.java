package test.UnitTest;

import UnitTest.Person;
import org.junit.Test;
import static org.junit.Assert.*;

import UnitTest.ArrayUtilsUsage;
import org.junit.Test;
public class PerrsonTest2 {
    @Test
    public void testcmp()
    {
        Person test=new Person();
        assertEquals(1,test.cmp());
    }
}

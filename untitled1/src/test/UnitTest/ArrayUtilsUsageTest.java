package test.UnitTest; 

import UnitTest.ArrayUtilsUsage;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;


/** 
* ArrayUtilsUsage Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 21, 2018</pre> 
* @version 1.0 
*/ 
public class ArrayUtilsUsageTest {
    static ArrayUtilsUsage test;
@Before
public void before() throws Exception {
    String r="111";
    test=new ArrayUtilsUsage(r);
} 

@After
public void after() throws Exception {
    System.out.println("over");
} 


@Test
public void check() throws Exception {
    test.check();
}
@Test
public void last() throws Exception {
        test.last("a");
    }
    @Test
    public void my() throws Exception {
    System.out.println(test.my(-1));
    }
@Test
    public void main() throws Exception {
    }


} 

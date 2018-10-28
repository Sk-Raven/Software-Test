package UnitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class test {
    static ArrayUtilsUsage test;
    static Person person;
    String[] a = {"0","ASDGFD"};
           int []b={1,2,3};
    @Before
    public void before() throws Exception {
        String r="111";
        test=new ArrayUtilsUsage(r);
        person = new Person();
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
    public void testWatch() throws Exception {

        person.watch();
    }

    /**
     *
     * Method: getName()
     *
     */
    @Test
    public void testGetName() throws Exception {
        Person person = new Person();
        person.setName("emma");
    }

    /**
     *
     * Method: setName(String name)
     *
     */
    @Test
    public void testSetName() throws Exception {
        Person person = new Person();
        person.setName("emma");
        System.out.println(person.getName());
    }


}
package test.UnitTest;
import UnitTest.Person;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.JUnit4TestAdapter;
@RunWith(Suite.class)
@SuiteClasses({ArrayUtilsUsageTest.class})



public class AllTests {
    public static Test Suite() {
        TestSuite suite = new TestSuite("All Junit test");
        suite.addTest(new JUnit4TestAdapter(ArrayUtilsUsageTest.class));

        return suite;
    }
}

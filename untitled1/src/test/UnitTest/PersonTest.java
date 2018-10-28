package test.UnitTest; 

import UnitTest.Person;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Person Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 21, 2018</pre> 
* @version 1.0 
*/ 
public class PersonTest {
    static Person person;
@Before
public void before() throws Exception {
    person = new Person();
    System.out.println("before");
} 

@After
public void after() throws Exception {
    System.out.println("after");
} 

/** 
* 
* Method: watch() 
* 
*/ 
@Test
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

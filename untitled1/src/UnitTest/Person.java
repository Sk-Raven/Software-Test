package UnitTest;
import java.util.Collections;

public class Person {
    public int uncmp()
    {
        System.out.println("正确");
        return 1;
    }
    public int cmp()
    {
        return uncmp();
    }

    private String name;
    public  void watch(){
        System.out.println("7777");
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}

package UnitTest;


import org.apache.commons.lang.StringUtils;

public class ArrayUtilsUsage {
    String index;
    public ArrayUtilsUsage(String s)
    {
        index=s;
    }
    public boolean check()
    {
        if (StringUtils.isBlank(index)) {

        return true;
        }
        else {
            return false;
        }
    }
    public int last(String a)
    {
        return StringUtils.lastIndexOf(index,a);
    }
    public char my(int i)
    {
        return index.charAt(i);
    }
}

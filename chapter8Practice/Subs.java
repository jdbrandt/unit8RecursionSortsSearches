import java.util.*;


public class Subs
{
    
    
    public static void main(String[] args)
    {
        
        
    }
    
    public Subs()
    {
        
        
    }
    
    public static ArrayList<String> substringGenerator(String s)
    {
        ArrayList<String> fullList = new ArrayList<String>();
        if (s.length()==0)
        {
            fullList.add("");
            return fullList;
        }
        else if (s.length() == 1)
        {
            fullList.add(s);
            return fullList;
        }
        for (int i = 0; i < s.length()+1; i++)
        {
            fullList.add(s.substring(0,i));
        }
        ArrayList<String> others = substringGenerator(s.substring(1, s.length()));
        fullList.addAll(others);
        return fullList;
    }
    

}
    
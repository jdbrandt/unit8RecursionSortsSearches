import java.util.*;

/**
 * Write a description of class StringReversal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringReversal
{
     public static void main(String[] args)
     {
         Scanner s = new Scanner(System.in);
         System.out.println("fdkl");
         String string = s.next();
         
         System.out.println(StringReversal.reverse(string));
    }
    
    public static String reverse(String s)
    {
        return s.length()==0?"":reverse(s.substring(1)).concat(new String(new char[]{s.charAt(0)}));
    }
    

}

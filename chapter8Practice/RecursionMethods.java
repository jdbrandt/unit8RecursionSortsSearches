import java.util.*;
public class RecursionMethods
{
    public static void main(String[] args)
    {
        String[] bins = makeBins(10);
        ArrayList<Integer> bins2 = new ArrayList<Integer>();
        for (int i = 100; i > 0; i--)
        {
            bins2.add(new Integer(i));
            System.out.print(i + " ");
        }
        bins2=reverseList(bins2); 
        System.out.println("\nyooooo im reversed");
        for (Integer s : bins2)
        {
            System.out.print(s + " ");
        }
    }

    public static String[] makeBins(int len)
    {
        if (len == 1)
        {
            return new String[] {"0","1"};
        }
        else
        {
            String[] rest = makeBins(len-1);
            String[] newBins =new String[(int)Math.pow(2,len)-1];
            for (int i = 0; i < Math.pow(2,len-1)-1; i++)
            {
                newBins[i] = rest[i]+"0";
                newBins[i+len] = rest[i]+"1";
            }
            return newBins;
        }
    }

    public static ArrayList<Integer> makeList(int len)
    {
        if(len==1)
        {
            ArrayList<Integer> base = new ArrayList<Integer>();
            base.add(new Integer(1));
            return base;
        }
        else
        {
            ArrayList<Integer> newInts = new ArrayList<Integer>(makeList(len-1));
            newInts.add(new Integer(len));
            return newInts;
        }
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (Integer i : tList)
        {
            list.add(new Integer(i));
        }
        return list;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = RecursionMethods.deepClone(tList); 
        if (list.size()<=1)
        {
            return list;
        }
        else
        {
            ArrayList<Integer> last = new ArrayList<Integer>();
            last.add(list.get(list.size()-1));
            ArrayList<Integer> everythingelse = reverseList(new ArrayList<Integer>(list.subList(0,list.size()-1)));
            last.addAll(everythingelse);
            return last;
        }
    }
   
        
}
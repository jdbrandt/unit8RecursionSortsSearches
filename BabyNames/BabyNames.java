import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class BabyNames
{
    public static final double LIMIT = 50;

    public static void main(String[] args) throws Exception
    {  
        Scanner in = new Scanner(new File("babyNames2000.txt"));
        clean(in);
        in = new Scanner(new File("babyNames2000clean.txt"));
        RecordReader boys = new RecordReader(LIMIT);
        RecordReader girls = new RecordReader(LIMIT);

        while (boys.hasMore() || girls.hasMore())
        {
            int rank = in.nextInt();
            System.out.print(rank + " ");
            boys.process(in);
            girls.process(in);
            System.out.println();
        }

        in.close();
    }

    public static void clean(Scanner s) throws Exception
    {
        
        removeTabs(s);    
        s = new Scanner(new File("babyNames2000clean.txt"));
        insertPercents(s);
    }
    
    public static void removeTabs(Scanner s) throws Exception
    {
        PrintWriter writer = new PrintWriter("babyNames2000clean.txt", "UTF-8");
        while (s.hasNext())
        {
            String temps = s.next();
            if (temps.trim().length()==0 && ! temps.equals("\n"))
            {
                temps = " ";
            }
            writer.print(temps);
            try
            {
                Integer.parseInt(temps)
            }
            catch (NumberFormatException)
            {
                if (!s.hasNextInt() 
        }
        writer.close();
    }
    
    public static void insertPercents(Scanner s) throws Exception
    {
        /**
        PrintWriter writer = new PrintWriter("babyNames2000clean.txt", "UTF-8");
        int numBoys;
        int numGirls;
        **/
    }
}   

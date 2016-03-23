import java.util.*;
import java.io.*;
import java.net.*;
public class WC
{

    public static void main(String[] args)
    {

        System.out.println("Enter text file");
        Scanner fromUser = new Scanner(System.in);

        File inputFile = null;
        Scanner fileReader = null;
        while (inputFile == null)
        {
            inputFile = new File(fromUser.next());
        }
        System.out.println("Number of characters: "+numberOf(fileReader, inputFile, ""));
        System.out.println("Number of words: "+numberOf(fileReader, inputFile, " "));
        System.out.println("Number of lines: "+numberOf(fileReader, inputFile, "\n"));

    }

    private static int numberOf(Scanner s, File inputFile, String delim)
    {
        try
        {
            s = new Scanner(inputFile);
        }
        catch (FileNotFoundException exception)
        {
        }
        s.useDelimiter("");
        int num = 0;

        while (s.hasNext())
        {
            if (s.next().indexOf(delim)>=0)
            {
                num++;
            }
        }

        return num;
    }

}

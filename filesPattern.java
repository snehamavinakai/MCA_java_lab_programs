import java.util.*;
import java.io.*;

public class filesPattern
{
    public static void main(String[] args)
    {
        System.out.println("Enter the pattern(txt.java) : ");
        Scanner sc = new Scanner(System.in);

        String pt = sc.nextLine();
        File f = new File(".");
        
        if(f.exists())
        {
            if(f.isDirectory())
            {
                String f1[] = f.list();
                System.out.println("Files in the current directory with pattern "+ pt +" are");
                boolean found = false;
                for(int i=0;i<f1.length;i++)
                {
                    String tp = f1[i];
                    if(tp.endsWith(tp))
                    {
                        System.out.println("\t"+tp);
                        found = true;
                    }
                }
                if(!found)
                {
                    System.out.println("NULL");
                }
            }
        }
    }
}
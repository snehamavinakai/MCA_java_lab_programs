import java.io.*;
import java.util.*;
public class lab10
{
  public static void main(String args[])
{
  System.out.println("files in the directory");
  File[]files=new File(".").listFiles();
  for(File file:files)
{
 if(file.isFile())
{
 System.out.println(file.getName());
}
}
Scanner scanner = new Scanner(System.in);
System.out.print("\nEnter the name of the file to analyze : ");
String fileName=scanner.nextLine();
analyzeFile(fileName);
}
public static void analyzeFile(String fileName)
{
 try(BufferedReader reader=new BufferedReader(new FileReader(fileName)))
{
 int lines=0,words=0;
String line;
while((line=reader.readLine())!=null)
{
 lines++;
 words+=line.split("\\s+").length;
}
System.out.println("\n Analysis for file:"+fileName);
System.out.println("Number of lines:"+ lines);
System.out.println("Number of words:"+ words);
}
catch(IOException e)
{
 System.out.println("Error reading file:"+e.getMessage());
  }
 }
}



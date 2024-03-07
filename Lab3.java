import java.util.*;

class Student
{
int rollno;
String name;
double marks;

Student()
{ 
rollno = 1;
name = "Peter";
marks = 78.53;
}

Student(String n,double m,int r)
{
name = n;
marks = m;
rollno = r;
}
void Display()
{
//System.out.println("\n\tRollNo " +rollno+ "\tName  " +name+ "\tMarks  "+marks);
System.out.println("\t"+rollno+"\t"+ name+"\t"+marks);
}
}

public class Lab3
{
public static void main(String[] args)
{
Student s1 =  new Student();
Student s2 =  new Student("Jenny",98.42,25);
System.out.println("\n\tRollno\tName\tMarks ");
s1.Display();
s2.Display();
}
}



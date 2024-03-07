import java.util.Scanner;

class Member{

String name, address;
int age;
String phoneNumber;
float salary;

void printSalary()
{
System.out.println("Name : "+name);
System.out.println("Age : "+age);
System.out.println("Phone Number :"+phoneNumber);
}
}

class Employee extends Member{

String specialization;

Employee(String n,int ag,String ph,String ad,float sal,String sp)
{
name = n;
age = ag;
phoneNumber = ph;
address = ad;
salary = sal;
specialization = sp;
}
}

class Manager extends Member{

String Department;

Manager(String n,int ag,String ph,String ad,float sal,String dp)
{
name = n;
age = ag;
phoneNumber = ph;
address = ad;
salary = sal;
Department = dp;
}
}

public class Lab4
{
public static void main(String[] args)
{

String name,address,phoneNumber,specilization,department;
int age;
float salary;
Scanner s = new Scanner(System.in);
System.out.println("Enter Employee details : ");
System.out.print("Enter a name : ");
name = s.next();
System.out.print("Enter age : ");
age = s.nextInt();
System.out.print("Enter phone number : ");
phoneNumber = s.next();
System.out.print("Enter address : ");
address = s.next();
System.out.print("Enter salary : ");
salary = s.nextFloat();
System.out.print("Enter specilization :");
specilization = s.next();
 
Employee e1 = new Employee(name,age,phoneNumber,address,salary,specilization);

System.out.println("\nEnter Manager details : ");
System.out.print("Enter a name : ");
name = s.next();
System.out.print("Enter age : ");
age = s.nextInt();
System.out.print("Enter phone number : ");
phoneNumber = s.next();
System.out.print("Enter address : ");
address = s.next();
System.out.print("Enter salary : ");
salary = s.nextFloat();
System.out.print("Enetr Department : ");
department = s.next();

Manager m1 = new Manager(name,age,phoneNumber,address,salary,department);

System.out.println("\nEmployee Details");
e1.printSalary();
System.out.println("\nManager Details");
m1.printSalary();


}
}
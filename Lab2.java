import java.util.Scanner;

class Distance{
private int inches,feet;

public void getDistance()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the feet : ");
feet = sc.nextInt();
System.out.print("Enter the inches : ");
inches = sc.nextInt();
}

public void addDistance(Distance d1,Distance d2)
{
inches = d1.inches + d2.inches;
feet = d1.feet + d2.feet +(inches/12);
inches = inches % 12;
}

public void showDistance()
{
System.out.println("Feet: "+feet+"\nInches : "+inches);
}
}

public class Lab2{
public static void main(String args[])
{
Distance d1 = new Distance();
Distance d2 = new Distance();
Distance d3 = new Distance();
System.out.println("Enter the first distance : ");
d1.getDistance();
System.out.println("Enter the second distance : ");
d2.getDistance();
d3.addDistance(d1,d2);
System.out.println("\nTotal Distance : ");
d3.showDistance();
}
}
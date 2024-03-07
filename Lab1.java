import java.util.Scanner;

public class Lab1{

public static void main(String[]s)
{
Scanner sc = new Scanner(System.in);
System.out.printf("\n*** Decimal to Binary, Ocatal and Hexadecimal conversion ***");
System.out.printf("\nEnter the number : ");
int n = sc.nextInt();
System.out.printf("\nBinary value is : ");
decToBinary(n);
System.out.printf("\nOcatal value is : ");
decToOct(n);
System.out.printf("\nHexadecimal value is : ");
decToHexa(n);
}

private static void decToBinary(int n){
if(n>0)
{
decToBinary(n/2);
System.out.printf("%d",n%2);
}
}

private static void decToOct(int n){
if(n>0)
{
decToOct(n/8);
System.out.printf("%d",n%8);
}
}

private static void decToHexa(int n){
if(n>0)
{
decToHexa(n/16);
display(n%16);
}
}

private static void display(int r){
if(r<=9)
{
System.out.printf("%d",r);
}
else
{
for(int i=10;i<=16;i++)
{
if(r==i)
{
System.out.printf("%c",(i+55));
break;
}
}
}
}
}


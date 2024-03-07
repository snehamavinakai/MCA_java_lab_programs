import java.util.Scanner;
class Array_Odd_Elements
{
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array 1 Limit :");
		int l1 =input.nextInt();
		int [] a =new int[l1];
		System.out.println("Enter the Array 1 Elements :");
		for(int i=0;i<l1;i++)
		{
			a[i]=input.nextInt();
		}
		System.out.print("Enter the Array 2 Limit :");
		int l2 =input.nextInt();
		int [] b =new int[l2];
		System.out.println("Enter the Array 2 Elements :");
		for(int i=0;i<l2;i++)
		{
			b[i]=input.nextInt();
		}
		int count =0;
		for(int i=0;i<l1;i++)
		{
			if(a[i]%2!=0)
			{
				count++;
			}
		}
		for(int i=0;i<l2;i++)
		{
			if(b[i]%2!=0)
			{
				count++;
			}
		}
		int [] c =new int[count];
		count=0;
		for(int i=0;i<l1;i++)
		{
			if(a[i]%2!=0)
			{
				c[count]=a[i];
				count++;
			}
		}
		for(int i=0;i<l2;i++)
		{
			if(b[i]%2!=0)
			{
				c[count]=b[i];
				count++;
			}
		}
		System.out.println("Array of Odd Elements :");
		for(int p:c)
		{
			System.out.print(p+" ");
		}
	}
}
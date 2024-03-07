import java.util.Scanner;
class Array_Remove_Duplicate
{
	public static void main(String[] args)
	{   
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int l =input.nextInt();
		int [] a =new int[l];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<l;i++)
		{
			a[i]=input.nextInt();
		}
		int j=0;
		for(int i=0;i<l;i++)
		{
			int flag=0;
			for(int k=0;k<i;k++)
			{
				if(a[i]==a[k])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				a[j]=a[i];
				j++;
			}
		}
		int [] b =new int[j];
		for(int i=0;i<j;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Array after removing duplicates :");
		for(int p:b)
		{
			System.out.print(p+" ");
		}
	}
}
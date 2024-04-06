import java.util.*;
class Pyramid
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of rows: ");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

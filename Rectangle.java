import java.util.*;
class Rectangle
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of rows: ");
		int r=s.nextInt();
		System.out.println("enter the no.of columns: ");
		int c=s.nextInt();
		for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
		{
			System.out.print("*");
		}
			System.out.println();
		}
	}
}

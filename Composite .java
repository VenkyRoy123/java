import java.util.*;
class Composite
{
	public static void main(String args[])
	{
		int a,b,i,j,composite;
		Scanner s=new Scanner(System.in);
		System.out.println("enter A: ");
		a=s.nextInt();
		System.out.println("enter B: ");
		b=s.nextInt();
		System.out.println("composite numbers are: ");
		for(i=a+1;i<b;i++)
		{
			composite=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					composite++;
				}
			}
			if(composite!=0)
			{
				System.out.println(i);
			}
		}
	}
}

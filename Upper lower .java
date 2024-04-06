import java.util.*;
class Upper_lower
{
	public static void main(String args[])
	{
		int lower=0,upper=0,digit=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter * to exit ");
		char c='0';
		while(c!='*')
		{
			c=s.next().charAt(0);
			if(c>='a' && c<='z')
			{
				lower++;
			}
			else if(c>='A' && c<='Z')
			{
				upper++;
			}
			else if(c>='0' && c<='9')
			{
				digit++;
			}
		}
		System.out.println("no.of lower: "+lower);
		System.out.println("no.of upper: "+upper);
		System.out.println("no.of digit: "+digit);		
	}
}

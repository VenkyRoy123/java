import java.util.*;
class Consonants
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int vowels=0,consonants=0,len,i;
		char vow[]=new char[10];
		char cons[]=new char[10];
		System.out.println("enter the string: ");
		String s1=s.nextLine();
		len=s1.length();
		for(i=0;i<len;i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{

				vow[vowels]=ch;
				vowels++;
			}
			else
			{
				
				cons[consonants]=ch;
				consonants++;
			}
		}
		System.out.println("no.of vowels are: "+vowels);
		System.out.print("vowels are: ");
		for(i=0;i<vowels;i++)
		{
			System.out.print(vow[i]+" ");
		}
		System.out.println();
		System.out.println("no.of consonants are: "+consonants);
		System.out.print("consonants are: ");
		for(i=0;i<consonants;i++)
		{
			System.out.print(cons[i]+" ");
		}
	}
}

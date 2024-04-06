import java.util.*;
class Simple_Interest
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int p,t,r;
		System.out.println("enter p: ");
		p=s.nextInt();
		System.out.println("enter t: ");
		t=s.nextInt();
		System.out.println("enter r: ");
		r=s.nextInt();
		double si=(p*t*r)/100;
		System.out.println("simple Interest is: "+si);
	}
}

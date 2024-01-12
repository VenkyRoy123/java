import java.util.Scanner;
class reversed{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
int n,r,sum=0;
System.out.print("Enter the number:");
n=s.nextInt();
while(n!=0)
{
r=n/10;
sum=sum*10+r;
n=n%10;
}
System.out.println(sum);
}
}

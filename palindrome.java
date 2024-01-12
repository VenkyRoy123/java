import java.util.Scanner;
class palindrome{
public static void main(String[] args){
Scanner s=new Scanner (System.in);
int n,r,temp,sum=0;
System.out.print("Enetr the number:");
n=s.nextInt();
temp=n;
while(n!=0){
r=n%10;
sum=sum*10+r;
n=n/10;
}
if (temp==sum)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}
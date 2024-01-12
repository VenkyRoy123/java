import java.util.Scanner;
class sum{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n,r,sum=0;
System.out.print("Enetr the n umber:");
n=s.nextInt();
while(n!=0){
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println(sum);
s.close();
}
}
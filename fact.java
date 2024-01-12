import java.util.Scanner;
class fact{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n,fact=1,i;
System.out.print("Enetr the number:");
n = s.nextInt();
for(i=1;i<=n;i++)
{
fact*=i;
}
System.out.println(fact);
}
}
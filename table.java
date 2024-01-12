import java.util.Scanner;
class table{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n,i;
System.out.print("Enetr the number of multiplication:");
n=s.nextInt();
for (i=1;i<=10;i++)
{
System.out.println("multi table"+n+"*"+i+"="+n*i);
}
}
} 
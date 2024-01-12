import java.util.Scanner;
class swap{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a,b;
System.out.print("Enetr the first number:");
a=s.nextInt();
System.out.print("Enetr the second  number:");
b=s.nextInt();
System.out.println("Before Swapping a="+a+" b="+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("After Sawpping a="+a+" b="+b);
}
}
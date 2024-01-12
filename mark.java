import java.util.Scanner;
class mark{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n,s1,s2,s3,s4,s5,total;
System.out.print("Enetr the number of the subjects:");
n=s.nextInt();
System.out.print("Enetr the first subject:");
s1=s.nextInt();
System.out.print("Enetr the second subject:");
s2=s.nextInt();
System.out.print("Enetr the third subject:");
s3=s.nextInt();
System.out.print("Enetr the fourth subject:");
s4=s.nextInt();
System.out.print("Enetr the fifth subject:");
s5=s.nextInt();
total=s1+s2+s3+s4+s5;
System.out.println("Total marks:"+total);
if (total >=90)
{
System.out.println("Grade A");
}
else if(total >=80 && total<90)
{
System.out.println("Grade B");
}
else if(total >=70 && total<80)
{
System.out.println("Grade C");
}
else if(total >=60 && total<70)
{
System.out.println("Grade D");
}
else if(total >50 && total<60)
{
System.out.println("Grade E");
}
else
{
System.out.println("Grade F");
}
}
}
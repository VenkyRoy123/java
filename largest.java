import java.util.Scanner;
class largest{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int a,b,c,max;
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if (a>=b && a>=c)
{
max= a;
}
else if(b>=a && b>=c)
{
max=b;
}
else{
max = c;
}
System.out.println("Largest number " +max);
}
}

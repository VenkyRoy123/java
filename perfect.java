import java.util.Scanner;
class perfect{
public static void main(String[] args){
Scanner s=new Scanner (System.in);
int n,sum=0,temp,i;
n=s.nextInt();
temp=n;
for(i=1;i<n;i++){
if (n%i==0)
sum+=i;
}
if (sum==temp)
System.out.println("perfecvt number");
else
System.out.println("Not ef");
}
}


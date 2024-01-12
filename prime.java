import java.util.Scanner;
class prime{
public static void main(String[] args){
Scanner s=new Scanner (System.in);
int n,i,c=0;
System.out.print("Enetr thye number:");
n=s.nextInt();
for(i=1;i<=n;i++){
if (n%i==0){
c++;
}
}
if (c==2){
System.out.println("Prime number"+n);}
else{
System.out.println("Notva prime number"+n);}
s.close();
}
}

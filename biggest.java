import java.util.Scanner;
class biggest{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n[],k,i,big;
System.out.print("Enter the size of the array:");
k=s.nextInt();
n=new int[k];
System.out.print("Enter the numbers:");
for(i=0;i<k;i++){
n[i]=s.nextInt();
}
big=n[0];
for(i=0;i<k;i++){
if (n[i]>big){
big=n[i];
}
}
System.out.println("Biggest number in array is:"+big);
}
}
import java.util.Scanner;

class Arm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, sum = 0, r, temp;
        System.out.print("Enter the number: ");
        n = s.nextInt();
        temp = n;

        while (n > 0) {
            r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }

        if (sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");

        s.close();
    }
}

import java.util.Scanner;

public class HarshadCheck {

    public static boolean isHarshad(int n) {
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            sum += temp % 10;     
         temp /= 10;              }

        return n % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isHarshad(num)) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}
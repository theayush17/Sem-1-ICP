import java.util.Scanner;

public class A6P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        sc.close();
    }

    public static int reverse(int number) {
        int reversed = 0;
        int n=number;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        System.out.println("Reverse is "+reversed);
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}

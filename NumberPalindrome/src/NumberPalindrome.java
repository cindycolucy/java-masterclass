public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int remainder;
        int originalInteger;

        originalInteger = number;

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        if (originalInteger == reverse) {
            return true;
        }
        return false;
    }

}

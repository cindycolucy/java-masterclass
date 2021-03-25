public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a < 10 || b < 10 || c < 10) || (a > 1000 || b > 1000 || c > 1000)) {
            return false;
        }
        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;

        if (aLast == bLast || bLast == cLast || aLast == cLast) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if ((number < 10) || (number > 1000)) {
            return false;
        }
        return true;
    }
}

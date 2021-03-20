public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = 0;
        int evenDigitSum = 0;
        while(number != 0){
            lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                evenDigitSum += lastDigit;
            }
            number /= 10;
        }
        return evenDigitSum;
    }
}

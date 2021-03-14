public class ForStatement {

    public static void main(String[] args) {
        System.out.println("$10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

//        for(init; condition; increment){
//        loop runs as long as condition is true;
//
//        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        //challenge
        for (int i = 2; i <= 8; i++) {
            System.out.println("$10,000 at " + i + "% interest = $" + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("*********************");

        //challenge 2
        for (int i = 8; i >= 2; i--) {
            System.out.println("$10,000 at " + i + "% interest = $" + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("**********************");

        //challenge 3

        for (int i = 10; i <= 50; i++) {
            if(isPrime(i)){
                System.out.println("prime number = " + i);
                int count = 0;
                count++;
                if(count == 10){
                    break;

                }

            }

        }
    }

    //how to determine a prime number

        public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

        public static double calculateInterest ( double amount, double interestRate){
            return (amount * (interestRate / 100));
        }
}

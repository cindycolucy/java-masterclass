public class WhileAndDoWhile {

    public static void main(String[] args) {

        //while statement

        int count = 1;
        while (count != 6) {
            System.out.println("Value is " + count);
            count++;
        }

        //equivalent for loop:
        for(int i = 1; i <= 5; i++){
            System.out.println("Value is " + i);
        }

        System.out.println("******************");


        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Value is " + count);
            count++;
        }


        //do-while loop
        //always will execute at least once

        System.out.println("******************");
        
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);


        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
        }

        System.out.println("Count is " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }
        return false;
    }
}


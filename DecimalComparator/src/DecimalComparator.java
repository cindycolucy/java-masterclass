public class DecimalComparator {

    public static void main(String[]args){
        areEqualByThreeDecimalPlaces(12432.1246, 32.12477);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        int temp = (int)(firstNumber * 1000.0);
        double newFirstNumber = ((double)temp)/1000.0;

        int temp2 = (int)(secondNumber * 1000.0);
        double newSecondNumber = ((double)temp2)/1000.0;

        System.out.println(newFirstNumber);
        System.out.println(newSecondNumber);
        if(newFirstNumber == newSecondNumber){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}

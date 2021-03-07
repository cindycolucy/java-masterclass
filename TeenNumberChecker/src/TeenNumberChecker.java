public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(23, 13, 54);
        isTeen(20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
        if((firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19)) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;

    }

    public static boolean isTeen(int age){
        if (age >= 13 && age <= 19){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

}

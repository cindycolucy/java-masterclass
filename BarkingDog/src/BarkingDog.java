public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 9);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay < 0 || hourOfDay > 23)
                || (!barking && (hourOfDay > 8 && hourOfDay < 22))) {
            System.out.println("False");
            return false;
        }
        System.out.println("True");
        return true;
    }

}

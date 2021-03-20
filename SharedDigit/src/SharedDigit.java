public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit(int x, int y){
        if((x < 10 || x > 99) || (y < 10 || y > 99)){
            return false;
        }
        int xFirstDigit = x / 10;
        int yFirstDigit = y /10;

        int xSecondDigit = x % 10;
        int ySecondDigit = y % 10;

        if((xFirstDigit == yFirstDigit) || (xSecondDigit == ySecondDigit))  {
            return true;

        }else if((xFirstDigit == ySecondDigit) || (xSecondDigit == yFirstDigit)){
            return true;
        }
        return false;

    }
}

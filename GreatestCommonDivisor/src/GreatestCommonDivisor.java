public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second){

        if (first < 10 || second < 10){
            return -1;
        }
        while (second != 0) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }

        return first;
    }

}



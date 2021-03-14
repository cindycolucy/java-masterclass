public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 1924));
       }

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year >= 9999)) {
            return false;
        } else return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12){
            return -1;
        } else if(year < 1 || year > 9999){
            return -1;
        } else if (isLeapYear(year) && month == 2){
            return 29;
        }
        switch(month){
            case 2:
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

}

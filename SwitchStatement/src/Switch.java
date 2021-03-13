public class Switch {

    public static void main(String[] args) {
//        int value = 3;
//        if (value  == 1){
//            System.out.println("Value was 1");
//
//        } else if (value == 2){
//            System.out.println("Value was 2");
//
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        //challenge

        char switchChar = 'f';

        switch (switchChar){
            case 'a':
                System.out.println("Char was an a");
                break;
            case 'b':
                System.out.println("Char was a b");
                break;
            case 'c':
                System.out.println("Char was a c");
                break;
            case 'd':
                System.out.println("Char was a d");
                break;
            case 'e':
                System.out.println("Char was an e");
                break;
            default:
                System.out.println("Char was not a, b c, d, or e");
                break;
        }

        String month = "january";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}

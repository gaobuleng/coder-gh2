public class NumDay {
    public static void main(String[] args) {
        String s = "2019/11/28";
        System.out.println(days(s));
    }

    public static int days(String s) {
        char[] c = new char[10];
       // int[] a = new int[8];
        int y = 0;
        int m = 0;
        int d = 0;
        for (int i = 0; i < 10; i++) {
            c[i] = s.charAt(i);
        }
        for (int i = 0; i < 4; i++) {
            y = y * 10 + (int) (c[i])-48;
        }
        for (int i = 5; i < 7; i++) {
            m = m * 10 + (int) (c[i])-48;
        }
        for (int i = 8; i < 10; i++) {
            d = d * 10 + (int) (c[i])-48;
        }
        if (y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {        //闰年
            return (numswitch(m, d, 29));
        } else {
            return (numswitch(m, d, 28));
        }
    }

    public static int numswitch(int month, int days, int fre) {
        switch (month) {
            case 1:
                return days;
            //break;
            case 2:
                return 31 + days;
            //break;
            case 3:
                return 31 + fre + days;
            //break;
            case 4:
                return 31 * 2 + fre + days;
            //break;
            case 5:
                return 31 * 2 + 30 + fre + days;
           // break;
            case 6:
                return 31 * 3 + 30 + fre + days;
            //break;
            case 7:
                return 31 * 3 + 30 * 2 + fre + days;
            //break;
            case 8:
                return 31 * 4 + 30 * 2 + fre + days;
            //break;
            case 9:
                return 31 * 5 + 30 * 2 + fre + days;
            //break;
            case 10:
                return 31 * 5 + 30 * 3 + fre + days;
            //break;
            case 11:
                return 31 * 6 + 30 * 3 + fre + days;
            //break;
            case 12:
                return 31 * 6 + 30 * 4 + fre + days;
            //break;
            default:
                System.out.println("error");
                return -1;
        }
    }
}

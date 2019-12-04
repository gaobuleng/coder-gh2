public class NumDay {
    public static void main(String[] args) {
        String s = "2019/11/28";
        System.out.println(days(s));
    }

    public static int days(String s) {

        String[] str = new String[3];
        int j = 0;
        for (String retval : s.split("/")) {
            str[j] = retval;
            j++;
        }
        int y = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int d = Integer.parseInt(str[2]);

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

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20 + x * 2;
        boolean flag = true;

        if (flag && (y > 30)) {
            x = x + 1;
        } else {
            x = 0;
        }

        while (x < 15) {
            System.out.println(x);
            x = x + 1;
            if (x == 13) {
                continue;
            }
            if (x == 14) {
                break;
            }
        }
    }
}

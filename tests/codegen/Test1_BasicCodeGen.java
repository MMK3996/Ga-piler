public class Main {
    public static void main(String[] args) {
        int x = 1 + 2 * 3;
        System.out.println(x); // Prints 7

        int i = 0;
        while (i < 5) {
            i = i + 1;
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i); // Prints 1, 3
        }
    }
}

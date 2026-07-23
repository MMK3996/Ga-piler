class Counter {
    static int val = 100;

    static void addVal(int n) {
        val = val + n;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Counter.val); // 100
        Counter.addVal(50);
        System.out.println(Counter.val); // 150
    }
}

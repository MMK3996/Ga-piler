class Dummy {}

public class Main {
    public static void main(String[] args) {
        Dummy d = new Dummy();
        System.out.println(d); // Error: System.out.println requires int or boolean argument
    }
}

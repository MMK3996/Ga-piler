class A extends B {}
class B extends C {}
class C extends A {} // Error: Cyclic inheritance detected

public class Main {
    public static void main(String[] args) {
    }
}

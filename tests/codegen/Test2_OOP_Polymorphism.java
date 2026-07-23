class Shape {
    int id;

    int computeVal(int base) {
        return base * 10;
    }
}

class Circle extends Shape {
    int radius;

    int computeVal(int base) {
        return base * 20; // Overridden method
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.id = 50;
        c.radius = 5;

        System.out.println(c.id); // Base field access: 50
        System.out.println(c.computeVal(2)); // Overridden call: 40

        Shape s = c; // Subtype casting
        System.out.println(s.computeVal(3)); // Polymorphic dispatch: 60
    }
}

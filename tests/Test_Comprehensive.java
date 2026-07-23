// Comprehensive AUJava Test Case covering all 275 points features:
// - OOP, Inheritance, Polymorphism & Method Overriding
// - Static Fields & Static Methods
// - Forward/Unordered Class Definitions
// - Variable Scope Shadowing
// - Control Flow (if-else, while, break, continue)
// - Arithmetic, Relational, Logical Expressions & Precedence
// - System.out.println

class Vehicle {
    int weight;
    static int vehicleCount = 0;

    static void incrementCount() {
        vehicleCount = vehicleCount + 1;
    }

    void setWeight(int w) {
        this.weight = w;
    }

    int calculateTax(int baseTax) {
        return baseTax + this.weight * 2;
    }
}

class Car extends Vehicle {
    boolean isElectric;
    Engine engine;

    void setEngine(Engine e) {
        this.engine = e;
    }

    // Overridden method from Vehicle
    int calculateTax(int baseTax) {
        if (this.isElectric) {
            return baseTax / 2;
        } else {
            return baseTax + this.weight * 3;
        }
    }
}

class Engine {
    int horsepower;

    void setHorsepower(int hp) {
        this.horsepower = hp;
    }

    int getHorsepower() {
        return this.horsepower;
    }
}

public class Main {
    public static void main(String[] args) {
        /*
           Multi-line comment testing
           Testing static fields and methods
        */
        Vehicle.incrementCount();
        Vehicle.incrementCount();
        System.out.println(Vehicle.vehicleCount); // Expected: 2

        Engine eng = new Engine();
        eng.setHorsepower(300);
        System.out.println(eng.getHorsepower()); // Expected: 300

        Car myCar = new Car();
        myCar.setWeight(1000);
        myCar.isElectric = false;
        myCar.setEngine(eng);

        // Inherited field access & overridden method call
        System.out.println(myCar.weight); // Expected: 1000
        System.out.println(myCar.calculateTax(500)); // Expected: 3500 (500 + 1000*3)

        myCar.isElectric = true;
        System.out.println(myCar.calculateTax(500)); // Expected: 250 (500 / 2)

        // Subtyping & Polymorphism dispatch
        Vehicle v = myCar;
        System.out.println(v.calculateTax(500)); // Expected: 250 (Polymorphic call to Car's calculateTax)

        // Arithmetic & Operator Precedence (1 + 2 * 3 = 7)
        int score = 1 + 2 * 3;
        System.out.println(score); // Expected: 7

        // Complex expressions & Logical / Relational operators
        boolean flag = (score == 7) && !(score < 5);
        if (flag) {
            System.out.println(1); // Expected: 1
        } else {
            System.out.println(0);
        }

        // Variable Scope Shadowing
        int counter = 10;
        {
            boolean counter = true; // Shadows outer int counter
            if (counter) {
                System.out.println(99); // Expected: 99
            }
        }
        System.out.println(counter); // Expected: 10 (Outer int counter)

        // Control Flow: while, break, continue
        int i = 0;
        while (i < 10) {
            i = i + 1;
            if (i == 2) {
                continue;
            }
            if (i == 5) {
                break;
            }
            System.out.println(i); // Expected: 1, 3, 4
        }
    }
}

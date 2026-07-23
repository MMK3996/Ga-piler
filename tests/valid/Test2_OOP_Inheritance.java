class Animal {
    int age;

    void setAge(int a) {
        this.age = a;
    }

    int getAge() {
        return this.age;
    }
}

class Dog extends Animal {
    static int dogCount = 0;
    boolean isFriendly;

    void speak() {
        System.out.println(101);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setAge(5);
        d.isFriendly = true;
        System.out.println(d.getAge());
    }
}

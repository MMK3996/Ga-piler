class Student {
    Teacher supervisor; // Forward reference to class Teacher defined later

    void setSupervisor(Teacher t) {
        this.supervisor = t;
    }
}

class Teacher {
    int id;
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        t.id = 1001;
        s.setSupervisor(t);

        int i = 100;
        {
            boolean i = true; // Scope shadowing
            if (i) {
                System.out.println(1);
            }
        }
        System.out.println(i);
    }
}

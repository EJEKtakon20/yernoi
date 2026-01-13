class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Takon";
        p.age = 20;

        p.display();
    }
}

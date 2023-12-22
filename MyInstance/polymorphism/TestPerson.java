package OOP.polymorphism;

public class TestPerson {
    public static void main(String[] args) {
        //创建三个对象，并调用register方法
        Student s = new Student();
        s.setName("Tom");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("Lisa");
        t.setAge(35);

        Administrator a = new Administrator();
        a.setName("Administrator");
        a.setAge(45);

        register(s);
        register(t);
        register(a);
    }

    public static void register(Person p) {
        p.show();
    }
}

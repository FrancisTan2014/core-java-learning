import java.util.ArrayList;

public class ListTest {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Francis", 28));
        list.add(new Employee("Tom", 28));
        list.add(new Employee("Bob", 28));
        System.out.println(list.size());
    }

}

class Employee {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
package az.babayev.javarush.javasyntax.lection11;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person) obj;

        if (this.age != person.age) {
            return false;
        }
        if (this.name == null) {
            return person.name == null;
        }
        return this.name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Zaur", 20);
        Person person2 = new Person("Zaur", 20);
        boolean equals = person2.equals(person1);
        System.out.println(equals);
        System.out.println(person2.name.hashCode());
    }
}

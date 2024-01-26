package az.babayev.javarush.javasyntax.task.task15.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int setName(String name) {
        if (name == null) {
            return -1;
        } else if (name.isEmpty()) {
            return -2;
        } else if (name.matches(".\\d.*")) {
            return -3;
        } else {
            this.name = name;
            return 0;
        }
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age < 0) {
            return -1;
        } else if (age > 150) {
            return -2;
        } else {
            this.age = age;
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
        // təkcə name yoxlanılacaqsa o zaman
        // return Objects.equals(name, user.name);
        // yazılmalıdır
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
        // təkcə name yoxlanılacaqsa o zaman
        // return Objects.hash(name);
        // yazılmalıdır
    }
}

class Solution {
    public static final String INPUT_NAME = "\nInput name: ";
    public static final String INPUT_AGE = "Input age user '%s': ";

    public static final String CANNOT_BE_NULL = "Name can not be null.";
    public static final String CANNOT_BE_EMPTY = "Name can not be empty.";
    public static final String CANNOT_CONTAIN_DIGIT = "Name can not contain digits.";
    public static final String CANNOT_BE_NEGATIVE = "Age can not be less than 0.";
    public static final String CANNOT_BE_TO_BIG = "Age can not be more than 150.";
    public static final String UNKNOWN_ERROR = "Unknown error.";

    public static final String FOUND = "\nUser '%s' found by index %d.\n";
    public static final String NOT_FOUND = "\nUser '%s' not found\n";

    static List<User> users = new ArrayList<>();
    static Scanner console = new Scanner(System.in);

    private static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = console.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(console.nextLine());

        int status = user.setName(name);
        if (status == -1) {
            System.out.println(CANNOT_BE_NULL);
        } else if (status == -2) {
            System.out.println(CANNOT_BE_EMPTY);
        } else if (status == -3) {
            System.out.println(CANNOT_CONTAIN_DIGIT);
        } else if (status != 0) {
            System.out.println(UNKNOWN_ERROR);
        }

        status = user.setAge(age);
        if (status == -1) {
            System.out.println(CANNOT_BE_NEGATIVE);
        } else if (status == -2) {
            System.out.println(CANNOT_BE_TO_BIG);
        } else if (status != 0) {
            System.out.println(UNKNOWN_ERROR);
        }
        users.add(user);
    }

    // bu metodun düzgün işləməsi üçün biz User klasımızda equals və hashcode metodlarını
    // düzgün override etməliyik. Əgər biz bu metoda təkcə name göndərəcəyiksə o zaman equals və hashcode
    // metodlarında yalnızca name qeyd olunmalıdır. əks halda bizə başqa hashcode qayıdacaq və biz false
    // cavabını alacağıq
    private static void findIndex(User user) {
        if (users.contains(user)) {
            System.out.printf(FOUND, user.getName(), users.indexOf(user));
        } else {
            System.out.printf(NOT_FOUND, user.getName());
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Mais");
        userToSearch.setAge(23);
        findIndex(userToSearch);
    }


}

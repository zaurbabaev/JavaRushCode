package az.babayev.javarush.javasyntax.lection13;

import java.util.Objects;

public class User extends java.lang.Object {
    private static long currentId = System.currentTimeMillis();
    private long id;
    private String name;
    private String password;
    protected String type;

    User() {
        this("NoName", "unknown");

    }

    User(String firstname, String password) {
        this.id = currentId++;
        this.name = firstname;
        this.password = password;
        this.type = "guest";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + name + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (!Objects.equals(name, user.name)) return false;
        if (!Objects.equals(password, user.password)) return false;
        return Objects.equals(type, user.type);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}

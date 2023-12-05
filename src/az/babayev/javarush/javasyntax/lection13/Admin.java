package az.babayev.javarush.javasyntax.lection13;

public class Admin extends User {
    public Admin() {
        this.type = "administrator";
    }

    public void setPassword(String password) {
        System.out.println(password + " skipped");
    }

    @Override
    public String toString() {
        return "Admin as " + super.toString();
    }
}

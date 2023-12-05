package az.babayev.javarush.javasyntax.lection13;

public class Customer extends User {
    public Customer() {
        this.type = "buyer";
    }

    public Customer(String customer, String password) {
        super(customer, password);
        this.type = "buyer";

    }

    @Override
    public String toString() {
        return "Customer as" + super.toString();
    }


}

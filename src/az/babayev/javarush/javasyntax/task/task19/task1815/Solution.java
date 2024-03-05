package az.babayev.javarush.javasyntax.task.task19.task1815;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        var accounts = new ArrayList<Account>(List.of(
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com")
        ));
        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        return accounts.stream().map(Account::getEmail);
    }
}

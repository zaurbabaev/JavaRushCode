package az.babayev.javarush.javasyntax.lection19.lambda.stream.animal;

import java.util.List;
import java.util.stream.Collectors;

public class SelectorWithStream {
    public static void main(String[] args) {

        Selector.initData();

        final List<String> findsName = Selector.owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .filter(pet -> Cat.class.equals(pet.getClass()))
                .filter(cat -> Color.FOXY == cat.getColor())
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .map(Animal::getName)
                .collect(Collectors.toList());

        findsName.forEach(System.out::println);
    }


}

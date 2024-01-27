package az.babayev.javarush.javasyntax.lection15.my_exception;

/*
у нас есть класс Собака — Dog.
Мы можем погулять с собакой с помощью метода walk().
Но перед этим нам нужно проверить, надеты ли на нашего питомца ошейник,
поводок и намордник. Если что-то из этого отсутствует,
выбросим собственное исключение DogIsNotReadyException.
 */
public class DogIsNotReadyException extends Exception {

    public DogIsNotReadyException(String message) {
        super(message);
    }
}

package az.babayev.javarush.javasyntax.lection15.my_exception;

public class Dog {

    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Ошейник надет!");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет!");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException {
        if (isMuzzlePutOn && isCollarPutOn && isLeashPutOn) {
            System.out.println("Ура, идем гулять! \"" +name+  "\" очень рад!");
        } else {
            throw new DogIsNotReadyException("Собака \"" + name + "\" не готова к прогулке! Проверьте экипировку!");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Tom");
        dog.putMuzzle();
        dog.putLeash();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! \nОшейник надет? " + dog.isCollarPutOn + "\nПоводок надет? "
                    + dog.isLeashPutOn + "\nНамордник надет? " + dog.isMuzzlePutOn);

        }
    }

}

package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.exception.dog;

public class Dog {

    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog jack = new Dog("Jack");
        jack.putCollar();
        jack.putLeash();
//        jack.putMuzzle();

        try {
            jack.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.format("Проверяем снаряжение! \nОшейник надет? %s \nПоводок надет? %s \nНамордник надет? %s \n",
                    jack.isCollarPutOn, jack.isLeashPutOn, jack.isMuzzlePutOn);
        }
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
        System.out.println("Собираемся на прогулку!");

        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("Ура, идем гулять! \" + name + \" очень рад!");

        } else {
            throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке! Проверьте экипировку!");
        }
    }

}

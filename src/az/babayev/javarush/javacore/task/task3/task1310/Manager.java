package az.babayev.javarush.javacore.task.task3.task1310;

public class Manager implements Boss{
    public void use(Person person) {
        person.startToWork();
    }

    public void startToWork() {

    }

    public boolean inspiresOthersToWork(){
        return true;
    }


}

package az.babayev.javarush.javacore.task.task4.task1418;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 1200;
    }

    @Override
    String getDescription() {
        return String.format("%s Моя страна %s. Я несу %d яиц в месяц.\n", super.getDescription(),
                Country.RUSSIA, getCountOfEggsPerMonth());
    }
}

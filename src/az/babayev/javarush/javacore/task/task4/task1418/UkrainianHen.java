package az.babayev.javarush.javacore.task.task4.task1418;

public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 2000;
    }

    @Override
    String getDescription() {
        return String.format("%s Моя страна %s. Я несу %d яиц в месяц.\n", super.getDescription(),
                Country.UKRAINE, getCountOfEggsPerMonth());
    }
}

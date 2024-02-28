package az.babayev.javarush.javacore.task.task5.task1530;

public abstract class DrinkMaker {

    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }

}

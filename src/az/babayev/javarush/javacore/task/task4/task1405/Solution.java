package az.babayev.javarush.javacore.task.task4.task1405;

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        if (food instanceof Food) {
            food.onSelect();
            food.onEat();
        }

    }

    public static void callSelectableMethods(Selectable selectable) {
        if (selectable instanceof Selectable) {
            selectable.onSelect();
        }
    }
}

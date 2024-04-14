package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection;

public class ForEachTest {
    public static void main(String[] args) {

        int[] grades = {5, 10, 7, 8, 9, 9, 10, 12};
        int highest_marks = bestGrade(grades);
        System.out.println("All the grades: ");
        printAllGrades(grades);
        System.out.format("The highest grade is %d \n", highest_marks);
        System.out.format("The average grade is %.2f \n", midGrade(grades));
    }

    public static void printAllGrades(int[] grades) {
        System.out.print("|");
        for (int num : grades) {
            System.out.print(num + "|");
        }
        System.out.println();
    }

    public static double midGrade(int[] grades) {
        int grade = 0;
        for (int num : grades) {
            grade += num;
        }
        return (double) grade / grades.length;
    }

    public static int bestGrade(int[] numbers) {

        int maxGrade = numbers[0];

        for (int number : numbers) {
            if (number > maxGrade) {
                maxGrade = number;
            }
        }
        return maxGrade;
    }


}

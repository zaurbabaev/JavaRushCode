package az.babayev.javarush.javasyntax.lection14.forEachEx;

public class ForEachExample1 {
    public static void main(String[] args) {
        int[] grades = {5, 10, 7, 8, 9, 9, 10, 12};
        System.out.println("All the grades: ");
        printAllGrades(grades);
        int highestGrade = bestGrade(grades);
        System.out.println("The highest grade is " + highestGrade);
        double midGrade = midGrade(grades);
        System.out.println("The average grade is " + midGrade);



    }

    public static void printAllGrades(int[] grades) {
        System.out.print("|");
        for (int grade : grades) {
            System.out.print(grade + "|");
        }
        System.out.println();
    }

    public static double midGrade(int[] grades) {
        int grade = 0;
        for (int i : grades) {
            grade += i;
        }
        return (double) grade / grades.length;
    }

    public static int bestGrade(int[] grade) {
        int maxGrade = grade[0];
        for (int number : grade) {
            if (number > maxGrade) {
                maxGrade = number;
            }
        }
        return maxGrade;
    }


}

package az.babayev.javarush.javacore.task.task5.task1521;

import java.math.BigDecimal;

public class Solution2 {
    public static void main(String[] args) {
        new Tree().info((Object) 4);
        new Tree().info((Object) (short) 4);
        new Tree().info((Object) Short.valueOf("4"));
        new Tree().info((Object) new BigDecimal("4"));

        new Tree().info(4);
        new Tree().info((short) 4);
        new Tree().info(new BigDecimal("4"));

        new Tree().info("4");
        new Tree().info(String.valueOf(4));
        new Tree().info(String.valueOf((short) 4));
        new Tree().info(new BigDecimal("4").toString());

    }
}

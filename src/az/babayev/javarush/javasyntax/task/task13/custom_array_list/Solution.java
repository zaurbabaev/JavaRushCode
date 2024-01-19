package az.babayev.javarush.javasyntax.task.task13.custom_array_list;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for (int i = 0; i < 35; i++) {
            arrayList.add("count" + i);
        }

        System.out.println(arrayList);


    }
}

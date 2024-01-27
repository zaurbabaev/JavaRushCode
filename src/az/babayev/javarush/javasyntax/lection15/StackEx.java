package az.babayev.javarush.javasyntax.lection15;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        // push - əlavə edir
        integers.push(1);
        integers.push(2);
        integers.push(3);
        System.out.println(integers);                   //[1,2,3]
        // pop son elementi bizə qaytarır və silir
        Integer pop = integers.pop();
        System.out.println(pop); // 3
        System.out.println(integers);                   //[1,2]
        // peek linkedlistin peekLast və peekFirst metodları kimidir
        // bizə sadəcə olaraq sonuncu elementi qaytarır (silmir)
        Integer peek = integers.peek();
        System.out.println(peek);                    //[2]
        System.out.println(integers);                //[1,2]

        integers.push(4);                         // 4 əlavə oldu [1,2,4]
        integers.pop();                                // 4 silindi qaldi [1,2]
        integers.pop();                                // 2 silindi qaldi [1]
        integers.push(6);                         // 6 əlavə olundu [1,6]
        integers.push(7);                        // 7 əlavə olundu [1,6,7]
        integers.push(7);                       // 7 əlavə olundu [1,6,7,7]
        integers.push(7);                      // 7 əlavə olundu [1,6,7,7,7]

        System.out.println(integers);
        // elementi axtarır varsa indexini  qaytarır yoxdursa -1.
        // size hesablanır bizim halımızda 5-dir. elementin indeksini tapırıq
        // massiv və ya listdəki kimi. 1-i axtarırıq 1 0ci elementdir.
        // search=(size-index)
        int search = integers.search(1);
        System.out.println(search); // 5 qaytarır

        boolean empty = integers.empty();
        System.out.println(empty); // false boş deyil
    }
}

package az.babayev.javarush.javacore.lection3;

import com.ctc.wstx.io.UTF8Writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass {
    private List<Integer> list = new ArrayList<>(Arrays.asList(
            111, 222, 333, 444, 555
    ));

    public void write(int data) {
        list.add(data);
    }

    public int read() {
        int first = list.get(0);
        list.remove(0);
        return first;
    }

    public int available() {
        return list.size();
    }

    public static void main(String[] args) throws IOException {
        MyClass myObject = new MyClass();
        try (FileOutputStream output = new FileOutputStream("resources//myclass.txt")) {
            while (myObject.available() > 0) {
                int real = myObject.read();
                output.write(real);
            }
            System.out.println("Done!");
        }

    }
}

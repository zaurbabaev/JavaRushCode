package az.babayev.javarush.javacore.task.task6.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {

        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        StringBuilder sb = new StringBuilder();

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                try {
                    sb.append(reader.readLine()).append(" ");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        private void printResult() {
            System.out.println(sb.toString());
        }
    }


}

//        @Override
//        public void run() {
//            try {
//               String result = String.join(
//                        " ", reader.readLine(), reader.readLine(), reader.readLine());
//                System.out.println(result);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
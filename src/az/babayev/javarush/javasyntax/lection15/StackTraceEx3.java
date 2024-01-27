package az.babayev.javarush.javasyntax.lection15;

public class StackTraceEx3 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement info : stackTrace) {
            System.out.println(info.getClassName());
            System.out.println(info.getMethodName());

            System.out.println(info.getFileName());
            System.out.println(info.getLineNumber());

            System.out.println(info.getModuleName());
            System.out.println(info.getModuleVersion());
            System.out.println("-".repeat(30));

        }
    }
}

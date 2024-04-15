package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.stacktrace;

public class StackTraceExample {
    public static void main(String[] args) {
        test();
        test2();
    }

    public static void test() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.println(element + " ");
        }
    }

    public static void test2(){
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.println(element.getClassName());
            System.out.println(element.getMethodName());

            System.out.println(element.getFileName());
            System.out.println(element.getLineNumber());

            System.out.println(element.getModuleName());
            System.out.println(element.getModuleVersion());
            System.out.println(element.getClassLoaderName());

            System.out.println("--------------------");

        }
    }
}

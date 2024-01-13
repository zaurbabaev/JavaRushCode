package az.babayev.javarush.javasyntax.task.task10;

/*
Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути,
полученном первым параметром метода, на версию, полученную вторым параметром,
и возвращал новый путь.
Версия jdk начинается со строки "jdk" и заканчивается на "/".

Пример:
путь — "/usr/java/jdk1.8/bin/"
версия jdk — "jdk-13"

Метод changePath(путь, версия jdk) должен вернуть путь — "/usr/java/jdk-13/bin/".
Метод main() не принимает участия в тестировании.
 */
public class RefreshPath {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int index = path.indexOf(jdk, '/');

        return path.replaceFirst("jdk[^/]*", jdk);
    }
}

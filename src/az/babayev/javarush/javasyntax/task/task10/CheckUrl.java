package az.babayev.javarush.javasyntax.task.task10;
/*
Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса,
полученного входящим параметром, и возвращает результат проверки — строку название сетевого протокола.
А метод checkDomain(String) проверяет, какой домен (com, net, org или ru) у URL-адреса,
полученного входящим параметром, и возвращает результат проверки — строку название домена.
Если URL-адрес начинается не с http или https, то результат будет — "неизвестный".
Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".
main не принимает участие в тестировании.
 */

public class CheckUrl {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        String s = "";
        if (url.startsWith("https")) {
            s = "https";
        } else if (url.startsWith("http")) {
            s = "http";
        } else {
            s = "неизвестный";
        }
        return s;
    }

    public static String checkDomain(String url) {
        String s = "";
        if (url.endsWith("com")) {
            s = "com";
        } else if (url.endsWith("ru")) {
            s = "ru";
        } else if (url.endsWith("org")) {
            s = "org";
        } else if (url.endsWith("net")) {
            s = "net";
        } else {
            s = "неизвестный";
        }
        return s;
    }
}


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

public class CheckUrl2 {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https") || url.startsWith("http")) {
            String[] protocol = url.split(":");
            return protocol[0];
        } else return "неизвестный";
    }

    public static String checkDomain(String url) {
        if (url.endsWith("com") || url.endsWith("ru") || url.endsWith("org") || url.endsWith("net")) {
            String[] domain = url.split("\\.");
            return domain[domain.length-1];
        } else {
            return "неизвестный";
        }
    }
}


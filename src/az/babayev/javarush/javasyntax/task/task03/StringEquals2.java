package az.babayev.javarush.javasyntax.task.task03;

/*
В методе main напиши код попарного сравнения по ссылке строк string1,
string2 и string3 с выводом соответствующего сообщения после каждого сравнения:
"ссылки на строки одинаковые" или "ссылки на строки разные".

Порядок сравнения должен быть следующим:
- строку string1 со строкой string2
- строку string2 со строкой string3
- строку string1 со строкой string3.
 */
public class StringEquals2 {

    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";
        System.out.println(string1 == string2 ? same : different);
        System.out.println(string2 == string3 ? same : different);
        System.out.println(string1 == string3 ? same : different);
    }
}

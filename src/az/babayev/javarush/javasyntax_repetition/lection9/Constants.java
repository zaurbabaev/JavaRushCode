package az.babayev.javarush.javasyntax_repetition.lection9;

public class Constants {
    public static final String MAIN_PAGE = "google.com";
    public static final String IMAGES = "/images";
    public static final String MUSIC = "/music";

    public static String printInfoFromSite(String site) {
        return "some random info from " + site;
    }

    public static void main(String[] args) {
        System.out.println(printInfoFromSite(MAIN_PAGE + IMAGES));
        System.out.println(printInfoFromSite(MAIN_PAGE + MUSIC));
    }


}

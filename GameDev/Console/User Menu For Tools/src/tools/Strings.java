package tools;

public class Strings {
    /*
     * This class deals with all
     */
    public static int count(String text, String l) {
        int n = 0;
        for (String L : text.split("")) {
            if (l.equals(L)) {
                n++;
            }
        }
        return n;
    }

    public static String repeat(String sentence, int n) {
        return "";
    }
}

public class Zadacha12 {

    public static void main(String[] args) {
        String str = "I like Java!!!";

        boolean x = str.contains("Java");
        boolean y = str.startsWith("I like");
        boolean z = str.endsWith("!!!");
        if (x & y & z) {
            String strUpper = str.toUpperCase();
            System.out.println(strUpper);
        }

        String strReplace = str.replace("a", "o");
        System.out.println(strReplace.substring(7, 11));
    }
}
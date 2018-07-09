public class BasicType {
    // \u005B\u005D = [], so the next line is correct
    // public static void main(String\u005B\u005D args) {
    public static void main(String[] args) {
        char a = 'A';
        final double PI = 3.141592653589793238462643383279;
        int n = 3 >>> 1;
        System.out.println(n);

        String words = "中国";
        System.out.println(words.codePointCount(0, words.length()));
    }
}
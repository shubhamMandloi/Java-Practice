package javaPrgm;

public class regPatter {
    public static void main(String[] args) {
        String input ="ABC123asc_A123#$@;";
        System.out.println(input.replaceAll("[A-Z_0-9^W]",""));

    }
}

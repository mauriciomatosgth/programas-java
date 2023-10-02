
public class Main {
    public static void main(String[] args) {

        String original = "abcde  ABCDEF FeRfGH abc ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2,9);
        String s06 = original.replace('a','x');
        String s07 = original.replace("abc","xy");
        int s08 = original.indexOf("bc");
        int s09 = original.lastIndexOf("bc");
        String[] s10 = original.split(" ");

        System.out.println("Original --- " + original);
        System.out.println("toLowerCase --- " + s01);
        System.out.println("toUpperCase --- " + s02);
        System.out.println("trim ---" + s03 + "---");
        System.out.println("substring(inicio) --- " + s04);
        System.out.println("substring(inicio e fim) --- " + s05);
        System.out.println("replace('a','x') --- " + s06);
        System.out.println("replace('abc','xy') --- " + s07);
        System.out.println("indexOf ('bc')--- " + s08);
        System.out.println("lastIndexOf ('bc')--- " + s09);
        System.out.println("split(' ')--- " + s10[0]);//so imprimi os elementos


    }
}
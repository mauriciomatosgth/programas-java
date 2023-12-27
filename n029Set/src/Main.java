import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");



        System.out.println(set.contains("Notebook"));

        for (String p :
             set) {
            System.out.println(p);
        }

        System.out.println();

        Set<String> sets = new TreeSet<>();

        sets.add("TV");
        sets.add("Notebook");
        sets.add("Tablet");


        System.out.println(sets.contains("Notebook"));

        for (String p :
                sets) {
            System.out.println(p);
        }


        System.out.println();
        Set<String> seta = new LinkedHashSet<>();

        seta.add("TV");
        seta.add("Notebook");
        seta.add("Tablet");

        seta.remove("Tablet");
        seta.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(seta.contains("Notebook"));

        for (String p :
                seta) {
            System.out.println(p);
        }

    }

}
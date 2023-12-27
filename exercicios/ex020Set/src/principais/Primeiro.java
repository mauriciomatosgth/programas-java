package principais;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Primeiro {
    public static void main(String[] args) {

        Set<Integer> cursoA = new TreeSet<>(Arrays.asList(21,35,22));

        Set<Integer> cursoB = new TreeSet<>(Arrays.asList(21,50));

        Set<Integer> cursoC = new TreeSet<>(Arrays.asList(42,35,13));


        Set<Integer> professor = new TreeSet<>(cursoA);
        professor.addAll(cursoB);
        professor.addAll(cursoC);

        System.out.println(professor.size());



    }
}

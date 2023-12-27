import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

        Object obj;
        Integer x = 10;
        obj = x;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List <String> myStrs = Arrays.asList("Maria","Alex", "Bob");
        printList(myStrs);
    }
    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
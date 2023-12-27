import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

       // list.add(20);// erro de compilação
//------------------------------------------------------------------//


        List<Object> myObj = new ArrayList<Object>();

        myObj.add("Maria");
        myObj.add("Alex");

        List<? super Number> myNums = myObj;

        myNums.add(10);
        myNums.add(3.14);

        //Number x = myNums.get(0);// erro de compilação


        //------------------------------------------------//
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static void copy(List<? extends Number> lista, List <? super Number> listaDestino){
        listaDestino.addAll(lista);
        //for(Number number: lista){
          //  listaDestino.add(number);
        //}
    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}

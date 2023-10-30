// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] vetor = new String[]{"Maria","Bob","Alex"};

        for(int i = 0; i < vetor.length;i++){
            System.out.println(vetor[i]);
        }

        for(String i : vetor){
            System.out.println(i);
        }

    }
}
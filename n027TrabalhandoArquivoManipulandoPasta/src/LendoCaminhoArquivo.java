import java.io.File;
import java.util.Scanner;

public class LendoCaminhoArquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre o caminho do Arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("Nome do arquivo : " + path.getName());
        System.out.println("Nome do caminho : " + path.getParent());
        System.out.println("Nome da Pasta : " + path.getPath());


    }
}

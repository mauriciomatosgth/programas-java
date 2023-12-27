import java.io.File;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho da pasta: ");
        String strPath = sc.nextLine();


        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");


        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");


        for (File file : files) {
            System.out.println(file);
        }


        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso : "+ success);














        sc.close();
    }
}
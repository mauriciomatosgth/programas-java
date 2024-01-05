import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String cam = "c:\\temp\\in.txt";
        Double salario = 2000.0;

        List<Funcionario> funcionario = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(cam))){
            String line = bf.readLine();

            while(line != null){

                String[] vetor = line.split(",");
                String nome = vetor[0];
                String email = vetor[1];
                Double salary = Double.parseDouble(vetor[2]);
                funcionario.add(new Funcionario(nome,email,salary));
                line = bf.readLine();
            }

            List<String> emails = funcionario.stream().filter(f -> f.getSalary() > salario ).map(Funcionario::getEmail).sorted().collect(Collectors.toList());
            emails.forEach(System.out::println);

            Double sum = funcionario.stream().filter(f -> f.getName().toUpperCase().charAt(0) == 'M').map(Funcionario::getSalary).reduce(0.0,Double::sum);

            System.out.printf("Total de salario de Funcionarios com letra M é : %.2f" , sum);


        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
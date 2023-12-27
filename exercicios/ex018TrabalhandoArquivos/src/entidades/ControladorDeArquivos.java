package entidades;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ControladorDeArquivos {


    private final List<Produto> lista = new ArrayList<>();

    //

    public List<Produto> getLista() {
        return lista;
    }

    // metodos

    public void lerArquivo(String arquivo){

        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))){

            String line = br.readLine();
            while(line != null){
                String[] vetor = line.split(",");
                lista.add(new Produto(vetor[0],Double.parseDouble(vetor[1]),Integer.parseInt(vetor[2])));
                line = br.readLine();

            }


        }
        catch(IOException e){
            System.out.println("ERROR : " + e.getMessage());
        }
    }



    public void gerarArquivo(String arquivo){
        boolean success = new File(arquivo + "\\out").mkdir();
        if(success){
            System.out.println("Pasta Criada com sucesso");
        }
        else{
            System.out.println("Problema ao Criar Pasta ou Pasta ja existe.");
        }
    }


    public void escreverArquivo(String arquivo){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo+"//out//summary.csv",true))){
            if(getLista() != null){
                for (Produto p: getLista()) {
                    bw.write(p.toString());// tambem pode ser escrito concatenado conseguindo assim colocar mais de um parametro
                    bw.newLine();
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}



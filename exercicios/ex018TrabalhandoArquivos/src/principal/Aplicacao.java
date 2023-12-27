package principal;

import entidades.ControladorDeArquivos;

import java.io.File;

public class Aplicacao {
    public static void main(String[] args) {
        ControladorDeArquivos controle = new ControladorDeArquivos();

        String caminho ="C:\\Users\\mauri\\OneDrive\\Documentos\\vendas\\vendas.csv";
        File caminhoCorreto = new File(caminho);
        String source = caminhoCorreto.getParent();


        controle.lerArquivo(caminho);

        controle.gerarArquivo(source);

        controle.escreverArquivo(source);
    }
}

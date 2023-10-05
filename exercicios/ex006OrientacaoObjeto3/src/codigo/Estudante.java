package codigo;

public class Estudante {
    public String nome;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public void avaliadorDeNotas(){

        double total = nota1 +nota2+nota3;
        if(total < 60.0){
            System.out.printf("FINAL GRADE = %.2f\nFALHOU\nFALTA %.2f PONTOS.",total,60-total);
        }
        else{
            System.out.printf("FINAL GRADE = %.2f\nPASSou.",total);
        }
    }
}

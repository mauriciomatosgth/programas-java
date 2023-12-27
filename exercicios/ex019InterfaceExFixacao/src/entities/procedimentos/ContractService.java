package entities.procedimentos;

import entities.Contrato;
import entities.Parcelas;


import java.time.LocalDate;


public class ContractService {

   private ServicoDePagamentoOnline servicoDePagamentoOnline;

    public ContractService(ServicoDePagamentoOnline servicoDePagamentoOnline) {
        this.servicoDePagamentoOnline = servicoDePagamentoOnline;
    }




    public void processoDeContrato(Contrato contrato, Integer meses){

        LocalDate data = contrato.getDate();


        double valorParcelas = contrato.getValorTotal()/meses;



        for(int i = 1; i<= meses;i++){

            data = data.plusMonths(1);

            contrato.getLista().add(new Parcelas(data,servicoDePagamentoOnline.taxaDePagamento(servicoDePagamentoOnline.juros(valorParcelas,i))));

        }


    }
}

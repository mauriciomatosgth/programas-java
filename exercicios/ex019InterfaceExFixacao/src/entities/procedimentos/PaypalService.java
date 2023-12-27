package entities.procedimentos;

public class PaypalService implements ServicoDePagamentoOnline{

    @Override
    public Double taxaDePagamento(Double amount) {
        return amount += (amount * 0.02);
    }

    @Override
    public Double juros(Double amount, Integer meses) {

        return amount += (amount * (0.01*meses));

    }
}

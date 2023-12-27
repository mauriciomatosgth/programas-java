package entities.procedimentos;

public interface ServicoDePagamentoOnline {
    public Double taxaDePagamento(Double amount);

    public Double juros(Double amount, Integer meses);

}

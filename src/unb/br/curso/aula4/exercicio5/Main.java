package unb.br.curso.aula4.exercicio5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessadorPagamento pgCartao = new PagamentoCartao();
        ProcessadorPagamento pgBoleto = new PagamentoBoleto();
        double pagamento = 100.0;
        pgCartao.processadorPagamento(pagamento);
        pgBoleto.processadorPagamento(pagamento);

	}

}

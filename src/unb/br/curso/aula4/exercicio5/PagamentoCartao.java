package unb.br.curso.aula4.exercicio5;

public class PagamentoCartao implements ProcessadorPagamento {

	@Override
	public double processadorPagamento(double valor) {
		// TODO Auto-generated method stub
		System.out.println("o pagamento via bolote é de: "+ valor);
		return valor;
	}
	

}

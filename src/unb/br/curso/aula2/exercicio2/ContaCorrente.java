package unb.br.curso.aula2.exercicio2;

public class ContaCorrente extends Conta {

	private double limite;

	public ContaCorrente(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void depositar(double valor) {
    	double saldoAtual = getSaldo();
            super.depositar(valor); //saldoConta += valor;
            System.out.println("Deposito realizado com sucesso.");
            System.out.println("Saldo atual: " + getSaldo());
       
    }
	
    public void sacar(double valor) {
    	double saldoAtual = getSaldo();
        if (saldoAtual+limite >= valor) {
            super.sacar(valor); //saldoConta -= valor;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo atual: " + getSaldo());
        } else {
        	System.out.println("Voc� n�o tem saldo suficiente.");
        	System.out.println("Saldo atual: " + getSaldo());
        }
    }
}

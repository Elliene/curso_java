package unb.br.curso.aula2.exercicio2;

public class Conta {
	private int numeroConta;
	private double saldoConta;

	public Conta(int inicializaNumero, double inicializaSaldo) {
		this.numeroConta = inicializaNumero;
		this.saldoConta = inicializaSaldo;
	}

	/*
	 * Modificado para atender o exercicio 5 public double depositar(double valor) {
	 * return saldoConta += valor;
	 * 
	 * }
	 */

	public void depositar(double valor) {
		  saldoConta += valor;

	}

	public void sacar(double valor) {

		saldoConta -= valor;
	}

	public int getNumero() {
		return numeroConta;
	}

	public void setNumero(int numero) {
		this.numeroConta = numero;
	}

	public double getSaldo() {
		return saldoConta;
	}

}

package unb.br.curso.aula2.exercicio5;

//import unb.br.curso.aula2.exercicio2.Conta;
import unb.br.curso.aula2.exercicio2.ContaCorrente;

public class CadastroContas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Conta universitaria = new Conta(1015249, 5000.00);
	//Conta vencimeto = new Conta(145788, 10000.00);
	ContaCorrente A = new ContaCorrente(1015249, 5000.00, 200);
	ContaCorrente B = new ContaCorrente(145788, 10000.00, 200);
	
	A.sacar(100);
	B.sacar(3000);
	A.depositar(10000);
	B.depositar(30000);
	
	
	}
 
}

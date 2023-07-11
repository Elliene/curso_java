package unb.br.curso.aula4.exercicio1;

public class Carro extends Veiculo{
	

	@Override
	public void acelerar(int velocidade) {
		// TODO Auto-generated method stub
		System.out.println("O carro chegou na velocidade maxima de " + velocidade +"KM/h ");
	}

	@Override
	public void frear() {
		// TODO Auto-generated method stub
		System.out.println("O carro freou!");
		
	}
	

}

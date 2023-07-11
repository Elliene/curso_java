package unb.br.curso.aula4.exercicio1;

public class Moto extends Veiculo {
	
	@Override
	public void acelerar(int velocidade) {
		// TODO Auto-generated method stub
		System.out.println("A moto chegou na velocidade maxima de " + velocidade + "KM/h ");
	}

	@Override
	public void frear() {
		// TODO Auto-generated method stub
		System.out.println("A moto freou!");
		
	}

}

package unb.br.curso.aula6.exercicio1;

public class Pilha<T> {

	private T[] elementos;
	private int topo;

	// Construtor que recebe o tamanho do array elementos como par�metro

	@SuppressWarnings("unchecked")

	public Pilha(int capacidade) {
		elementos = (T[]) new Object[capacidade];
		topo = -1;

	}

	// recebe um elemento e adiciona na pilha, se a pilha atingiu a capacidade
	// m�xima, ou seja o array est� completo, lance uma exce��o: throw new
	// IllegalStateException("A pilha est� cheia.");

	public void push(T elemento) {
		// chame o m�todo isFull() para testar se a pilha est� cheia
		// se n�o estiver cheia adicione o elemento ao array e atualize o topo
		if (isFull()) {
			throw new IllegalStateException("A pilha esta cheia");
		}
		elementos[++topo] = elemento;

	}

	// retira um elemento do topo da pilha, se a pilha estiver vazia lance uma
	// exce��o: throw new IllegalStateException("A pilha est� vazia.");

	public T pop() {
		// chame o m�todo isEmpty() para verificar se a pilha est� vazia
		// se n�o estiver vazia retorne o elemento do topo, remova o elemento do array e atualize o topo
		if (isEmpty()) {
			throw new IllegalStateException("A pilha esta vazia");
		}

		// chame o m�todo isFull() para testar se a pilha est� cheia
		// se n�o estiver cheia adicione o elemento ao array e atualize o topo
		T elemento = elementos[topo];
		elementos[topo] = null;
		topo = topo - 1;
		return elemento;

	}

	// retorna o elemnto do topo sem remover do array, se a pilha estiver vazia
	// lance uma exce��o: throw new IllegalStateException("A pilha est� vazia.");
	public T peek() {

		if (isEmpty()) {
			throw new IllegalStateException("A pilha est� vazia.");
		}
		return elementos[topo];

	}

	// m�todo que checa se a pilha est� vazia

	public boolean isEmpty() {
		return topo == -1;
	}

	// m�todo que checa se a pilha est� cheia
	public boolean isFull() {
		return topo == elementos.length - 1;

	}

	// retorna quantos elementos est�o na pilha, n�o � o tamanho do array
	public int size() {
		return topo + 1;

	}

}
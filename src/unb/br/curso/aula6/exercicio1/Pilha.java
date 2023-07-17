package unb.br.curso.aula6.exercicio1;

public class Pilha<T> {

	private T[] elementos;
	private int topo;

	// Construtor que recebe o tamanho do array elementos como parâmetro

	@SuppressWarnings("unchecked")

	public Pilha(int capacidade) {
		elementos = (T[]) new Object[capacidade];
		topo = -1;

	}

	// recebe um elemento e adiciona na pilha, se a pilha atingiu a capacidade
	// máxima, ou seja o array está completo, lance uma exceção: throw new
	// IllegalStateException("A pilha está cheia.");

	public void push(T elemento) {
		// chame o método isFull() para testar se a pilha está cheia
		// se não estiver cheia adicione o elemento ao array e atualize o topo
		if (isFull()) {
			throw new IllegalStateException("A pilha esta cheia");
		}
		elementos[++topo] = elemento;

	}

	// retira um elemento do topo da pilha, se a pilha estiver vazia lance uma
	// exceção: throw new IllegalStateException("A pilha está vazia.");

	public T pop() {
		// chame o método isEmpty() para verificar se a pilha está vazia
		// se não estiver vazia retorne o elemento do topo, remova o elemento do array e atualize o topo
		if (isEmpty()) {
			throw new IllegalStateException("A pilha esta vazia");
		}

		// chame o método isFull() para testar se a pilha está cheia
		// se não estiver cheia adicione o elemento ao array e atualize o topo
		T elemento = elementos[topo];
		elementos[topo] = null;
		topo = topo - 1;
		return elemento;

	}

	// retorna o elemnto do topo sem remover do array, se a pilha estiver vazia
	// lance uma exceção: throw new IllegalStateException("A pilha está vazia.");
	public T peek() {

		if (isEmpty()) {
			throw new IllegalStateException("A pilha está vazia.");
		}
		return elementos[topo];

	}

	// método que checa se a pilha está vazia

	public boolean isEmpty() {
		return topo == -1;
	}

	// método que checa se a pilha está cheia
	public boolean isFull() {
		return topo == elementos.length - 1;

	}

	// retorna quantos elementos estão na pilha, não é o tamanho do array
	public int size() {
		return topo + 1;

	}

}
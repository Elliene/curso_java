package aula7calculadoraframework;
/**
 *
 * @author jean
 */
public class Percent extends Operacao {

    public Percent(Nodo esquerda, Nodo direita) {
        super(esquerda, direita);
    }

    @Override
    protected int executa(int esquerda, int direita) {
        return (esquerda * direita)/100;
    }

    @Override
    protected String simbolo() {
        return "%";
    }

}

package unb.br.curso.aula8.exercicio3;

import java.util.ArrayList;
import java.util.List;

// Elemento gr�fico composto: Grupo
class Grupo implements ElementoGrafico {
    private List<ElementoGrafico> elementos = new ArrayList<>();

    public void adicionarElemento(ElementoGrafico elemento) {
        elementos.add(elemento);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um grupo:");
        for (ElementoGrafico elemento : elementos) {
            elemento.desenhar();
        }
    }
}

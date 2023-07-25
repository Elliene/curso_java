package unb.br.curso.aula8.exercicio3;

public class ExemploComposite {
    public static void main(String[] args) {
        // Criando elementos gr�ficos primitivos
        ElementoGrafico circulo = new Circulo();
        ElementoGrafico retangulo = new Retangulo();

        // Criando um grupo e adicionando elementos gr�ficos primitivos
        Grupo grupo1 = new Grupo();
        grupo1.adicionarElemento(circulo);
        grupo1.adicionarElemento(retangulo);

        // Criando mais elementos gr�ficos primitivos
        ElementoGrafico outroCirculo = new Circulo();


        // Criando outro grupo e adicionando elementos gr�ficos primitivos
        Grupo grupo2 = new Grupo();
        grupo2.adicionarElemento(outroCirculo);


        // Criando um grupo principal e adicionando os dois grupos anteriores
        Grupo grupoPrincipal = new Grupo();
        grupoPrincipal.adicionarElemento(grupo1);
        grupoPrincipal.adicionarElemento(grupo2);

        // Desenhando toda a estrutura
        grupoPrincipal.desenhar();
    }
}


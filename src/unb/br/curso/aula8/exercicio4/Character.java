package unb.br.curso.aula8.exercicio4;

//Character.java (Classe de contexto - personagem)
public class Character {
 private String name;
 private AttackStrategy attackStrategy;

 public Character(String name) {
     this.name = name;
 }

 public void setAttackStrategy(AttackStrategy attackStrategy) {
     this.attackStrategy = attackStrategy;
 }

 public void performAttack() {
     System.out.println(name + " está pronto para atacar.");
     attackStrategy.attack();
 }
}


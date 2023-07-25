package unb.br.curso.aula8.exercicio4;

public class utilizaStrategy {
    public static void main(String[] args) {
        Character warrior = new Character("Guerreiro");
        Character archer = new Character("Arqueiro");
        Character mage = new Character("Mago");

        AttackStrategy swordAttack = new SwordAttack();
        AttackStrategy bowAndArrowAttack = new BowAndArrowAttack();
        AttackStrategy magicAttack = new MagicAttack();

        warrior.setAttackStrategy(swordAttack);
        archer.setAttackStrategy(bowAndArrowAttack);
        mage.setAttackStrategy(magicAttack);

        warrior.performAttack();
        archer.performAttack();
        mage.performAttack();
    }
}

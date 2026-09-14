public class Main {
    
    public static void main(String[] args) {

        SimpleEnemyFactory factory = new SimpleEnemyFactory();

        enemy skeleton = factory.createEnemy("skeleton");
        enemy goblin = factory.createEnemy("goblin");

        goblin.attack();
        skeleton.attack();
    }
}

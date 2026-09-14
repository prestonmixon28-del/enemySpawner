public class ForestSpawner extends EnemySpawner {

    @Override
    protected enemy createEnemy(String type) {
        if (type.equalsIgnoreCase("wolf")) {
            return new wolf();
        } else if (type.equalsIgnoreCase("goblin")) {
            return new goblin();
        } else {
            return null; // Return null if the type is not recognized
        }
    }
    
}

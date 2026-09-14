public class SimpleEnemyFactory {
    public enemy createEnemy(String type) {
        if (type.equalsIgnoreCase("skeleton")) {
            return new skeleton();
        } else if (type.equalsIgnoreCase("goblin")) {
            return new goblin();
        } else {
           return null; // Return null if the type is not recognized
        }
    }
}
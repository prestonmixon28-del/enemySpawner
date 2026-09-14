public class DungeonSpawner extends EnemySpawner {

    @Override 
    protected enemy createEnemy(String type) {
        if (type.equals("skeleton")) {
            return new skeleton();
        } else if (type.equals("slime")) {
            return new slime();
        }

            return null; // Return null if the type is not recognized
        
    }
    
}

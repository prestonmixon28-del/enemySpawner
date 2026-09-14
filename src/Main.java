public class Main {
    
    public static void main(String[] args) {

        EnemySpawner Forest = new ForestSpawner();
        EnemySpawner Dungeon = new DungeonSpawner();

        enemy wolf = Forest.spawnEnemy("wolf");
        enemy goblin = Forest.spawnEnemy("goblin");


        enemy skeleton = Dungeon.spawnEnemy("skeleton");
        enemy slime = Dungeon.spawnEnemy("slime");

        wolf.attack();
        goblin.attack();
        skeleton.attack();
        slime.attack();

    }
}

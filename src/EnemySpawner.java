public abstract class EnemySpawner {

    protected abstract enemy createEnemy(String type);

    public enemy spawnEnemy(String type) {
        System.out.println("Spawning enemy of type: " + type);
        return createEnemy(type);
    }
}
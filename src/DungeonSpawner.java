public class DungeonSpawner extends EnemySpawner {

    private final EquipmentFactory equipmentFactory = new WarriorEquipmentFactory();

    @Override 
    protected enemy createEnemy(String type) {
        if (type.equals("skeleton")) {
            return new skeleton(equipmentFactory);
        } else if (type.equals("slime")) {
            return new slime(equipmentFactory);
        }

            return null; // Return null if the type is not recognized
        
    }
    
}

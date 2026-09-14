public class ForestSpawner extends EnemySpawner {

    private final EquipmentFactory equipmentFactory =new WarriorEquipmentFactory();

    @Override
    protected enemy createEnemy(String type) {
        if (type.equalsIgnoreCase("wolf")) {
            return new wolf(equipmentFactory);
        } else if (type.equalsIgnoreCase("goblin")) {
            return new goblin(equipmentFactory);
        } else {
            return null; // Return null if the type is not recognized
        }
    }
    
}

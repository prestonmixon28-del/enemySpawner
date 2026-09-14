public class SimpleEnemyFactory {

    private EquipmentFactory equipmentFactory;
    
    public SimpleEnemyFactory(EquipmentFactory equipmentFactory) {
        this.equipmentFactory = equipmentFactory;
    }

    public enemy createEnemy(String type) {
        if (type.equalsIgnoreCase("skeleton")) {
            return new skeleton(equipmentFactory);
        } else if (type.equalsIgnoreCase("goblin")) {
            return new goblin(equipmentFactory);
        } else {
           return null; // Return null if the type is not recognized
        }
    }
}
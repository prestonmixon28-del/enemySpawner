public abstract class enemy {

    public abstract void attack();

    protected weapon weapon;
    protected armor armor;

    public enemy(EquipmentFactory equipmentFactory) {
        this.weapon = equipmentFactory.createWeapon();
        this.armor = equipmentFactory.createArmor();
    }
    
}

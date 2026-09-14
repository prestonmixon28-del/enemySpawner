public class WarriorEquipmentFactory implements EquipmentFactory {

    @Override
    public weapon createWeapon() {
        return new sword();
    }

    @Override
    public armor createArmor() {
        return new plateArmor();
    }
    
}

public class MageEquipmentFactory implements EquipmentFactory {

    @Override
    public weapon createWeapon() {
        return new staff();
    }

    @Override
    public armor createArmor() {
        return new robe();
    }
    
}

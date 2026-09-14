public class skeleton extends enemy {

    public skeleton(EquipmentFactory equipmentFactory) {
        super(equipmentFactory);
    }

    @Override
    public void attack() {
        System.out.println("The skeleton attacks with a sword!" + weapon.getDescription() + " and wears " + armor.getDescription());
    }
}

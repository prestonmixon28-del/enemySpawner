public class slime extends enemy {

    public slime(EquipmentFactory equipmentFactory) {
        super(equipmentFactory);
    }
    @Override
    public void attack() {
        System.out.println("The slime attacks with a gooey splash!" + weapon.getDescription() + " and wears " + armor.getDescription());
    }
}

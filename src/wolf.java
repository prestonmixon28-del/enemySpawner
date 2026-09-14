public class wolf extends enemy {

    public wolf(EquipmentFactory equipmentFactory) {
        super(equipmentFactory);
    }

    @Override 
    public void attack() {
        System.out.println("The wolf attacks with a fierce bite!" + weapon.getDescription() + " and wears " + armor.getDescription());
    }
    
}

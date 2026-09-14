public class goblin extends enemy {

    public goblin(EquipmentFactory equipmentFactory) {
        super(equipmentFactory);
    }

    @Override 
    public void attack() {
        System.out.println("The goblin attacks with a club!" + weapon.getDescription() + " and wears " + armor.getDescription());
    }
    
}

public class Main {
    
    public static void main(String[] args) {

        EquipmentFactory warrior = new WarriorEquipmentFactory();
        EquipmentFactory mage = new MageEquipmentFactory();

        weapon warriorWeapon = warrior.createWeapon();
        armor warriorArmor = warrior.createArmor();

        weapon mageWeapon = mage.createWeapon();
        armor mageArmor = mage.createArmor();

        System.out.println("warrior: " + warriorWeapon.getDescription());
        System.out.println("warrior: " + warriorArmor.getDescription());

        System.out.println("mage: " + mageWeapon.getDescription());
        System.out.println("mage: " + mageArmor.getDescription());

    }
}

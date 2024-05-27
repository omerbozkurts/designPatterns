public class Main {
    public static void main(String[] args) {

        Mage mage = new Mage(new DefensiveCombat());
        System.out.println(mage.performFight());

        mage.setCombatStrategy(new AggressiveCombat());
        System.out.println(mage.performFight());

        Warior warior = new Warior();
        warior.setCombatStrategy(new AggressiveCombat());

        System.out.println(warior.performFight());

        warior.setCombatStrategy(new DefensiveCombat());

        System.out.println(warior.performFight());
    }
}
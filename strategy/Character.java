public abstract class Character {
    private ICombatStrategy combatStrategy;

    public Character(){}

    public Character(ICombatStrategy combatStrategy){
        this.combatStrategy = combatStrategy;
    }

    public void setCombatStrategy(ICombatStrategy combatStrategy) {
        this.combatStrategy = combatStrategy;
    }

    public String performFight(){
        return combatStrategy.fight();
    }

}

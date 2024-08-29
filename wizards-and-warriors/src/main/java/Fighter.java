class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{

    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable(){
        return false;
    }
    
    @Override
    public int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable()? 10:6;
    }
}
// TODO: define the Wizard class
class Wizard extends Fighter{
    private boolean spellCharge = false;

    public String toString(){
        return "Fighter is a Wizard";
    }
    public void prepareSpell(){
        spellCharge = true; 
    }

    @Override
    public boolean isVulnerable(){
        return !spellCharge;
    }
    @Override
    public int getDamagePoints(Fighter fighter){
        return spellCharge? 12:3;
    }
}


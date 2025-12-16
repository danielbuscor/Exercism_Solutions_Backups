class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
    
    
}

// TODO: define the Warrior class
class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {
    private boolean activeSpell = false;

    public void setActiveSpell(boolean activeSpell) {
        this.activeSpell = activeSpell;
    }

    @Override
    boolean isVulnerable() {
        return !this.activeSpell;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        setActiveSpell(true);
    }
    @Override
    int getDamagePoints(Fighter fighter) {
        if (this.activeSpell) {
            return 12;
        } else {
            return 3;
        }
    }
}
public abstract class Character {
    WeaponBehavior weapon;
    
    public void useWeapon(){
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        weapon = w;
    }

    public abstract void fight();
}

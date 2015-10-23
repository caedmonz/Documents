public class Knight extends Character {
    public Knight() {
        weapon = new KnifeBehavior();
    }
    public void fight(){
        System.out.println("Knight fight");
        useWeapon();
    }
}

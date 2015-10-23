public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }
    
    public void fight(){
        System.out.println("Queen fight");
        useWeapon();
    }
}

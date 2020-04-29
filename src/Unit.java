public class Unit {
    private int hp;

    public int getHP() {
        return hp;
    }

    public Unit(int hp) {
        this.hp = hp;
    }

    public void getDamaged(int damage){
        while (damage > 0 && hp > 0){
            damage--;
            hp--;
        }
    }
}

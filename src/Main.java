import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Unit m1 = new Marine();
        Unit f1 = new Firebat();


        getDamagedSeveralTimes(m1, 3);
        getDamagedSeveralTimes(f1, 3);

        Unit[] units = new Unit[2];
        units[0] = new Marine();
        units[1] = new Firebat();
        for (int i = 0; i < units.length; i++) {
            units[i].getDamaged(2);
        }
    }

    private static void getDamagedSeveralTimes(Unit unit, int times) {
        Random random = new Random();

        for (int i = 0; i < times; i++) {
            int damage = random.nextInt(3) + 1;
            unit.getDamaged(damage);

            if (unit.getHP() == 0)
            {
                System.out.println("dead");
                break;
            }
            else
            {
                System.out.println(unit.getHP());
            }
        }
    }


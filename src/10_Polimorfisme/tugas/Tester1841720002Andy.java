package tugas;

public class Tester1841720002Andy {

    public static void main(String[] args) {
        WalkingZombie1841720002Andy wz = new WalkingZombie1841720002Andy(100, 1);
        JumpingZombie1841720002Andy jz = new JumpingZombie1841720002Andy(100, 2);
        Barrier1841720002Andy b = new Barrier1841720002Andy(100);
        Plant1841720002Andy p = new Plant1841720002Andy();
        System.out.println("" + wz.getZombieInfoAndy());
        System.out.println("" + jz.getZombieInfoAndy());
        System.out.println("" + b.getBarrierInfoAndy());
        System.out.println("-----------------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println("" + wz.getZombieInfoAndy());
        System.out.println("" + jz.getZombieInfoAndy());
        System.out.println("" + b.getBarrierInfoAndy());
    }
}

package tugas;

public class Plant1841720002Andy {

    public void doDestroy(IDestroyable1841720002Andy d) {
        if (d instanceof WalkingZombie1841720002Andy) {
            WalkingZombie1841720002Andy wz = (WalkingZombie1841720002Andy) d;
            wz.destroyedAndy();
        } else if (d instanceof JumpingZombie1841720002Andy) {
            JumpingZombie1841720002Andy jz = (JumpingZombie1841720002Andy) d;
            jz.destroyedAndy();
        } else if (d instanceof Barrier1841720002Andy) {
            Barrier1841720002Andy b = (Barrier1841720002Andy) d;
            b.destroyedAndy();
        }
    }
}

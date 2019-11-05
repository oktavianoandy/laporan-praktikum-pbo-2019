package tugas;

public abstract class Zombie1841720002Andy implements IDestroyable1841720002Andy {

    protected int mHealth;
    protected int mLevel;

    public abstract void healAndy();

    @Override
    public abstract void destroyedAndy();

    public String getZombieInfoAndy() {
        String mStatus = "Health = " + mHealth + "\n" + ""
                + "Level = " + mLevel + "\n";
        return mStatus;
    }

}

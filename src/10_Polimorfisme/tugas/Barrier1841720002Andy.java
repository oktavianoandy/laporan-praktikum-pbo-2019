package tugas;

public class Barrier1841720002Andy implements IDestroyable1841720002Andy {

    private int mStrength;

    public Barrier1841720002Andy(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getStrengthAndy() {
        return mStrength;
    }

    public void setStrengthAndy(int mStrength) {
        this.mStrength = mStrength;
    }

    @Override
    public void destroyedAndy() {
        this.mStrength -= this.mStrength * 0.1;
    }

    public String getBarrierInfoAndy() {
        String mInfo = "Barier Strength = " + mStrength + "\n";
        return mInfo;
    }
}

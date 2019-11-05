package tugas;

public class WalkingZombie1841720002Andy extends Zombie1841720002Andy {

    public WalkingZombie1841720002Andy(int mHealth, int mLevel) {
        this.mHealth = mHealth;
        this.mLevel = mLevel;
    }

    @Override
    public void healAndy() {
        if (this.mLevel == 1) {
            mHealth += mHealth * 0.2;
        } else if (this.mLevel == 2) {
            mHealth += mHealth * 0.3;
        } else if(this.mLevel == 3){
            mHealth += mHealth * 0.4;
        } 
    }

    @Override
    public void destroyedAndy() {
        this.mHealth -= this.mHealth * 20 / 100;
    }

    @Override
    public String getZombieInfoAndy() {
        String mInfo = "Walking Zombie Data = \n" + super.getZombieInfoAndy();
        return mInfo;
    }
    
}

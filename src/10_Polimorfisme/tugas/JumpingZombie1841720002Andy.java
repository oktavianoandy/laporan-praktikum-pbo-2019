package tugas;

public class JumpingZombie1841720002Andy extends Zombie1841720002Andy {

    public JumpingZombie1841720002Andy(int mHealth, int mLevel) {
        this.mHealth = mHealth;
        this.mLevel = mLevel;
    }

    @Override
    public void healAndy() {
        if (this.mLevel == 1) {
            mHealth += mHealth * 0.3;
        } else if (this.mLevel == 2) {
            mHealth += mHealth * 0.4;
        } else if(this.mLevel == 3){
            mHealth += mHealth * 0.5;
        } 
    }

    @Override
    public void destroyedAndy() {
        this.mHealth -= this.mHealth * 10 / 100;
    }

    @Override
    public String getZombieInfoAndy() {
        String mInfo = "Jumping Zombie Data = \n" + super.getZombieInfoAndy();
        return mInfo;
    }

}

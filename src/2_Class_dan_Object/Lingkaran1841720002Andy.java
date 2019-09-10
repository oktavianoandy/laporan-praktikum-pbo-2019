package lingkaran;

public class Lingkaran1841720002Andy 
{
    public double phi;
    public double r;

    public Lingkaran1841720002Andy(double r) {
        this.phi = 3.14;
        this.r = r;
    }
    
    public double hitungLuasLingkaranAndy()
    {
        double mLuasLingkaran = phi*r*r;
        return mLuasLingkaran;
    }
    
    public double hitungKelilingLingkaranAndy(){
        double mKelilingLingkaran = 2*phi*r;
        return mKelilingLingkaran;
    }
    
}

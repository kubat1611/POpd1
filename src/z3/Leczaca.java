package z3;

public class Leczaca extends Postac{
    protected int mana;

    public int getMana(){
        return mana;
    }

    public void wylecz(Postac postac){
        if(mana >= 10){
            mana -= 10;
            postac.punktyZycia += 200;
        }
    }

    public void atakuj(Postac postac){
        postac.punktyZycia -= 1;
    }
}

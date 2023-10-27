package z1;

public final class Pracownik {
    private Pracownik przelozony;
    private int pensja;

    public Pracownik(Pracownik przelozony){
        this.przelozony = przelozony;
        this.pensja = 3600;
    }

    public Pracownik(Pracownik przelozony, int pensja){
        this.przelozony = przelozony;
        this.pensja = pensja;
    }

    public int getPensja(){
        return this.pensja;
    }

    public Pracownik getPrzelozony(){
        return this.przelozony;
    }
}
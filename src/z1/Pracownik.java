package z1;

public class Pracownik {
    private final Pracownik przelozony;
    private final int pensja;

    public Pracownik(Pracownik przelozony, int pensja) {
        this.przelozony = przelozony;
        this.pensja = pensja;
    }

    public int getPensja() {
        return pensja;
    }

    public Pracownik getPrzelozony() {
        return przelozony;
    }
}

package z2;

public class Zwierze {
    private int ileNog;
    private int wiek;
    private String imie;

    public Zwierze(int ileNog, int wiek, String imie) {
        this.ileNog = ileNog;
        this.wiek = wiek;
        this.imie = imie;
    }

    public int getIleNog() {
        return ileNog;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public String dajGlos() {
        return "Brak dźwięku";
    }
}

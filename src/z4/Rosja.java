package z4;

import java.util.ArrayList;
import java.util.List;

public class Rosja implements PanstwoAzjatyckie {
    private Kontynent kontynent = Kontynent.AZJA;
    private int liczbaLudnosci = 143400000;
    private String stolica = "Moskwa";
    private List<Panstwo> sasiedzi = new ArrayList<>();

    @Override
    public Kontynent getKontynent() {
        return kontynent;
    }

    @Override
    public int getLiczbaLudnosci() {
        return liczbaLudnosci;
    }

    @Override
    public String getStolica() {
        return stolica;
    }

    @Override
    public List<Panstwo> getSasiedzi() {
        return sasiedzi;
    }

    @Override
    public void dodajSasiada(Panstwo sasiad) {
        sasiedzi.add(sasiad);
    }

    @Override
    public void migruj(Panstwo docelowePanstwo, int liczbaMigrantow) {
        this.liczbaLudnosci -= liczbaMigrantow;
        docelowePanstwo.setLiczbaLudnosci(docelowePanstwo.getLiczbaLudnosci() + liczbaMigrantow);
    }

    @Override
    public void setLiczbaLudnosci(int i) {
        this.liczbaLudnosci = i;
    }
}

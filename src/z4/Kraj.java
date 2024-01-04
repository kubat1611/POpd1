package z4;

import java.util.ArrayList;
import java.util.List;

public class Kraj implements PanstwoEuropejskie, PanstwoAzjatyckie {
    private Kontynent kontynent;
    private int liczbaLudnosci;
    private String stolica;
    private List<Panstwo> sasiedzi;

    public Kraj(Kontynent kontynent, int liczbaLudnosci, String stolica) {
        this.kontynent = kontynent;
        this.liczbaLudnosci = liczbaLudnosci;
        this.stolica = stolica;
        this.sasiedzi = new ArrayList<>();
    }

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

    }

    @Override
    public void setLiczbaLudnosci(int i) {

    }
}

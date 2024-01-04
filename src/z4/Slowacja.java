package z4;

import java.util.ArrayList;
import java.util.List;

public class Slowacja implements PanstwoEuropejskie {
    private Kontynent kontynent = Kontynent.EUROPA;
    private int liczbaLudnosci = 5450000;
    private String stolica = "Bratysława";
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

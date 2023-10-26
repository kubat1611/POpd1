package z4;

import java.util.ArrayList;
import java.util.List;

public class Rosja implements PanstwoAzjatyckie {
    private Kontynent kontynent = Kontynent.AZJA;
    private int liczbaLudnosci = 146599183; // Przykładowa liczba ludności
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

    }
}

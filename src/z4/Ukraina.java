package z4;

import java.util.ArrayList;
import java.util.List;

public class Ukraina implements PanstwoEuropejskie, PanstwoAzjatyckie {
    private Kontynent kontynent = Kontynent.EUROPA;
    private int liczbaLudnosci = 41902416; // Przykładowa liczba ludności
    private String stolica = "Kijów";
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
        // Implementacja migrowania ludności
    }
}

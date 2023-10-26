package z4;

import java.util.ArrayList;
import java.util.List;

public class Bialorus implements PanstwoEuropejskie {
    private Kontynent kontynent = Kontynent.EUROPA;
    private int liczbaLudnosci = 9466000; // Przykładowa liczba ludności
    private String stolica = "Mińsk";
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
}

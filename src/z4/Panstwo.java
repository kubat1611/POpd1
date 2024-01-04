package z4;

import java.util.List;

public interface Panstwo {
    Kontynent getKontynent();
    int getLiczbaLudnosci();
    String getStolica();
    List<Panstwo> getSasiedzi();
    void dodajSasiada(Panstwo sasiad);
    void migruj(Panstwo docelowePanstwo, int liczbaMigrantow);
    void setLiczbaLudnosci(int i);
}
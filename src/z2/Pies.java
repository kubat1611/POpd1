package z2;

public class Pies extends Zwierze implements ImienneZwierze {

    public Pies(int wiek, String imie) {
        super(4, wiek, imie);
    }

    @Override
    public String dajGlos() {
        return "Hau hau";
    }
}

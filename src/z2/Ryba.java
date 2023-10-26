package z2;

public class Ryba extends Zwierze {

    public Ryba(int wiek) {
        super(0, wiek, "Anonimowa ryba");
    }

    @Override
    public String dajGlos() {
        return "Bul bul";
    }
}

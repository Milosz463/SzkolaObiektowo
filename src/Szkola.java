import java.util.ArrayList;

public class Szkola {
    /*
    Singleton dozwolony tylko jeden obiekt tej klasy
     */
    private String nazwaSzkoly;
    private static Szkola szkola = new Szkola();
    private ArrayList<uczen> uczniowie = new ArrayList<>();
    private ArrayList<Klasa> klasa = new ArrayList<>();

    private Szkola() {
        //prywatny konstrutkor jest dostepbny tylko w tej klasie

    }
    public static Szkola getSzkola(){
        return szkola;
    }

    public void dodajUcziaDoSzkoly(String imie, String nazwisko){
        uczen uczen = new uczen(imie, nazwisko);
        uczniowie.add(uczen);
    }

    public void dodajKlase (String nazwa){
        klasa.add(new Klasa(nazwa));
    }

    public void dodajKlase(Klasa klasa){
        klasa.add(klasa);
    }

    public void dodajUczniaDoKlasy(uczen uczen, Klasa klasa){
        klasa.dodajUczniaDoKlasy(uczen);
    }

    @Override
    public String toString() {
        return "Szkola{" +
                "nazwaSzkoly='" + nazwaSzkoly + '\'' +
                ", uczniowie=" + uczniowie +
                ", klasa=" + klasa +
                '}';
    }
}

import java.util.ArrayList;

/**
 * afjbe
 */
public class Klasa {
    private String nazwaKlasy;
    private ArrayList<uczen> uczniowie;
    private nauczyciele wychowawca;

    public Klasa(String nazwaKlasy) {
        this.nazwaKlasy = nazwaKlasy;
        uczniowie=new ArrayList<>();
    }

    public Klasa(String nazwaKlasy, nauczyciele wychowawca) {
        this.nazwaKlasy = nazwaKlasy;
        this.wychowawca = wychowawca;
        uczniowie=new ArrayList<>();
    }

    public void dodajUczniaDoKlasy(uczen uczen) {
        if (uczniowie.contains(uczen)) {
            System.out.println(uczen + "Jest juz w tej klasie");
        } else {
            uczniowie.add(uczen);
        }
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwaKlasy='" + nazwaKlasy + '\'' +
                ", wychowawca=" + wychowawca +
                ", uczniowie=" + uczniowie +
                '}';
    }
}import java.util.ArrayList;

/**
 * afjbe
 */
public class Klasa {
    private String nazwaKlasy;
    private ArrayList<uczen> uczniowie;
    private nauczyciele wychowawca;

    public Klasa(String nazwaKlasy) {
        this.nazwaKlasy = nazwaKlasy;
        uczniowie=new ArrayList<>();
    }

    public Klasa(String nazwaKlasy, nauczyciele wychowawca) {
        this.nazwaKlasy = nazwaKlasy;
        this.wychowawca = wychowawca;
        uczniowie=new ArrayList<>();
    }

    public void dodajUczniaDoKlasy(uczen uczen) {
        if (uczniowie.contains(uczen)) {
            System.out.println(uczen + "Jest juz w tej klasie");
        } else {
            uczniowie.add(uczen);
        }
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwaKlasy='" + nazwaKlasy + '\'' +
                ", wychowawca=" + wychowawca +
                ", uczniowie=" + uczniowie +
                '}';
    }
}
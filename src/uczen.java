public class uczen extends osoba{
    //poniewaz czen ma te same wlasnosci co klasa to bedzie klasa podobna do klasy osoba
    //klasa osona bedzie klasa bazowa

    private int numerEwidencyjny;
    static int liczbaObiektow;

    public uczen(String imie, String nazwisko, int wiek, int numerEwidencyjny) {
        super(imie, nazwisko, wiek);
        //wywolanie konstruktora klasy bazowej
        this.numerEwidencyjny = numerEwidencyjny;
        liczbaObiektow++;
    }

    public uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaObiektow++;
        numerEwidencyjny = liczbaObiektow;

    }

    @Override
    public String toString() {
        return "uczen{" +
                "imie "+getImie()+" Nazwisko "+getNazwisko()+
                " numerEwidencyjny=" + numerEwidencyjny +
                '}';
    }
}

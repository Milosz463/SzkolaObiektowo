import java.util.Scanner;

public abstract class osoba {
    //klasa abstrakcyjna
    /*
    Nie mozna utworzyc obiektu tej klasy
    klasa jest wykorzystywana w dziedziczeniu
     */
    private String imie;
    private String nazwisko;
    private int wiek;
    //prywatne wlasnosci sa dostepne tylko w tej klasie

    //konstruktr to metoda wywolywania w momencie tworzenia obiektu


    public osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        //Przypisz do wlasnosci klasy imie(this wskazuje na ten
        //imie ktore jest parametrem tej metody
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    //przeciazanie konstruktora

    public osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek=7;//jezeli nie ma lokalnie zmiennej g to nie ma pola klasy
    }

    public osoba() {
        imie="";
        nazwisko="";
        wiek=0;
    }

    //metody dostepowe
    //gettery i settery
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        //wpisywanie hasla z klawiatury
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj haslo");
        String haslo= scanner.next();
        //jezeli haslo z klawiatury qwe123 to zmien w przeciwnym wypadku komunikat
        if(haslo.equals("qwe123")) {
            this.imie = imie;
        }else{
            System.out.println("nie mozesz zmienic imienia");
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}

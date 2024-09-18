public class osoba {
    String imie;
    String nazwisko;
    int wiek;

    //konstruktr to metoda wywolywania w momencie tworzenia obiektu


    public osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        //Przypisz do wlasnosci klasy imie(this wskazuje na ten
        //imie ktore jest parametrem tej metody
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
}

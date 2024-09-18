import java.util.Scanner;

public class osoba {
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
}

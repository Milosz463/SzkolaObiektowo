public class Main {
    public static void main(String[] args) {


        System.out.println("Liczba uczniow"+uczen.liczbaObiektow);
        uczen uczen=new uczen("Daniel","Nowy");
        System.out.println("Liczba uczniow"+uczen.liczbaObiektow);
        uczen uczen2=new uczen("Daniela", "Nowa");
        System.out.println("Liczba uczniow"+uczen.liczbaObiektow);
        uczen uczen3=new uczen("Daniello", "Stary");
        System.out.println("Liczba uczniow"+uczen.liczbaObiektow);
     System.out.println(uczen2);
     nauczyciele nauczyciel=new nauczyciele("Marlena", "Slowik", "matematyka");
     System.out.println(nauczyciel);

        Klasa klasa3a=new Klasa("3a_progrmaisci", nauczycielSlowik );
     klasa3a.dodajUczniaDoKlasy(uczen);
     klasa3a.dodajUczniaDoKlasy(uczen2);
     klasa3a.dodajUczniaDoKlasy(uczen3);
        System.out.println(klasa3a);

        Szkola zs10=Szkola.getSzkola();//metody statyczne wywolujemy dla klas


            }
}

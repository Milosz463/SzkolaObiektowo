public class Main {
    public static void main(String[] args) {

       osoba osobaJas=new osoba("Jas","Sliweczka", 10);

        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Jan");

        osoba osobaAla=new osoba("Ala", "Fala");
        System.out.println(osobaJas.getWiek());
        System.out.println(osobaAla.getWiek());
        osoba osobaX=new osoba();

        System.out.println(osobaJas);
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


            }
}
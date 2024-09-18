public class Main {
    public static void main(String[] args) {

       osoba osobaJas=new osoba("Jas","Sliweczka", 7);

       //niezgodne z regula hermentacji
        System.out.println(osobaJas.imie);
        System.out.println(osobaJas.nazwisko);
        osobaJas.imie="Janek";
        System.out.println(osobaJas.imie);
        //hermentyzacja
        //powinno byc tak ze program glowny nie mogl zmieniac wlasnosci
    }
}
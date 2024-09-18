public sealed class nauczyciele extends osoba implements dyzurny permits wychowawca{
    //sealed ograniczenie dziedziczenia
    //permits jaka klasa moze dziedziczyc
private String przedmiot;

    public nauczyciele(String imie, String nazwisko, String przedmiot) {
        super(imie, nazwisko);
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "nauczyciele{" + "imie "+getImie()+" Nazwisko "+getNazwisko()+
                "przedmiot='" + przedmiot + '\'' +
                '}';
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Spacer po korytarzu");
    }
}

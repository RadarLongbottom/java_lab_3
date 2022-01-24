public class Pracownik extends Osoba {
    protected String stanowisko;
    protected int zarobki;




    public Pracownik(String imię, String nazwisko, int wiek, String stanowisko, int zarobki){
        super(imię, nazwisko, wiek);
        this.stanowisko = stanowisko;
        this.zarobki = zarobki;
    }
    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
    public int getZarobki() {
        return zarobki;
    }

    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }
@Override
    public String toString(){
        return "Pracownik: " + "\n" + super.imię + " " + super.nazwisko + " Lat: " + super.wiek + " Stanowisko: " + stanowisko + " Zarobki brutto: " + zarobki;
}


}

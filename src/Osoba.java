public class Osoba {
    public String imię;
    public String nazwisko;
    public int wiek;

    public Osoba(String imię, String nazwisko, int wiek){
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override

    public String toString(){
        return "Osoba: " + "\n" + imię + " " + nazwisko + " Lat: " + wiek;
    }


}


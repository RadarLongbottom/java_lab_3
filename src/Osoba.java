public class Osoba {
    private String imię;
    private String nazwisko;
    private Integer indeks;

    public Osoba(String imie, String nazwisko, Integer indeks){
        this.imię = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    private String getImię(){
        return imię;
    }
    private String getNazwisko(){
        return nazwisko;
    }
    private Integer getIndeks(){
        return indeks;
    }

    public void setImię(String imię){
        this.imię = imię;
    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public void setIndeks(Integer indeks){
        this.indeks = indeks;
    }
    public void show(){
        System.out.println("Imię osoby: " + imię + " Nazwisko osoby: " + nazwisko + " Numer indeksu: " + indeks);
    }

    @Override
    public String toString() {
        return imię + " " + nazwisko + " (" + indeks + ")";
    }
}


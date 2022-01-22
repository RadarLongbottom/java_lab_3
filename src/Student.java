public class Student {
    private Osoba osoba;
    private WydziałEnum wydział;
    public Student(Osoba osoba, WydziałEnum wydział) {
        this.osoba = osoba;
        this.wydział = wydział;
    }
    public Osoba getOsoba(){
        return osoba;
    }

    public WydziałEnum getWydział() {
        return wydział;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public void setWydział(WydziałEnum wydział) {
        this.wydział = wydział;
    }

    @Override
    public String toString() {
        return "Student " + osoba + " Wydział: " + wydział.toString();
    }
}





import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        ArrayList<Student> studenci = new ArrayList<>();
        studenci.add(new Student( new Osoba("Aleksander", "Skierka", 60726), WydziałEnum.Informatyczny));
        studenci.add(new Student( new Osoba("Michał", "Karolak", 66325), WydziałEnum.Filologiczny));
        studenci.add(new Student( new Osoba("Katarzyna", "Stark", 70666), WydziałEnum.Filologiczny));
        studenci.add(new Student( new Osoba("Julita", "Raskolnikow", 59426), WydziałEnum.Nawigacyjny));
        studenci.add(new Student( new Osoba("Krzysztof", "Nowak", 42506), WydziałEnum.Matematyczny));

        for (Student student:studenci){
            System.out.println(student.toString());
        }
    }
}

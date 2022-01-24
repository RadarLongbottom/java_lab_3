import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        Osoba osoba = new Osoba("Aleksander", "Skierka", 21);
        System.out.println(osoba.toString());
        System.out.println("Klient: " + osoba);

        System.out.println();
        Pracownik pracownik = new Pracownik("Michał", "Kowalski", 34, "Tester oprogramowania", 11300);
        Pracownik pracownik1 = new Pracownik("Daniel", "Woźniak", 38, "Prezes zarządu", 14000);
        System.out.println(pracownik);
        System.out.println(pracownik1);
        Osoba osoba1 = new Osoba("Marcelina", "Nowak", 68);
        System.out.println(osoba1.toString());
        System.out.println("Pracownik emerytowany: " + osoba1);


        List<Osoba> osobaList = new ArrayList<>();
        osobaList.add(osoba);
        osobaList.add(pracownik);
        osobaList.add(pracownik1);
        osobaList.add(osoba1);
        System.out.println(osobaList);
    }
}

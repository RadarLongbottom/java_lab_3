import jdk.swing.interop.SwingInterOpUtils;
import javax.swing.*;

import java.util.Scanner;

enum Liczby{
    Jeden, Dwa, Trzy, Cztery, Pięć, Sześć;
}
enum StatusEnum{
    Kontynuujemy, Koniec
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 1: ");
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        while(x > 0){
            System.out.println("true");
            x++;
        }

        switch (scan.nextInt()){
            case 0:
                System.out.println((StatusEnum.Koniec.toString()));
                break;
            case 1:
                System.out.println(Liczby.Jeden.toString());
                System.out.println(StatusEnum.Kontynuujemy.toString());
                break;
            case 2:
                System.out.println(Liczby.Dwa.toString());
                System.out.println(StatusEnum.Kontynuujemy.toString());
                break;
            case 3:
                System.out.println(Liczby.Trzy.toString());
                System.out.println(StatusEnum.Kontynuujemy.toString());
                break;
            case 4:
                System.out.println(Liczby.Cztery.toString());
                System.out.println(StatusEnum.Kontynuujemy.toString());
                break;
            case 5:
                System.out.println(Liczby.Pięć.toString());
                System.out.println(StatusEnum.Kontynuujemy.toString());
                break;
            case 6:
                System.out.println(Liczby.Sześć.toString());
                System.out.println(StatusEnum.Kontynuujemy.toString());
                break;

        }
        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
         * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

    }
}

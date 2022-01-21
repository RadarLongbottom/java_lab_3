import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        List<Student> studentList = new ArrayList<>();

        Student Aleksander = new Student();
        Aleksander.name = "Aleksander";
        Aleksander.surname = "Skierka";
        Aleksander.age = 22;
        Aleksander.studyingstatus = true;
        studentList.add(Aleksander);

        Student Katarzyna = new Student();
        Katarzyna.name = "Katarzyna";
        Katarzyna.surname = "Stark";
        Katarzyna.age = 19;
        Katarzyna.studyingstatus = true;
        studentList.add(Katarzyna);

        Student Marek = new Student();
        Marek.name = "Marek";
        Marek.surname = "Kozłowski";
        Marek.age = 26;
        Marek.studyingstatus = false;
        studentList.add(Marek);

        for (Student s : studentList) {
            System.out.println(s.name + " " + s.surname + " " + s.age + " lat. " + "Is he active student? " + s.studyingstatus);
        }
    }
}

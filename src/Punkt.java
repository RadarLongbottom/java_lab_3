/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */
private int pX,  pY, pZ;
    /* stworzyć
        a) pusty konstruktor,*/
        Punkt(){
        }
        //b) konstruktor inicjalizujacy zmienną pX,
        Punkt(int pX) {
            this.pX = pX;

        }
        //c) konstruktor inicjalizujący wszystkie zmienne,
        Punkt(int pX, int pY, int pZ){
            this.pX = pX;
            this.pY = pY;
            this.pZ = pZ;
        }

    public int getpX() {
        return pX;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public int getpY() {
        return pY;
    }

    public void setpY(int pY) {
        this.pY = pY;
    }

    public int getpZ() {
        return pZ * 10;
    }

    public void setpZ(int pZ) {
        this.pZ = pZ;
    }
    public int suma() {
            return pX + pY + pZ;
    }
    public int przeciążonaróżnica() {
            return pZ-pY-pX;
    }
    public int różnica(int pX, int pY, int pZ) {
            return pZ - pY - pX;
    }
    public void show() {
        System.out.println(przeciążonaróżnica() + różnica(3, 7, 15));
    }
    public void show1() {
        System.out.println(suma());
    }
    public void show2() {
        System.out.println(przeciążonaróżnica());
    }
    public void show3() {
        System.out.println(różnica(3, 7, 15));
    }

    @Override
    public String toString() {
            return "Punkt{" +
                    "pX=" + pX +
                    ", pY=" + pY +
                    ", pZ=" + pZ +
                    "}";
    }
    //d) stworzyć settery i gettery,
        //e) getter do zmiennej pZ niech zwraca return pZ * 10;

        //podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        //konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...


    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
}

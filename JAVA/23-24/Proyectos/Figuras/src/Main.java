import figuras.*;
public class Main {
    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado(10);
        Cubo cb1 = new Cubo(6, 10);

        System.out.println("Cuadrdo AL=" + c1.areaLateral() + " m2");
        System.out.println("Cubo AL=" + cb1.areaLateral() + " m2");
    }
}
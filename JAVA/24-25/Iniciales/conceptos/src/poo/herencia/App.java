package poo.herencia;
import poo.herencia.*;




public class App {
    

    public static void main (String[] args){

       Coche c1 = new Coche("Audi","A3",4,230,180, 2);
       Coche c2 = new Coche("Mercedes","CLA200",4,250,200, 4);
       c1.recorre(100);
       c2.recorre(200);
       c1.recorre(300);
       c2.recorre(50);
       c2.recorre(200);
       Coche c3 = new Coche();
       System.out.println(c3);

    }

   
}
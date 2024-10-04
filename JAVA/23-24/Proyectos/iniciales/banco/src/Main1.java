
import personas.Persona;
import cuentas.*;

import cuentas.Cuenta;
import cuentas.Ahorro;


public class Main1 {
    public static void main(String[] args) {


        Persona ana = new Persona("abc123", "ana Lopez", 17, 3);
        Persona juan = new Persona("abc124", "juan Snachez", 45, 5);
        Persona maria = new Persona("abc125", "Maria Salas", 57, 2);
        

        if (ana.getEdad()>16){
            Cuenta c1 = new Cuenta("es34-0023");
            c1.setTitular(ana);
           // c1.setTipo("ahorro");
            c1.setSaldo(100);
            c1.ingreso(100);
            c1.retirada(23);
            System.out.println("iban: " + c1.getIban());
            System.out.println("Titular c1: " + c1.getTitular().getNombre() + ' ' + c1.getTitular().getEdad());
            System.out.println("saldo: " + c1.getSaldo());
            System.out.println("tipo: " + c1.getTipo());



            Ahorro a1 = new Ahorro("es40-0987", 200);
           // System.out.println(a1.toString());
        }



    }
}
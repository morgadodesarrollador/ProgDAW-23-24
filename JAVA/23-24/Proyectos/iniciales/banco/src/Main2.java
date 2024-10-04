
import personas.Persona;
import cuentas.*;

import cuentas.Cuenta;
import cuentas.Ahorro;

public class Main2 {
    public static void main(String[] args) {
        int saldo = 0;
        Persona ana = new Persona("abc123", "ana Lopez", 17, 3);
        Persona juan = new Persona("abc124", "juan Snachez", 45, 5);
        Persona maria = new Persona("abc125", "Maria Salas", 57, 2);
        System.out.println("Ana tiene " + ana.cuentas.length + " cuentas abiertas");
        System.out.println("Juan tiene " + juan.cuentas.length + " cuentas abiertas");
        System.out.println("Maria tiene " + maria.cuentas.length + " cuentas abiertas");
        ana.cuentas[0] = new Cuenta("aaa-1");
        ana.cuentas[1] = new Cuenta("aaa-2");
        ana.cuentas[2] = new Cuenta("aaa-3");

        for (int i = 0; i < ana.cuentas.length; i++) {
            saldo = saldo + ana.cuentas[i].getSaldo();
            System.out.println("iban de la cuenta " + i + " de Ana es " + ana.cuentas[i].getIban() );
        }
        System.out.println("Ana tiene enb total " + saldo + " euros");
        

        // if (ana.getEdad()>16){
        //     Cuenta c1 = new Cuenta("es34-0023");
        //     c1.setTitular(ana);
        //    // c1.setTipo("ahorro");
        //     c1.setSaldo(100);
        //     c1.ingreso(100);
        //     c1.retirada(23);
        //     System.out.println("iban: " + c1.getIban());
        //     System.out.println("Titular c1: " + c1.getTitular().getNombre() + ' ' + c1.getTitular().getEdad());
        //     System.out.println("saldo: " + c1.getSaldo());
        //     System.out.println("tipo: " + c1.getTipo());



        //     Ahorro a1 = new Ahorro("es40-0987", 200);
        //    // System.out.println(a1.toString());
        // }



    }
}
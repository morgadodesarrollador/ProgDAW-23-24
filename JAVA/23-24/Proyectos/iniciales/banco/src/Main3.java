
import personas.Persona;
import cuentas.*;

import cuentas.Cuenta;
import cuentas.Ahorro;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int saldo = 0;
        String nombre = "";
        String dni = "";
        int edad = 0;
        int NCtas = 0;
        Scanner entrada = new Scanner(System.in);
        Persona[] clientes = new Persona[3];

        clientes[0] = new Persona("abc123", "ana Lopez", 17, 3);
        clientes[1] = new Persona("abc124", "juan Snachez", 45, 5);;
        clientes[2] = new Persona("abc125", "Maria Salas", 57, 2);

        for (int i=0; i<clientes.length; i++) {
            
            System.out.println("Datos Cliente " + (i+1));
            System.out.println("-------------");
            System.out.print("\t Nombre: ");
            nombre = entrada.next();
            System.out.print("\t Dni: ");
            dni = entrada.next();
            System.out.print("\t Edad: ");
            edad = entrada.nextInt();
            System.out.print("\t Numero de Cuentas: ");
            NCtas = entrada.nextInt();
            clientes[i] = new Persona(dni, nombre, edad, NCtas);
            String iban = "";
            System.out.println("Cuentas de " + clientes[i].getNombre());
            for (int j=0; j<clientes[i].cuentas.length; j++){
                //solicitando los datos de una cuenta --> iban, saldo, tipo
                System.out.print("Iban Cuenta " + (j + 1));
                iban = entrada.next();
                System.out.print("Saldo Cuenta " + (j + 1));
                saldo = entrada.nextInt();
                clientes[i].cuentas[j] = new Cuenta(iban, saldo);
            }
        }




        for (int i=0; i< clientes.length; i++ ){
            System.out.println(clientes[i].getNombre() + " tiene " + clientes[i].cuentas.length + " cuentas abiertas");

        }
      

        // System.out.println("Ana tiene " + ana.cuentas.length + " cuentas abiertas");
        // System.out.println("Juan tiene " + juan.cuentas.length + " cuentas abiertas");
        // System.out.println("Maria tiene " + maria.cuentas.length + " cuentas abiertas");
        // ana.cuentas[0] = new Cuenta("aaa-1");
        // ana.cuentas[1] = new Cuenta("aaa-2");
        // ana.cuentas[2] = new Cuenta("aaa-3");

        // for (int i = 0; i < ana.cuentas.length; i++) {
        //     saldo = saldo + ana.cuentas[i].getSaldo();
        //     System.out.println("iban de la cuenta " + i + " de Ana es " + ana.cuentas[i].getIban() );
        // }
        // System.out.println("Ana tiene enb total " + saldo + " euros");
        

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
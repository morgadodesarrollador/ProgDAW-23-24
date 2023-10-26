
import personas.Persona;
import cuentas.*;

import cuentas.Cuenta;
import cuentas.Ahorro;
import java.util.Scanner;

public class Main {
    Scanner entrada = new Scanner(System.in);
    
  
    public static void main(String[] args) {
       
        Persona[] clientes = new Persona[3];
        clientes[0] = new Persona("abc123", "ana Lopez", 17, 3);
        clientes[1] = new Persona("abc124", "juan Snachez", 45, 5);;
        clientes[2] = new Persona("abc125", "Maria Salas", 57, 2);

        clientes[0].cuentas[0] = new Cuenta("aaa-1", 1000, clientes[0]);
        clientes[0].cuentas[1] = new Cuenta("aaa-2", 500, clientes[0]);
        clientes[0].cuentas[2] = new Cuenta("aaa-3", 3200, clientes[0]);

        clientes[1].cuentas[0] = new Cuenta("aaa-4", 2000,  clientes[1]);
        clientes[1].cuentas[1] = new Cuenta("aaa-5", 1300, clientes[1]);
        clientes[1].cuentas[2] = new Cuenta("aaa-6", 100, clientes[1]);
        clientes[1].cuentas[3] = new Cuenta("aaa-7", 600, clientes[1]);
        clientes[1].cuentas[4] = new Cuenta("aaa-8", 1800, clientes[1]);

        clientes[2].cuentas[0] = new Cuenta("aaa-9", 12000, clientes[2]);
        clientes[2].cuentas[1] = new Cuenta("aab-1", 5500, clientes[2]);

        for (int i = 0; i<clientes.length; i++){
            System.out.println(clientes[i].getNombre() + " : \n"+
            "--------------------------------------------\n" 
                + "\tSTotal: " + clientes[i].saldoTotal() + "€\n" 
                + "\tSMax: " + clientes[i].saldoMaximo().getIban() + "  "  
                                    + clientes[i].saldoMaximo().getSaldo()
                
            ) ;
            
        }
        // int i = 0;
        // while (i<clientes.length){
        //     System.out.println(clientes[i].getNombre() + " tiene " 
        //                         + clientes[i].saldoTotal() + "€");
        //     i++;    
        // }
    }
}
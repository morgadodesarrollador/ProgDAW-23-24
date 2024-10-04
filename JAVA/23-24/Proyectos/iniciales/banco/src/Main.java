
import personas.Persona;
import cuentas.*;

import cuentas.Cuenta;
import cuentas.Ahorro;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int max = 0;
        int pcte; 
        int num = 0; //nctas con saldo > 2000eu
        int cantidad = 0;
        Cuenta cuentaSel = null;

        Persona[] clientes = new Persona[3];
        Cuenta[] cuentas = new Cuenta[15];
        clientes[0] = new Persona("abc123", "ana Lopez", 17, 3);
        cuentas[0] = new Cuenta("aaa-1", 1000, clientes[0]);
        cuentas[1] = new Cuenta("aaa-2", 500, clientes[0]);
        cuentas[2] = new Cuenta("aaa-3", 13200, clientes[0]);
        clientes[0].cuentas[0] = cuentas[0];
        clientes[0].cuentas[1] = cuentas[1];
        clientes[0].cuentas[2] = cuentas[2];

        clientes[1] = new Persona("abc124", "Maria Garcia", 45, 5);
        cuentas[3] = new Cuenta("aaa-4", 2000,  clientes[1]);
        cuentas[4] = new Cuenta("aaa-5", 330000, clientes[1]);
        cuentas[5] = new Cuenta("aaa-6", 100, clientes[1]);
        cuentas[6] = new Cuenta("aaa-7", 600000, clientes[1]);
        cuentas[7] = new Cuenta("aaa-8", 1800, clientes[1]);
        clientes[1].cuentas[0] = cuentas[3];
        clientes[1].cuentas[1] = cuentas[4];
        clientes[1].cuentas[2] = cuentas[5];
        clientes[1].cuentas[3] = cuentas[6];
        clientes[1].cuentas[4] = cuentas[7];

        clientes[2] = new Persona("abc125", "Maria Salas", 57, 2);
        cuentas[8] = new Cuenta("aaa-9", 1200, clientes[2]);
        cuentas[9] = new Cuenta("aaa-10", 5500, clientes[2]);
        clientes[2].cuentas[0] = cuentas[8];
        clientes[2].cuentas[1] = cuentas[9];

        max = cuentas[0].getSaldo();
        cuentaSel = cuentas[0];
        for (int i = 0; i < cuentas.length; i++){
            System.out.println(i + " --> " +cuentas[i].getIban() + "- " +cuentas[i].getSaldo() + "- "+cuentas[i].getTitular().getNombre());
            // if (cuentas[i].getSaldo() > max){
            //     max = cuentas[i].getSaldo();
            //     cuentaSel = cuentas[i];
            // }
        }
        // System.out.println("La cuenta " + cuentaSel.getIban() + " tiene un saldo Max = " + cuentaSel.getSaldo() );
        // System.out.println("y su titular es " + cuentaSel.getTitular().getNombre());
        


        
    }
}
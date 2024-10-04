
import personas.Persona;
import cuentas.*;

import cuentas.Cuenta;
import cuentas.Ahorro;
import java.util.Scanner;

public class Main4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int max = 0;
        int pcte; 
        int num = 0; //nctas con saldo > 2000eu
        int cantidad = 0;
        Cuenta cuentaSel = null;

        Persona[] clientes = new Persona[3];
        clientes[0] = new Persona("abc123", "ana Lopez", 17, 3);
        clientes[1] = new Persona("abc124", "Maria Garcia", 45, 5);;
        clientes[2] = new Persona("abc125", "Maria Salas", 57, 2);

        clientes[0].cuentas[0] = new Cuenta("aaa-1", 1000, clientes[0]);
        clientes[0].cuentas[1] = new Cuenta("aaa-2", 500, clientes[0]);
        clientes[0].cuentas[2] = new Cuenta("aaa-3", 13200, clientes[0]);
        

        clientes[1].cuentas[0] = new Cuenta("aaa-4", 2000,  clientes[1]);
        clientes[1].cuentas[1] = new Cuenta("aaa-5", 330000, clientes[1]);
        clientes[1].cuentas[2] = new Cuenta("aaa-6", 100, new Persona("abc124", "Maria Lopez", 45, 5));
        clientes[1].cuentas[3] = new Cuenta("aaa-7", 600000, new Persona("abc124", "Maria Lopez", 45, 5));
        clientes[1].cuentas[4] = new Cuenta("aaa-8", 1800, clientes[1]);

        clientes[2].cuentas[0] = new Cuenta("aaa-9", 12000, clientes[2]);
        clientes[2].cuentas[1] = new Cuenta("aab-1", 55000, clientes[2]);

        max = clientes[0].cuentas[0].getSaldo();
        cuentaSel = clientes[0].cuentas[0];
        for (int i=0; i<clientes.length; i++){
            for (int j=0; j<clientes[i].cuentas.length; j++){
                if (clientes[i].cuentas[j].getSaldo() > max){
                    max = clientes[i].cuentas[j].getSaldo();
                    cuentaSel = clientes[i].cuentas[j];
                }
            }
        }
        System.out.println(cuentaSel.getIban() + " con saldo " + cuentaSel.getSaldo());
        System.out.println(" y pertenece a " + cuentaSel.getTitular().getNombre());


        //Cuantas cuentas tienen mas de "cantidad €"
        //-------------------------------------------
        // System.out.print("Cantidad a Consultar: ");
        // cantidad = entrada.nextInt();

        // for (int i = 0; i<clientes.length; i++){
        //     for (int j=0; j<clientes[i].cuentas.length; j++){
        //         if (clientes[i].cuentas[j].getSaldo() > cantidad){
        //             num++;
        //         }
        //     }
        // }
        // System.out.println(num + " cuentas con saldo > " + cantidad);

        // max = clientes[0].saldoMaximo().getSaldo();
        // pcte = 0;
        // for (int i = 1; i<clientes.length; i++) {
        //     if (max < clientes[i].saldoMaximo().getSaldo()){
        //         max = clientes[i].saldoMaximo().getSaldo();
        //         pcte = i;
        //     }
        // }
        // System.out.println("Nombre " + clientes[pcte].getNombre());
        
        
        // for (int i = 0; i<clientes.length; i++){
        //     System.out.println(clientes[i].getNombre() + " : \n"+
        //     "--------------------------------------------\n" 
        //         + "\tSTotal: " + clientes[i].saldoTotal() + "€\n" 
        //         + "\tSMax: " + clientes[i].saldoMaximo().getIban() + "  "  
        //                             + clientes[i].saldoMaximo().getSaldo()
                
        //     ) ;
            
        // }
        
        
    }
}
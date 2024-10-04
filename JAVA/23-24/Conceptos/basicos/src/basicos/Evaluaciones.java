package basicos;

import java.util.Scanner;

public class Evaluaciones {

    public String[] modulos = {
        "Programacion", "Sistemas Informáticos", "Entornos de Desarrollo",
        "Lenguaje de Marcas", "Bases de Datos", "Redes"};
    public String[] alumnos = {"Ana", "Juan", "Maria", "Pedro", "Alfredo"};
            
    public String[] alumnos1 = new String[3];

    //public double[] notas = new double[6];

    public double[][] notas1 = new double[this.alumnos.length][this.modulos.length];
    public double[][] notas;

    Scanner entrada = new Scanner(System.in);
    
    public Evaluaciones(){
        this.notas = new double[this.alumnos.length][this.modulos.length];
        
        //this.leerAlumnos();
        this.leerNotas();
      //  this.imprimirNotas();
    }

    public void leerNotas(){
        //leo
        for(int i = 0; i < this.alumnos.length; i++){
            System.out.println("Notas de " + this.alumnos[i]);
            System.out.println("-------------------------------");
            for (int j=0; j<this.modulos.length; j++){
                System.out.print("["+this.modulos[j]+"]: ");
                notas[i][j] = entrada.nextDouble();
            }
        }
        //imprime
        for (int j=0; j<this.modulos.length; j++){
            System.out.print(this.modulos[j]+ "\t");
        }
        for(int i = 0; i < this.alumnos.length; i++){
            System.out.print(this.alumnos[i] + "\t");
            for (int j=0; j<this.modulos.length; j++){
                System.out.print((int)notas[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    public void leerAlumnos(){
        for (int i = 0; i<this.alumnos1.length; i++){
            System.out.print("Alumno " + (i+1) + " : ");
            alumnos1[i] = entrada.next();
        }
        for (int i = 0; i<this.alumnos.length; i++){
            System.out.print(alumnos[i] + " ");
        }
        System.out.println("");
    }
    // public void leerNotas1(){
    //     for (int i = 0; i < this.modulos.length; i++){
    //         System.out.print("Nota en " + modulos[i] + " : ");
    //         notas1[i] = entrada.nextDouble();
    //     }  
    // }
    public void imprimirNotas(){
        for (int i=0; i < this.modulos.length; i++){
            System.out.println(modulos[i] + " = " + notas[i]);
        }
    }
}

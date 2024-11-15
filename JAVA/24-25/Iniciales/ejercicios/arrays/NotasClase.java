package arrays;
import java.util.Scanner;

public class NotasClase {
    public static Scanner entrada = new Scanner(System.in); 
    static int ALUMNOS = 5;
    static int MODULOS = 4;
    static String[] alumnos = { "Jose", "Ana", "Maria", "Luis", "Noelia" };
    static String[] modulos = { "Programacion", "Redes", "BDatos",  "DWebServidor" };
    static double[][] notas = new double[ALUMNOS][MODULOS];
    // i --> filas
    // j --> columnas

    public static void main(String[] args){
        // Notas.LecturaNotas();
        // Notas.ImprimirNotas();

        NotasClase.GenerarNotas();
        NotasClase.ImprimirNotasTabla();
        //1- Quien aprueba un modulo
        // System.out.print("Modulo ? : ");
        // String modulo = NotasClase.entrada.nextLine(); 
        //imprimirDatos(quienAprueba("Redes"));
        
        //2-. modulosAprueba(persona) ---> array Módulos que aprueban
        imprimirDatos(modulosAprueba("Maria"));
        
        
    }

    public static String[] modulosAprueba(String persona){
        int Iper = getIndexPersona(persona);
        String[] modulos = new String[MODULOS]; //respuesta
        if (Iper != -1){ //si esta la persona
            for (int i=0; i<MODULOS; i++){
                if (NotasClase.notas[Iper][i] > 5){
                    modulos[i] = NotasClase.modulos[i]; 
                }
            }
        }
        System.out.print(persona  + " aprueba los modulos : ");
        return modulos;
    }
    public static String[] quienAprueba(String modulo){

        String[] personas = new String[ALUMNOS]; 
        int Jmod = getIndexModulo(modulo);

        if (Jmod != -1){
            for (int i=0; i<ALUMNOS; i++){
                if (NotasClase.notas[i][Jmod] > 5){
                    personas[i] = alumnos[i];
                }
            }   
        }
        
        System.out.print("Quien aprueba " + modulo + " : ");
        return personas;
    }

    public static int getIndexPersona(String persona){
        int index = -1; // sup que no se encuentra
        for(int i=0; (i<ALUMNOS) && (index == -1); i++){ //ejecuto mientras no se encuentre
            if (NotasClase.alumnos[i]== persona){
                index = i;
            }
        }
        // System.out.println(persona + " es " + index);
        return index;
    }
    public static int getIndexModulo(String modulo){
        //dado el nombre de modulo devuelvo su posición (índice)
        int index = -1; //sup que no se encuentra
        for (int i=0; (i<MODULOS) && (index == -1); i++){
            if (NotasClase.modulos[i] == modulo){
                index=i;
            }
        }
        return index;
    }
    
    public static void imprimirDatos(String[] nombres){
        for (int i=0; i<nombres.length; i++){
            if (nombres[i] != null)
                 System.out.print(nombres[i] + ", ");
        }
    }
    public static void GenerarNotas(){
        double temp;
        //recorrido de alumnos
        for (int i=0; i<ALUMNOS; i++){
            for (int j=0; j<MODULOS; j++){
                temp = Math.random()*10;
                NotasClase.notas[i][j]=Math.round(temp*100.00)/100.00;;
            }
        }
    }

    public static void ImprimirNotasTabla(){
        System.out.println("------ LISTADO DE NOTAS --------------");
        System.out.printf("%20s", " ");
        for (int i=0; i<ALUMNOS; i++){
            System.out.printf("%10s", alumnos[i]);
        };
        System.out.println();
        System.out.println();
        for (int j=0; j<MODULOS; j++){
            System.out.printf("%20s", NotasClase.modulos[j]);
            for (int i=0; i<ALUMNOS; i++){
                System.out.printf("%10.2f", NotasClase.notas[i][j]);
            }
            System.out.println();
            System.out.println();
        }
    }

    

}

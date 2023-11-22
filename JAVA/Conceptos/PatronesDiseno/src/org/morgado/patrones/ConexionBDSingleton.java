package org.morgado.patrones;

public class ConexionBDSingleton {
    private static ConexionBDSingleton instancia;
    private ConexionBDSingleton(){
        System.out.println("Conectandose a algun motor de BD:");
    }

    public static ConexionBDSingleton getInstancia(){
        if ( !(instancia instanceof  ConexionBDSingleton))
            ConexionBDSingleton.instancia = new ConexionBDSingleton();
        return instancia;
    }
}

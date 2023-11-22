package org.morgado.patrones;

public class MainSingleton {
    public static void main(String[] args) {
        ConexionBDSingleton conn = null;
        for (int i = 0; i<10; i++){
            conn =  ConexionBDSingleton.getInstancia();
            System.out.println("Conexion = " + conn);
        }
        ConexionBDSingleton conn2 = ConexionBDSingleton.getInstancia();
        ConexionBDSingleton conn3 = ConexionBDSingleton.getInstancia();
        boolean b1 = ( (conn == conn2) && (conn == conn3) && (conn2 == conn3));
        System.out.println("b1="+b1 + " - " + conn + "-"+ conn2+ "-"+conn3);
    }
}

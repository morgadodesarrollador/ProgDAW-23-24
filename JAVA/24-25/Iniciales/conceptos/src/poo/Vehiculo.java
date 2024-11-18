package poo;

public class Vehiculo {
    // una clase contiene propiedades y métodos
    /* 
        //principio de OCULTACIÓN entre clases de la POO
        ambito (prop/met): publib, private, protected
        public: visible a clae cliente y a clase que hereda
        private: oculta a cliente y hereda
        protected: oculta a cliente y visible a hereda
        //Principio de Responsabilidad
        No se deben modificar las propiedades desde el cliente (exterior)
    */

    private String marca;
    private String modelo;

    //métodos getters y setters

    //responsables de modificar las propiedades de clase
    public void setMarca(String marca){
        this.marca = marca.toUpperCase();
    }
    public void setModelo(String modelo){
        this.modelo = modelo.toUpperCase();
    }

    //responsables de leer las propiedades de clase
    public String getMarca(){
        return this.marca.toLowerCase();
    }
    public String getModelo(){
        return this.modelo.toLowerCase();
    }

    //visualización de datos de la clase
    public void Info(){
        System.out.println("Vehiculo: " + this.getMarca() + " " + this.getModelo());
    }

    public String toString(){
        String info = "";
        info = " Vehiculo( " + this.marca + " / " + this.modelo + " )";
        
        return info;
    }




}

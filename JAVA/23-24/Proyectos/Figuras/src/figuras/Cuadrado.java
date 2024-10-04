package figuras;

public class Cuadrado extends Poligono{
    private int lado;

    public Cuadrado(int lado){
        //lado en dm
      //  super();
        this.setLado(lado);
        this.setCaras(1);
    }



    public int getLado() {
        //devolver en cm
        return lado;
    }

    public void setLado(int lado) {
        //se almacena el lado en mm
        this.lado = lado;
    }

    @Override
    public int areaLateral() {
        return (this.getLado() * this.getLado());
    }

    @Override
    public int areaTotal(){
        return areaLateral() * this.getCaras();
    }
}

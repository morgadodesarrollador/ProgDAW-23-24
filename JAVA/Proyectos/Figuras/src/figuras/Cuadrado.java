package figuras;

public class Cuadrado extends Poligono{
    private int lado;
    private int caras;
    public Cuadrado(int lado){
        //lado en dm
        this.setLado(lado);
        this.setCaras(1);
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public int getCaras() {
        return caras;
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

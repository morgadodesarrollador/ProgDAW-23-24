package figuras;

public class Cubo extends Cuadrado{


    public Cubo(int caras, int lado){
        super(lado);
        this.setLado(lado); //super
        this.setCaras(caras); //super
    }

    @Override
    public int areaLateral() {
        int total = 0;
        total = super.areaLateral() * (this.getCaras() - 2);
        return total;
    }

    @Override
    public int areaTotal() {
        int total = 0;
        total = super.areaTotal() * this.getCaras();
        return total;
    }
}

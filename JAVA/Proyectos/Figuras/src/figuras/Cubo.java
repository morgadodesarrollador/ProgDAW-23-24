package figuras;

public class Cubo extends Cuadrado{


    public Cubo(int caras, int lado){
        super(lado);
        super.setLado(lado);
        this.setCaras(caras);
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

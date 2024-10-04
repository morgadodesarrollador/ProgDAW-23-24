package figuras;

public class Triangulo extends Poligono{
    protected int base;
    private int altura;
    public Triangulo (int base, int altura){
        this.setAltura(altura);
        this.setBase(base);
        this.setCaras(1);
    }

    @Override
    public int areaLateral() {
        return this.getBase() * this.getAltura();
    }

    @Override
    public int areaTotal() {
        return this.areaLateral() + this.getCaras(); 
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
}

package figuras;

public class Piramide extends Triangulo{

    public  Piramide(int lado, int caras, int apotema){
        super(lado, apotema); //area del triangulo
        this.setCaras(caras);;
    }

    @Override
    public int areaLateral() {
        return super.areaLateral() * this.getCaras();
    }

    @Override
    public int areaBase(){
        Cuadrado c = new Cuadrado(this.getBase());
        return c.areaBase();

    }

    @Override
    public int areaTotal(){
        return this.areaLateral() + this.areaBase();

    }

}

package cuentas;

public class Ahorro extends Cuenta {
    private int ahorro;

    public Ahorro (String iban, int ahorro){
        super (iban); // new Cuenta(iban)
        this.setAhorro(ahorro);
    }

    public void setAhorro(int ah) {
        this.ahorro = ah;
    }

    public int getAhorro() {
        return this.ahorro;
    }
}

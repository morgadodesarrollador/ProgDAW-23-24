package cuentas;
import personas.Persona;

public class Cuenta {
    private String iban;
    private String tipo;
    private int saldo;
    Persona titular;

    public Cuenta(String iban){
        //this.iban = iban; --> mal
        this.setIban(iban);
        this.setSaldo(0);
        this.setTipo("corriente");
    }

    public void setIban(String iban) {
        //controlar Patrón (exp.regulares) Iban
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }
    public void setTipo(String tipo) {
        if ((tipo == "corriene") || (tipo == "ahorro"))
            this.tipo = tipo;
        else
            System.err.println("Error Cuenta: tipo es corriente/ahorro");
    }

    public String getTipo() {
        return tipo;
    }

    public void setSaldo(int cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Persona getTitular() {
        return titular;
    }

    public void ingreso(int cantidad){
        this.setSaldo(cantidad);
    }
    public void retirada(int cantidad) {
        this.setSaldo(-cantidad);
    }
}

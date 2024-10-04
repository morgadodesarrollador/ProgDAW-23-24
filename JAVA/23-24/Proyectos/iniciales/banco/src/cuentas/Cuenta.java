package cuentas;
import personas.Persona;

public class Cuenta {
    private String iban;
    private String tipo;
    private int saldo;
    Persona titular;

    public Cuenta(String iban, int saldoInicial, Persona propietario){
        //this.iban = iban; --> mal
        this.setIban(iban);
        //valores por defecto saldo y tipo (0, corriente)
        this.setSaldo(saldoInicial);
        this.setTipo("corriente");
        this.titular = propietario;
    }

    public void setIban(String iban) {
        //controlar Patrón (exp.regulares) Iban
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }
    public void setTipo(String tipo) {
        if ((tipo == "corriente") || (tipo == "ahorro"))
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

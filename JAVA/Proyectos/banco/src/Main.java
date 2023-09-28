
import personas.Persona;
import cuentas.Cuenta;
import cuentas.*;

public class Main {
    public static void main(String[] args) {
        Persona ana = new Persona("abc123", "ana", 15);

        if (ana.getEdad()>16){
            Cuenta c1 = new Cuenta("es34-0023");
            c1.setTipo("ahorro");
            c1.ingreso(100);
            c1.setTitular(ana);

        }

    }
}
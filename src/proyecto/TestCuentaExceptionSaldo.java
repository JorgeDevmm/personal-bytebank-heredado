package proyecto;

public class TestCuentaExceptionSaldo {
    public static void main(String[] args) {
        //instanciando aplicando polimorfismo a una instancia de su clase hija
        Cuenta cuenta = new CuentaAhorro(111, 456);

        cuenta.depositar(200);
        System.out.println("mi saldo actual: " + cuenta.getSaldo());

        //tratamos excepcion try catch y no en el mismo main por se considera mala practica
        try {
            cuenta.retirar(180);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("mi saldo final: " + cuenta.getSaldo());

    }
}

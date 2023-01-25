package proyecto;

public class CuentaCorriente extends Cuenta implements Tributacion {

    public CuentaCorriente(int agencia, int numero) {

        super(agencia, numero);
    }

    @Override
    public void depositar(double saldo) {
        super.saldo += saldo;
    }

    @Override
    public void retirar(double valorRetiro) throws SaldoInsuficienteException {
        double comision = 0.2;
        super.retirar(valorRetiro + comision);
    }

    //Implemento de métodos de interface tributación
    @Override
    public double getvalorImpuesto() {
        return super.saldo * 0.20;//obtengo el valor impuesto desde la multiplicación de saldo
    }
}

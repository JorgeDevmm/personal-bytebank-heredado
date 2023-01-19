package proyecto;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int agencia,int numero){

        super(agencia,numero);
    }

    @Override
    public void depositar(double saldo) {

    }

    @Override
    public boolean retirar(double valorRetiro) {
        double comision = 0.2;
        return super.retirar(valorRetiro + comision);
    }

}

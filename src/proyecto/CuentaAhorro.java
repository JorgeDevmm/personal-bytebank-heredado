package proyecto;

public class CuentaAhorro  extends Cuenta{

    public CuentaAhorro(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double saldo) {
        super.saldo += saldo;//accedo al saldo del atributo de clase cuenta por estar en portected
    }


}

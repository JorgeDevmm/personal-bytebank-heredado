package proyecto;//entidad cuenta:

public abstract class Cuenta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();// referencia con objeto tipo cliente, inicializo por defecto un nuevo
    // objeto cliente
    private static int total = 0;

//	constructor pordefecto

    //	public Cuenta() {
//		
//	}
//	
//	constructor	al ser manipulados por parametros
    public Cuenta(int agencia, int numero) {
        this.numero = numero;
        if (agencia <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("Esta es la cuenta N° : " + total);
    }

    //	método que devuelve un valor vacio
    public abstract void depositar(double saldo);

    public boolean retirar(double valorRetiro) {

        if (this.saldo >= valorRetiro) {
            this.saldo -= valorRetiro;
            return true;
        }
        return false;
    }

    public boolean transferir(double transferencia, Cuenta objCuenta) {
        // valido si cuento con saldo mayor a la transferencia
        if (this.saldo >= transferencia) {

            this.retirar(transferencia);
            objCuenta.depositar(transferencia);// puedo reutilizar el método depositar
            return true;
        }
        return false;

    }

    //getters y setters
    public double getSaldo() {
        return this.saldo;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

}
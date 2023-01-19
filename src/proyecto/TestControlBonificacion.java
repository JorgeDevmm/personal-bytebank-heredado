package proyecto;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario jorge = new Contador();
        jorge.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        Contador alexiz = new Contador();
        alexiz.setSalario(5000);
        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(jorge);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexiz);

    }
}

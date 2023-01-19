package proyecto;

import java.net.InetSocketAddress;

public class TestReferencias {

    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Jorge");

        Gerente gerente = new Gerente();
        gerente.setNombre("luisa");

        funcionario.setSalario(2000);

        gerente.setSalario(10000);

        gerente.iniciarSesion("_dddd");

        //instacio clases hijas
        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000);

        //instacio controlBonificacion para acceder al método registrar salario
        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(ev);
        controlBonificacion.registrarSalario(d);


    }
}

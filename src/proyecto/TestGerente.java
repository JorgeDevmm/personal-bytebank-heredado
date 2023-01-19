package proyecto;

public class TestGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        //gerente.setNombre("pepito");

        //Funcionario gerente = new Funcionario();
        gerente.setNombre("pepito");
        gerente.setDocumento("4757252");
        gerente.setSalario(6000);
        gerente.getBonificacion();

        gerente.setClave("admin789");
        gerente.setTipo(1);

        System.out.println("\nNombre : " + gerente.getNombre()
                + "\nDNI : " + gerente.getDocumento()
                + "\nsalario : " + gerente.getSalario()
                + "\nla bonificación : " + gerente.getBonificacion()
                + "\ntotal de pago : " + (gerente.getSalario() + gerente.getBonificacion())
                + "\ninicia sesion : " + gerente.iniciarSesion(gerente.getClave()));


    }


}

package proyecto;

public class TestFuncionario {
    public static void main(String[] args) {

        //instanciando objeto
        Funcionario jorge = new Contador();

        jorge.setNombre("Jorge luis");
        jorge.setDocumento("47551749");
        jorge.setSalario(2000);

        System.out.println("\nMi nombre es = " + jorge.getNombre()
                + "\nmi documento es = " + jorge.getDocumento()
                + "\nmi salario es = " + jorge.getSalario()
                + "\nmi bonificación es = " + jorge.getBonificacion());


    }
}

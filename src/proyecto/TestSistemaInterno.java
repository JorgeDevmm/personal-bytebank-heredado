package proyecto;

public class TestSistemaInterno {

    public static void main(String[] args){
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente = new Gerente();
        Administrador admin = new Administrador();

        //autentificación
        sistema.autentica(gerente);
        sistema.autentica(admin);
    }
}

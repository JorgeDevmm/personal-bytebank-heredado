package proyecto;

public class Gerente extends Funcionario implements Autenticable {
    public double getBonificacion() {
        System.out.println("Ejecutando desde gerente");
        return 2000;//podemos invocar al método bonificación de la clase padre
    }


    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}


